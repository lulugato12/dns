/* Autores:
 * Lourdes Beatriz Cajica Maceda A01732177
 * Jacqueline Ortiz Sanchez A01329978
 *
 * Descripcion:
 * Simulacion del protocolo de capa 1 DNS.
 * El Main es el browser que busca saber cual es el IP del dominio.
 * Se pueden agregar mas sitios web.
 *
 * Ultima fecha de modificacion:
 * 17-abril-19
 *
 * Falta:
 * -> cargar informacion de un txt
 */
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    /* variables */
    Scanner scan = new Scanner(System.in);
    int opcion = 9999;

    /* cargar informacion */


    /* desplegar menu */
    do{
      System.out.println("Elige una opcion:\n1. Dar de alta un dominio\n2. Buscar la ip de un dominio\n0. Salir");
      opcion = scan.nextInt();
      switch(opcion){
        case 0:
          break;
        case 1:
          break;
        case 2:
          break;
        default:
          System.out.println("Opcion no valida.");
      }
    }while(opcion != 0);

    /* guardar informacion */
  }
}
