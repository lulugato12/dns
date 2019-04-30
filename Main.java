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
  public static String agregarEspacios(String ip){
    for(int i = ip.length(); i < 17; i++){
      ip+= " ";
    }
    return ip;
  }
  public static void main(String[] args) {
    /* variables */
    Scanner scan = new Scanner(System.in);
    String ipHost = "192.168.1.85     ";
    int contQ = 0;
    int contA = 0;

    /* variables menu*/
    String dominio = "";
    String ipDominio = "";
    String ipServidor = "";
    int opcion = 9999;

    /* resolvedor */
    Resolver r = new Resolver("131.98.1.1       ");

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
          ipServidor = agregarEspacios(ipServidor);
          System.out.println("Escribe el IP del dominio");
          ipDominio = scan.nextLine();
          ipDominio = agregarEspacios(ipDominio);

          /* asignacion del servidor a la lista del tld */
          Root root = r.getRoot();
          String dom = dominio.substring(dominio.indexOf(".")+1, (dominio.length()));
          Tld temp = root.getT(dom);
          if(temp != null){
            Servidor s = new Servidor(dominio, ipDominio, ipServidor);
            temp.agregarServidor(s);
            root.setTld(temp, dom);
          }
          else{
            System.out.println("No existe el tld");
          }
          /* guardar cambios en el root */
          r.setRoot(root);
          break;
        case 2:
          /* buscar el ip de un dominio */
          System.out.println("Escribe el nombre del dominio");
          dominio = scan.nextLine();
          r.encontrarIp(dominio, ipHost);
          break;
        case 3:
          /* agregar tld */
          System.out.println("Escribe el nombre del servidor tld");
          dominio = scan.nextLine();
          System.out.println("Escribe el ip del servidor tld");
          ipServidor = scan.nextLine();
          ipServidor = agregarEspacios(ipServidor);
          Root root2 = r.getRoot();
          Tld x = new Tld(ipServidor, dominio);
          root2.setTld(x, dominio);
          r.setRoot(root2);
          break;
        default:
          System.out.println("Opcion no valida.");
      }
    }while(opcion != 0);
  }
}
