/*
 Ejercicio 27: Clasificador de Vocales y Consonantes
Objetivo:
•	Ingresar una cadena de texto
•	Clasificar cada letra en:
o	Vocales → se guardan en una lista
o	Consonantes → se guardan en otra lista
•	Mostrar ambas listas al final

 */
package BASIC_EXERCISES_thirty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //creamos nuestra lista para guardar vocales y consonantes
        List<Character>vocales=new ArrayList<>();
        List<Character>consonantes=new ArrayList<>();
        //solicitar texto al usuario
        System.out.println("Ingrese una cadena de texto");
        String cadena=sc.nextLine().toLowerCase();// pero a la vez lo convertimos a minuscula
        //recorremos todo el texto
        for(int i=0; i<cadena.length(); i++){
            char c=cadena.charAt(i);
            //verificcamos si es una letra
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c) !=-1){
                    vocales.add(c); //es vocal
                } else{
                    consonantes.add(c);//son consonantes
                }
            }
        }
        
        //mostrar resultados
        System.out.println("=> VOCALES ENCONTRADOS: "+vocales);
        System.out.println("=> CONSONANTES ENCONTRADOS: "+consonantes);
        sc.close();
        
    }
}
