/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Objeto Servidor.
 *
 * Ultima fecha de modificacion:
 * 17-abril-19
 *
 * Falta:
 *
 */
public class Servidor{
  /* variables */
  String dominio;
  String tld;
  String ip;

  /* metodos */

  /* constructor */
  public Servidor(String dominio, String tld, String ip){
    this.dominio = dominio;
    this.tld = tld;
    this.ip = ip;
  }

  /* gets */
  public String getDominio(){
    return dominio;
  }

  public String getTld(){
    return tld;
  }

  public String getIp(){
    return ip;
  }
}
