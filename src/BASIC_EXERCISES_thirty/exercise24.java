/*
24. ESTACION DEL AÑO INGRSANDO MES-USAR CASE
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String primavera[]={"Enero", "Febrero", "Marzo"};
        String verano[]={"Abril", "Mayo", "Junio"};
        String otoño[]={"Julio", "Agosto", "Setiembre"};
        String invierno[]={"Octubre", "Noviembre", "Diciembre"};
        System.out.println("******** ESTACION DEL AÑO *******");
        int numEstacion;
        String nomEstacion;
        do {  
            System.out.println("Para saber la estacion del año ingrese numero de mes 1-12");
        
              numEstacion=sc.nextInt();
            
        } while (numEstacion <1 && numEstacion > 12);
        if(numEstacion<=3){
            nomEstacion="PRIMAVERA";
            int index=numEstacion-1;
            System.out.println("=> "+primavera[index]+ " => PERTENECE A LA ESTACION: "+nomEstacion);
        }
        else if(numEstacion<=6){
            nomEstacion="VERANO";
            int index=numEstacion-4;// 4→0, 5→1, 6→2
            System.out.println("=> "+verano[index]+ " => PERTENECE A LA ESTACION: "+nomEstacion);
        }
         else if(numEstacion<=9){
            nomEstacion="OTOÑO";
            int index=numEstacion-7;
            System.out.println("=> "+otoño[index]+ " => PERTENECE A LA ESTACION: "+nomEstacion);
        }
         else  if(numEstacion<=12){
            nomEstacion="INVIERNO";
            int index=numEstacion-10;
            System.out.println("=> "+invierno[index]+ " => PERTENECE A LA ESTACION: "+nomEstacion);
        }
        
        sc.close();
        
        
        
    }
}
