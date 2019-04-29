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

  /* metodos */
  /* constructor */
  public Resolver(String ip){
    this.ip = ip;
    r = new Root();
    sitio = new ArrayList<String>();
    ips = new ArrayList<String>();
  }

  /* inicia la busqueda del ip */
  public String encontrarIp(String pagina){
    /* empieza en su memoria */
    for(int i = 0; i < sitio.size(); i++){
      if(sitio.get(i) == pagina){
        return ips.get(i);
      }
    }

    /* llama al root */

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
  private void mensaje(int q, int a, String ipSource, String ipDest){
    System.out.println("+-----------------+-----------------+");
    System.out.print("|"+ipSource);
    for(int i = ipSource.length(); i < 17; i++){
      System.out.print(" ");
    }
    System.out.print("|"+ipDest);
    for(int i = ipDest.length(); i < 17; i++){
      System.out.print(" ");
    }
    System.out.println("|");
    System.out.println("+-----------------+-----------------+");
  }
}
