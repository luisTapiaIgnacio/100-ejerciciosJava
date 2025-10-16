/*
•	INGRSAR UN NUMRO Y DECIR SI ES PRIMO O ( mult 1 y mismo num)
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise13 {
    public static void main(String[] args) {
        int numero=73;
        
        if(esPrimo(numero)){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
    }
    
    public static boolean esPrimo(int num){
        if(num<=1)return false;
        
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
