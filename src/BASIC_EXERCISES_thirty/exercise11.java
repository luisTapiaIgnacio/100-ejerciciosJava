/*
•	INGRESA UN NUMERO Y HALLAR SU MULTIPLO
 */
package BASIC_EXERCISES_thirty;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num=sc.nextInt();
        int cantidad=20;
        int multiplo=0;
        int listaNum[]= new int[cantidad];
        
        System.out.println("Los "+ cantidad + " 1ros num. multiplo de "+ num+ " son: ");
        for(int i=1;i<=cantidad;i++){
            multiplo=num*i;
            System.out.println("Item 0"+i+" : "+ multiplo);
           
            
            
        }
        System.out.println("GUARDANDOLO EN UN ARRAY Y LUEGO MOSTRANDOLO: ");
        for(int j=0; j<cantidad; j++){
          
            listaNum[j]=(j+1)*num;
        }
        System.out.println(Arrays.toString(listaNum));

        
        
        
        
        
    }
}
