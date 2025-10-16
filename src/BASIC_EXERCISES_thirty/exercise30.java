/*
ArrayList: Lista de nombres de alumnos
 */
package BASIC_EXERCISES_thirty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                List<String>alumnos=new ArrayList<>();

        System.out.println("Cuantos alumnos desea ingresar? ");
        int cantidad=sc.nextInt();
        sc.nextLine();//limpiar buffer
        int item=0;
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese el alumno N°0"+(i+1)+": ");
            String alumno=sc.nextLine();
            alumnos.add(alumno);
        }
        for(String alum:alumnos){
            item++;
            
            System.out.println(">>N° "+item+": "+alum);
        }
        sc.close();
        
    }
}
