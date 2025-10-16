/*
•	INGRESAR CADENA Y DEVOLVERME (A=@)
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise02 {
    public static void main(String[] args) {
        String name="jhonatan";
        //creo un array de caracteres
        char[] listaLetras=new char[name.length()];
        //lleno el array mediante for
        for(int i=0; i<name.length(); i++){
           listaLetras[i] =name.charAt(i);
        }
        //mostrar el array con indices
        System.out.println("MI ARRAY");
        for(int i=0; i<listaLetras.length;i++){
            System.out.print(listaLetras[i]+" ");
        }
        //salto de linea
        System.out.println();
        for(int i=0; i<listaLetras.length;i++){
            System.out.print(i+ " ");
        }
        //mostrar una letra en especifico
        System.out.println("\n\n LETRA DE LISTA: 2 => "+listaLetras[2]);
    }
}
