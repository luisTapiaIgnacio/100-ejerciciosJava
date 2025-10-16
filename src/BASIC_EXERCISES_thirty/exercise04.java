/*
•	INGRESAR UNA CADENA DE TEXTO Y DECIRME CUANTOS " a "  EXISTE
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise04 {
    public static void main(String[] args) {
        String cadena="buenos dias MARIA";
        char[] letra=new char[cadena.length()];
        for(int i=0; i<letra.length;i++){
            letra[i]=cadena.charAt(i);
        }
        //mostrar
        int count=0;
        char textoClave='a';
        System.out.println("MI ARRAY:  ");
        for(char c: letra){
            
           if(Character.toLowerCase(c)==textoClave){
               count++;
           }
            System.out.print(c);
        }
        System.out.println(" ...!");
        System.out.println("existen: "+ count + " letras A");
    }
}
