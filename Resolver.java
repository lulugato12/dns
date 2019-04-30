/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Objeto Resolver.
 */

import java.util.ArrayList;

public class Resolver{
  /* variables */
  private String ip;
  private Root r;
  private ArrayList<String> sitio;
  private ArrayList<String> ips;
  private int id;

  /* metodos */
  /* constructor */
  public Resolver(String ip){
    this.ip = ip;
    r = new Root("71.128.20.4      ");
    sitio = new ArrayList<String>();
    ips = new ArrayList<String>();
    id = 0;
  }

  /* inicia la busqueda del ip */
  public String encontrarIp(String pagina, String ipH){
    int tempoId = id;
    /* mensaje resolvedor - host*/
    mensaje(ipH, ip, tempoId, 1, 0, pagina);

    /* empieza en su memoria */
    for(int i = 0; i < sitio.size(); i++){
      if(sitio.get(i).equals(pagina)){
        mensaje(ip, ipH, 1, 1, ips.get(i));
        return ips.get(i);
      }
    }

    /* llama al root */
    String dom = pagina.substring(pagina.indexOf(".")+1, (pagina.length()));
    Tld temp = r.getT(dom);

    /* mensaje root - resolvedor */
    mensaje(ip, r.getIp(), id, 1, 0, pagina);
    mensaje(r.getIp(), ip, id, 1, 1, temp.getIp());

    if(temp != null){
      Servidor serv = temp.encontrarServidor(pagina);
      mensaje(ip, temp.getIp(), id, 1, 0, pagina);

      if(serv != null){
        /* mensaje tld - root */
        mensaje(temp.getIp(), ip, id, 1, 1, serv.getIpServidor());

        /* mensaje servidor - resolvedor */
        mensaje(ip, serv.getIpServidor(), id, 1, 0, pagina);
        mensaje(serv.getIpServidor(), ip, id, 1, 1, serv.getDominio());

        /* guardar en cache */
        sitio.add(serv.getDominio());
        ips.add(serv.getIpDominio());

        /* mensaje resolvedor - host*/
        mensaje(ip, ipH, tempoId, 1, 1, serv.getIpDominio());

        return serv.getIpServidor();
      }
    }
    return "Algo salio mal";
  }

  /* agregar ip a la memoria del resolver */
  private void agregarIp(String ipAdress, String pagina){
    sitio.add(pagina);
    ips.add(ipAdress);
  }

  /* get root */
  public Root getRoot(){
    return r;
  }

  /* set root */
  public void setRoot(Root r){
    this.r = r;
  }

  /* mensaje nds */
  private void mensaje(String ipSource, String ipDest, int idT, int q, int a, String texto){
    System.out.println("+-----------------+-----------------+");
    System.out.println("|"+ipSource+"|"+ipDest+"|");
    System.out.println("+-----------------+-----------------+");
    System.out.println("|    id: "+idT+"                          |");
    System.out.println("+-----------------+-----------------+");
    System.out.println("| preguntas: "+q+"    | respuestas: "+a+"   |");
    System.out.println("+-----------------+-----------------+");
    for(int i = texto.length(); i < 33; i++){
      texto+= " ";
    }
    System.out.println("| "+texto+" |");
    System.out.println("+-----------------------------------+");
    id++;
  }
}
