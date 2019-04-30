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
  private ArrayList<Tld> tlds;

  /* metodos */
  /* constructor */
  public Root(){
    tlds = new ArrayList<Tld>();
  }

  /* set tld */
  public void setTld(Tld nuevo, String nombre){
    boolean agregado = false;
    for(int i = 0; i < tlds.size(); i++){
      if(tlds.get(i).getTld() == nombre){
        tlds.set(i, nuevo);
        agregado = true;
      }
    }
    if(!agregado){
      tlds.add(nuevo);
    }
  }

  /* get tld */
  public Tld getT(String nombre){
    for(int i = 0; i < tlds.size(); i++){
      System.out.println(tlds.get(i).getTld());
      if(tlds.get(i).getTld().equals(nombre)){
        return tlds.get(i);
      }
    }
    return null;
  }
}
