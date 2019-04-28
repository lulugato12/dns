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
    /* variables menu*/
    Scanner scan = new Scanner(System.in);
    String dominio = "";
    String ip = "";
    String dominioSup = "";
    int opcion = 9999;

    /* resolvedor */
    Resolver r = new Resolver();

    /* desplegar menu */
    do{
      System.out.println("Elige una opcion:\n1. Dar de alta un dominio\n2. Buscar la ip de un dominio\n0. Salir");
      opcion = Integer.parseInt(scan.nextLine());

      switch(opcion){
        case 0:
          /* salir */
          break;
        case 1:
          /* proceso para dar de alta un dominio */
          System.out.println("Escribe el nombre del dominio");
          dominio = scan.nextLine();
          System.out.println("Escribibe el dominio superior");
          dominioSup = scan.nextLine();
          System.out.println("Escribe el IP");
          ip = scan.nextLine();

          Root root = r.getRoot();
          /* asignacion del servidor a la lista del tld */
          switch(dominioSup){
            case "com":
              break;
            case "net":
              break;
            case "org":
              break;
            default:
              System.out.println("El dominio superior no es valido");
          }
          break;
        case 2:
          /* buscar el ip de un dominio */


          break;
        default:
          System.out.println("Opcion no valida.");
      }
    }while(opcion != 0);
  }
}
