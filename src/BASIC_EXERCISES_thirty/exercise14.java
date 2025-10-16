/*
14. 	INGRESAR CADENA Y DECIRME CUANTOS “A” EXISTE
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise14 {
    public static void main(String[] args) {
       String texto="HolA como estas" ;
       char[] caracter=new char[texto.length()];
       int contador=0;
       for(int i=0; i<texto.length(); i++){
           caracter[i]=texto.toLowerCase().charAt(i);
           if(caracter[i]=='a'){
               contador+=1;
           }
       }
       
        System.out.println("El texto tiene: "+contador+ "[a/A]");
       
       
    }
}
