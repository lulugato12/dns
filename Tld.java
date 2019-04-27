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
   String tld;
   ArrayList<Servidor> memoria;

   /* metodos */
   public Tld(String tld){
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
     /* ## revisar que hace en realidad un tld */
     return null;
   }
 }
