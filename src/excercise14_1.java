/*
14. 	INGRESAR CADENA Y DECIRME CUANTOS “A” EXISTE
 */

/**
 *
 * @author JHONATAN
 */
public class excercise14_1 {
    public static void main(String[] args) {
        String texto="hola buenos DIAS";
        
       int contador=0;
       for(int i=0; i<texto.length();i++){
           char c=texto.toLowerCase().charAt(i);
           if(c=='a'){
               contador+=1;
           }
       }
       
        System.out.println("EL TEXTO TIENE: "+contador+ " [a/A]");
    }
}
