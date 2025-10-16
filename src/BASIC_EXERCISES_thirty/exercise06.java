/*
•	CONVERTIR DE DECIMAL A BINARIO
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise06 {
    public static void main(String[] args) {
        int decimal=25;
        int residuo=decimal;
        
        //utilizamos array para guardar los binarios-max. 32 bits
        int[] binario=new int[32];
        int i=0;
        
        //creamos un bucle
        while(residuo>0){
            //obtenemos el residuo
            binario[i]=residuo%2;
            //obtenemos la divicion
            residuo=residuo/2;
            i++;
        }
        
        //imprimimos el bninario al reves
        System.out.println("el binario de: "+decimal+" es: ");
        for(int j=i-1; j>=0; j--){
            System.out.print(binario[j]);
        }
        
        System.out.println();
        
    }
}
