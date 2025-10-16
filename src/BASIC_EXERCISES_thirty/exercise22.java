/*
22. INGRSAR NUM PSITVOS , Y SUMAS .AL INGERSAR NEGATIVO SALIR
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean positivo = true;
        while (positivo) {
            System.out.println("ESCRIBE UN NUMERO");
            int num = sc.nextInt();
            if(num<0){
                positivo=false;
            }
        }
        
        System.out.println("Saliendo del sistema");
        sc.close();
    }
}
