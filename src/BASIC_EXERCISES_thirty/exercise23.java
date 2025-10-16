/*
23. ASIGNAR CARRERA SEGÚN NOTA(10-12 ->ENFERM / 13-15->ELECTRIC …)
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise23 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //esto es una lista
        String a[] = {"software", "cientificos", "ingenieros", "medicos"};
        String b[] = {"informatica", "redes", "psicologos"};

        String c[] = {"enfermeria", "contadores", "docentes"};
        
        System.out.print(" CUAL ES SU NOTA?:  ");
        int nota=sc.nextInt();
        
        if(nota>=10 && nota<=13){
            System.out.println("Ud. pertenecese a la categoria C: ");
            for(String carrera: c){
                System.out.print("=>");
                System.out.println(carrera);
            }
        } else if(nota>=14 && nota <=17){
            System.out.println("Ud. pertenecese a la categoria B: ");
            for(String carrera: b){
                System.out.print("=>");
                System.out.println(carrera);
            }
        }else if(nota>=17 && nota<=20){
            System.out.println("Ud. pertenece a la categoria A: ");
            for(String carrera:a){
                System.out.print("=>");
                System.out.println(carrera);
            }
        }else{
            System.out.println("Rango incorrecto, escriba (10-20)");
        }
           
        

    }
}
