/*
15	REALIZAR TABLA HSTA Q NUMERO QUIERE MULTPLICAR EMPEZANDO DE 1 (ORDENAR EN VERT Y HORIZNTAL)
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise16 {
    public static void main(String[] args) {
         int numero=5;
        int resultado;
        
        for(int j=1; j<=numero;j++){
            System.out.println("multiplicacion de: "+j);
            for(int i=1; i<=10;i++){
            resultado=j*i;
            System.out.println(j+" x "+i+" = "+resultado);
        }
            
        }
        
        System.out.println("fin de la multiplicacion");
    }
}
