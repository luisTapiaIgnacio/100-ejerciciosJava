/*
 19. CNVERSION MONEDA (SOLES-EUROS-DOLARES-PESOS MEX)

 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float soles;
        float dolares=0, euros=0, pesosMex=0;
        System.out.println("******* CONVERSOR DE MONEDAS **********");
        System.out.println("Ingrese Monto en soles: ");
        soles=sc.nextInt();
        //se ejecuta luego pide la condicion para seguir
        int opcion;
        do {  
            System.out.println("----SELECCIONES LA MONEDA ------");
            System.out.println("1. DOLARES \n2. EUROS \n3. PESOS MEX. \n0. SALIR");
            
            System.out.print("OPCION: ");
            
             opcion=sc.nextInt();
              switch (opcion) {
                case 1:
                    dolares=soles/3.55f;
                    System.out.println("Equivale a: "+dolares +"\n");
                    break;
                case 2:
                    euros=soles/4.55f;
                    System.out.println("Equivale a: "+euros +"\n");
                    break;
                case 3:
                    pesosMex=soles*5.25f;
                    System.out.println("Equivale a: "+pesosMex +"\n");
                    break;
                case 0:
                    System.out.println("Saliendo del conversor");
                    break;
                default:
                    System.out.println(" !!!!!!!!!!!Opcion no valida \n");
                    break;
            }
            
        } while (opcion !=0);
        
        System.out.println("Saliendo del sistema....!");
        
    }
}
