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
    /* terminar */
    Tld newTld = new Tld(nombre);
  }

  /* get tld */
  public Tld getT(String nombre){
    /* terminar */
    for(int i = 0; i < tlds.size(); i++){
      if(tlds.get(i).getTld() == nombre){
        return tlds.get(i);
      }
  }
}
