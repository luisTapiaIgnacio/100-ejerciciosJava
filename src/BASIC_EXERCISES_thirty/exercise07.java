/*
•	CONVERTIR DE UN NUMERO A NUMEROS ROMANOS
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise07 {
    public static void main(String[] args) {
         int numeroN=45;
        String resultado=" ";
        
        int valores[]={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanos[] ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i=0; i<valores.length; i++){
           while(numeroN>=valores[i]){
                numeroN-=valores[i];
            resultado+=romanos[i];
           }
        }
        System.out.println("romanos: "+resultado);
    }
    
}
