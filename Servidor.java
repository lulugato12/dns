/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Objeto Servidor.
 */
public class Servidor{
  /* variables */
  private String dominio;
  private String ipServidor;
  private String ipDominio;

  /* metodos */

  /* constructor */
  public Servidor(String dominio, String ipDominio, String ipServidor){
    this.dominio = dominio;
    this.ipDominio = ipDominio;
    this.ipServidor = ipServidor;
  }

  /* gets */
  public String getDominio(){
    return dominio;
  }

  public String getIpServidor(){
    return ipServidor;
  }

  public String getIpDominio(){
    return ipDominio;
  }
}
