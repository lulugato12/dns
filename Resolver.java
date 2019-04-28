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
  public void agregarIp(String ipAdress, String pagina){
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
}
