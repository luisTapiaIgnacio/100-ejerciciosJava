/*
26. LA FRUTA TIENE CALORIAS, SEGN CONSUMA CUANTO PESO O CAL CNSUME(LISTAS)
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFruta;

        String[] frutas = {"manzana", "platanos", "guanabana", "uvas", "mango"};
        int[] calorias = {50, 80, 150, 60, 110};

        boolean continuar = true;
        System.out.println("****MENU DE OPCIONES****");
        while (continuar) {
            System.out.println("\nQue operacion realizara? ");
            System.out.println("1. Consultar Frigobar");
            System.out.println("2. Consumir una fruta");
            System.out.println("3. Eliminar fruta");
            System.out.println("0. salir");

            System.out.print("OPCION: ");
            int opcion = sc.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("EL FRIGOBAR CONTIENE: ");
                    for (int i = 0; i < frutas.length; i++) {
                        System.out.println("- " + frutas[i] + " => " + calorias[i] + " cal.");
                    }
                    break;
                case 2:
                    char seguir;
                    do {

                        //mostrar frutas
                        do {
                            System.out.println("Que fruta desea consumir? ");
                            for (int i = 0; i < frutas.length; i++) {
                                System.out.println("- [" + (i + 1) + "]" + " " + frutas[i]);
                            }
                            System.out.println("OPCION: ");
                            numFruta = sc.nextInt();
                        } while (numFruta < 1 || numFruta > frutas.length);
                        int index = numFruta - 1;
                        System.out.println("Ud. selecciono: " + frutas[index]);

                        // Validacin de seguir
                        do {
                            System.out.println("\n Desea continuar? S/N: ");
                            seguir = Character.toLowerCase(sc.next().charAt(0));
                            if (seguir != 's' && seguir != 'n') {
                                System.out.println("Opcion incorrecta, Ingrese solo S-N ");
                            }
                        } while (seguir != 's' && seguir != 'n');

                    } while (seguir == 's');// si es 's', repite la lista de frutas

                    // si es 'n', rompe este case y vuelve al menú principal
                    break;
                    
                    
                default:
                    System.out.println("Opcion invalida, solo (0-3)");
            }
        }

        System.out.println("Saliendo del sistema...!");
    }
}
