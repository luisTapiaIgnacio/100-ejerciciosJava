/*
•	INGRESAR UNA CADENA DE TEXTO Y DEVOLVERME SIN ESPACIO
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise03 {
    public static void main(String[] args) {
        String name="luis tapia ignacio";
        char[] caracter=new char[name.length()];
        for(int i=0; i<caracter.length;i++){
            caracter[i]=name.charAt(i);
            
        }
        System.out.println("mi array");
        for(char c: caracter){
            if(c != ' '){
                System.out.print(c);
            }
        }
        System.out.println();
        
    }
}
