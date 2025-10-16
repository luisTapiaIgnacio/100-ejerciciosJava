/*
 contar cuantas A existen
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise0404 {
    public static void main(String[] args) {
        String cadena="hola, buenos dias MARIA";
        char letraClave='a';
        int count=0;
        System.out.println("leendo letra x letra sin uso de array");
        for(int i=0; i<cadena.length();i++){
            char letra=cadena.charAt(i);
            if(Character.toLowerCase(letra)==letraClave){
                count++;
            }
            System.out.print(letra);
        }
        System.out.println("\nEXISTEN: "+count+ " letras"+ " A");
        System.out.println();
    }
    
}
