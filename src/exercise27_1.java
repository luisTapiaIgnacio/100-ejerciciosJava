
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Ejercicio 27: Clasificador de Vocales y Consonantes
Objetivo:
•	Ingresar una cadena de texto
•	Clasificar cada letra en:
o	Vocales → se guardan en una lista
o	Consonantes → se guardan en otra lista
•	Mostrar ambas listas al final
 */

/**
 *
 * @author JHONATAN
 */
public class exercise27_1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //declaro variables tipo lista
    List<Character>voc=new ArrayList<>();
    List<Character>cons=new ArrayList<>();
    //solicito al usuario que ingrese un texto
        System.out.println("ingrese un texto: ");
        String texto=sc.nextLine().toLowerCase(); //a la vez tdo texto q entra lo convierto a minuscula
     //recorrer todo el texto
     for(int i=0; i<texto.length(); i++){
         char c=texto.charAt(i);
         //verifico si son letras
         if(Character.isLetter(c)){
             //verifico si es vocal
             if("aeiou".indexOf(c) != -1){
                 //si es agrego a la lista
                 voc.add(c);
             }else{
                 cons.add(c);
             }
         }
     }
     
     //muestro los resultados
        System.out.println("-lista de vocales: "+voc);
        System.out.println("- lista de consonantes: "+cons);
        
        sc.close();
        
    }
}
