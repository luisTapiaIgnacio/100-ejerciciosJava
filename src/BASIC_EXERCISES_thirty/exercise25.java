/*
25. INGRESAR VALORES A UN ARRAY O LISTA
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantas Notas ingresara? ");
        int cantidad=sc.nextInt();
        
        double notas[]=new double[cantidad];
        //ingresar las notas
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese la nota: "+(i+1)+" : ");
            notas[i]=sc.nextDouble();
        }
        //mostrar las notas ingresadas
        System.out.println("NOTAS ACTUALES: ");
        for(int i=0; i<cantidad;i++){
           
            System.out.println("-NOTA "+(i+1) + notas[i]);
        }
        sc.close();
        
    }
}
