/*
INGRESAR CADENA Y DEVOLVERME (A=@)
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class excercise0202 {
    public static void main(String[] args) {
        String name="maria";
        char[] caracter_name=new char[name.length()];
        for(int i=0; i<caracter_name.length; i++){
            caracter_name[i]=name.charAt(i);
        }
        
        //mostrar array original
        System.out.println("mostrar array original");
        for(int i=0; i<caracter_name.length; i++){
            System.out.println(i+" => "+ caracter_name[i]);
        }
        System.out.println("mostrar array alterado");
        
        for(int j=0; j<caracter_name.length;j++){
            if(caracter_name[j]=='a'){
                caracter_name[j]='@';
            }
        }
       
        for(int j=0; j<caracter_name.length; j++){
            System.out.println(j+" => "+ caracter_name[j]);
        }
    }
}
