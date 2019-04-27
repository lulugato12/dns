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
  ArrayList<String> sitio;
  ArrayList<String> ip;

  /* metodos */
  /* constructor */
  public Resolver(){
    sitio = new ArrayList<String>();
    ip = new ArrayList<String>();
  }

  /* inicia la busqueda del ip */
  public String encontrarIp(String pagina, Root r){
    /* empieza en su memoria */
    for(int i = 0; i < sitio.size(); i++){
      if(sitio.get(i) == pagina){
        return ip.get(i);
      }
    }

    /* llama al root */

    return "Algo salio mal";
  }

  /* agregar ip a la memoria del resolver */
  public void agregarIp(String ipAdress, String pagina){
    sitio.add(pagina);
    ip.add(ipAdress);
  }
}
