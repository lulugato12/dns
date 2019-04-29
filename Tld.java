/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Objeto Servidor.
 */
 import java.util.ArrayList;

 public class Tld{
   /* variables */
   private String ip;
   private String tld;
   private ArrayList<Servidor> memoria;

   /* metodos */
   public Tld(String ip, String tld){
     this.ip = ip;
     this.tld = tld;
     memoria = new ArrayList<Servidor>();
   }

   /* agregar servidor */
   public void agregarServidor(Servidor server){
     memoria.add(server);
   }

   public Servidor encontrarServidor(String dominio){
     for(int i = 0; i < memoria.size(); i++){
       if(memoria.get(i).getDominio() == dominio){
         return memoria.get(i);
       }
     }
     return null;
   }

   /* gets*/
   public String getTld(){
     return tld;
   }

   public String getIp(){
     return ip;
   }
 }
