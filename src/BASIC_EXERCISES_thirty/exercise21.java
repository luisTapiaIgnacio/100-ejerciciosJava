/*
 21. calculadora
 */
package BASIC_EXERCISES_thirty;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise21 {

    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        int num_a, num_b, opcion;
        float resultado;
        boolean continuar;

        System.out.println("*********** CALCULADORA BASICA *******");

        do {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("0. SALIR");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) {
                break; // salir directamente
            }

            System.out.print("Ingrese un número: ");
            num_a = sc.nextInt();
            System.out.print("Ingrese otro número: ");
            num_b = sc.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num_a + num_b;
                    System.out.println("La suma es: " + resultado);
                    break;
                case 2:
                    resultado = num_a - num_b;
                    System.out.println("La resta es: " + resultado);
                    break;
                case 3:
                    resultado = num_a * num_b;
                    System.out.println("La multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num_b != 0) {
                        resultado = (float) num_a / num_b;
                        System.out.println("La división es: " + resultado);
                    } else {
                        System.out.println("⚠ Error: no se puede dividir entre 0.");
                    }
                    break;
                default:
                    System.out.println("⚠ Opción desconocida.");
            }

            // Validacin de seguir
            char seguir;
            do {
                System.out.print("¿Desea continuar? (S/N): ");
                seguir = Character.toLowerCase(sc.next().charAt(0));
                if (seguir != 's' && seguir != 'n') {
                    System.out.println("⚠ Opción inválida. Ingrese solo S o N.");
                }
            } while (seguir != 's' && seguir != 'n');

            continuar = (seguir == 's');

        } while (continuar);

        System.out.println("👋 Saliendo del sistema...");
    }
}
