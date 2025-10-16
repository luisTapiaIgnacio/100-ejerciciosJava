/*
•	INGRSAR EDAD(NIÑO, PUVER, ADOL, JVEN, ADULT)
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE SU EDAD: ");
        int edad;
        edad = sc.nextInt();
        String categoria;
        if (edad >= 1 && edad <= 10) {

            categoria = "niño";
            System.out.println("Ud. es un " + categoria + "  => Tiene: " + edad + " años");
        } else if (edad >= 11 && edad <= 13) {
            categoria = "puver";
            System.out.println("Ud. es un " + categoria + "  => Tiene: " + edad + " años");
        }
        
        else if(edad >=14 && edad<=18){
           categoria = "adolescente";
            System.out.println("Ud. es un " + categoria + "  => Tiene: " + edad + " años"); 
        }
         else if(edad >=19 && edad<=27){
           categoria = "joven";
            System.out.println("Ud. es un " + categoria + "  => Tiene: " + edad + " años"); 
        }
        
         else if(edad >=28 && edad<=45){
           categoria = "adulto";
            System.out.println("Ud. es un " + categoria + "  => Tiene: " + edad + " años"); 
        }
        
         else{
             System.out.println("no esta en el rango de edad...!");
         }

    

    sc.close ();
}
}
