/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Objeto Root.
 */
import java.util.ArrayList;

public class Root{
  /* variables */
  private String ip;
  private ArrayList<Tld> tlds;

  /* metodos */
  /* constructor */
  public Root(String ip){
    this.ip = ip;
    tlds = new ArrayList<Tld>();
  }

  /* set tld */
  public void setTld(Tld nuevo, String nombre){
    boolean agregado = false;
    for(int i = 0; i < tlds.size(); i++){
      if(tlds.get(i).getTld().equals(nombre)){
        tlds.set(i, nuevo);
        agregado = true;
      }
    }
    if(!agregado){
      tlds.add(nuevo);
    }
  }

  /* gets*/
  public Tld getT(String nombre){
    for(int i = 0; i < tlds.size(); i++){
      if(tlds.get(i).getTld().equals(nombre)){
        return tlds.get(i);
      }
    }
    return null;
  }

  public String getIp(){
    return ip;
  }
}
