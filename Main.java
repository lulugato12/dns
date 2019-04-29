/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Simulacion del protocolo de capa 1 DNS.
 * El Main es el browser que busca saber cual es el IP del dominio.
 * Se pueden agregar mas sitios web.
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main{
  public static void main(String[] args) {
    /* variables */
    Scanner scan = new Scanner(System.in);
    String ipHost = "192.168.1.85";

    /* variables menu*/
    String dominio = "";
    String ipDominio = "";
    String ipServidor = "";
    int opcion = 9999;

    /* resolvedor */
    Resolver r = new Resolver("131.98.1.1");

    /* desplegar menu */
    do{
      System.out.println("Elige una opcion:\n1. Dar de alta un dominio\n2. Buscar la ip de un dominio\n3. Agregar tld\n0. Salir");
      opcion = Integer.parseInt(scan.nextLine());

      switch(opcion){
        case 0:
          /* salir */
          break;
        case 1:
          /* proceso para dar de alta un dominio */
          System.out.println("Escribe el nombre del dominio");
          dominio = scan.nextLine();
          System.out.println("Escribe el IP del servidor");
          ipServidor = scan.nextLine();
          System.out.println("Escribe el IP del dominio");
          ipDominio = scan.nextLine();

          /* asignacion del servidor a la lista del tld */
          Root root = r.getRoot();
          Tld temp = root.getT(dominio.substring(dominio.indexOf("."), (dominio.length()-1)));
          temp.agregarServidor(new Servidor(dominio, ipDominio, ipServidor));

          /* guardar cambios en el root */
          r.setRoot(root);
          break;
        case 2:
          /* buscar el ip de un dominio */
          System.out.println("Escribe el nombre del dominio");
          dominio = scan.nextLine();
          r.encontrarIp(dominio);
          break;
        case 3:
        /* agregar tld */

        default:
          System.out.println("Opcion no valida.");
      }
    }while(opcion != 0);
  }
}
