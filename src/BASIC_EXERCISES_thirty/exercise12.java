/*
•	INGRESAR UN NUMERO Y HALLAR SU DIVISOR
 */
package BASIC_EXERCISES_thirty;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise12 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num=sc.nextInt();
        ArrayList<Integer> listaDivisor=new ArrayList<>();
        
       for(int i=1; i<=num;i++){
            if(num%i==0){
            listaDivisor.add(i);
        }
            
       }
        System.out.println("DIVISORES DE "+num+" SON: ");
        System.out.println(listaDivisor);
    }
 
}
