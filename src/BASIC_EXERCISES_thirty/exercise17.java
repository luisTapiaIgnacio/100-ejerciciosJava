/*
Escribe un programa en Java que reciba tres números (a, b, c) como entrada y resuelva la ecuación de segundo grado 
a*x pow(2)+b*x + c=0. El programa debe calcular las soluciones reales (si existen) y mostrarlas.
-PASOS PARA RESOLVER:
- LEER LAS COEFIENTES A, B, C
- CALCULAR LA DISCRIMINANTE:
D=b pow(2) - 4*a*c
 ===>Si D > 0: hay dos soluciones reales distintas.
 ===>Si D == 0: hay una solución real doble.
 ===>Si D < 0: no hay soluciones reales (puedes mencionar que son complejas, pero eso sería otro nivel).
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //leer las coeficientes
        System.out.println("INGRESE EL COEFICIENTE A: ");
        int a= sc.nextInt();
          System.out.println("INGRESE EL COEFICIENTE B: ");
        int b=sc.nextInt();
          System.out.println("INGRESE EL COEFICIENTE C: ");
        int c=sc.nextInt();
        
        //VERIFICAMOS QUE "A" NO SEA 0, DE LO CONTRARIO NO ES UNA ECUASION DE 2DO GRADO
        if(a==0){
            System.out.println("No es una ecuasion de 2do grado");
        }else{
            double descriminante=b*b-4*a*c;
            if(descriminante>0){
                double x1=(-b+Math.sqrt(descriminante))/(2*a);
                double x2=(-b-Math.sqrt(descriminante))/(2*a);
                
                System.out.println("LA ECUACION TIENE 2 SOLUCIONES REALES: ");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            else if(descriminante==0){
            double x= -b/2*a;
            System.out.println("La ecuación tiene una solución real doble:");
                System.out.println("x = " + x);
        } 
            else{
                System.out.println("La ecuación no tiene soluciones reales.");
            }
            
        }
        
        sc.close();
        
        
        
    }
}
