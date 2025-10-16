/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JHONATAN
 */
public class exercise16_1 {
    public static void main(String[] args) {
        int numero=5;
        int resultado;
        //ENCABEZADO
        
        for (int j = 1; j <= numero; j++) {
            System.out.printf("%-20s", "Tabla del " + j);
        }
        System.out.println();

        
        // FILAS DE MULTIPLICACION
        for(int i=1; i<=10;i++){
            
            for(int j=1; j<=numero;j++){
            resultado=j*i;
            System.out.printf("%-20s",j+" x "+i+" = "+resultado);
        }
            System.out.println();
            
        }
        
        System.out.println("fin de la multiplicacion");
    }
}
