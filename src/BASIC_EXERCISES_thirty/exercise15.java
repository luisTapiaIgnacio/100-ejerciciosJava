/*
15	REALIZAR TBLA DE MULTIPLICAR X / DE 1-10
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise15 {
    public static void main(String[] args) {
        int numero=3;
        int resultado;
        
        for(int i=1; i<=10;i++){
            resultado=numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
        System.out.println("fin de la multiplicacion");
    }
}
