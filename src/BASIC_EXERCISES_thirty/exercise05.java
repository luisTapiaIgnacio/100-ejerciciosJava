/*
•	CONVERTIR DE BINARIO A DECIMAL
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise05 {
     public static void main(String[] args) {
        String binario="1011";
        int decimal=0;
        
        for(int i=0; i<binario.length();i++){
            char caracter=binario.charAt(i);
            //ingresa o suma si el carcater es 1
            if(caracter=='1'){
                int potencia=binario.length()-1-i;
                decimal+=Math.pow(2, potencia);
            }
        }
        
         System.out.println("decimal: "+decimal);
    }
}
