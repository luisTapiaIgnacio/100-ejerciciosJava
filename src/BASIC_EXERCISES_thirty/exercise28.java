/*
Cajero automático — Menú interactivo
Descripción:
Simula un cajero automático donde el usuario puede hacer operaciones como ver saldo, depositar dinero, retirar dinero, o salir. El menú debe repetirse hasta que el usuario elija la opción "Salir".
🎯 Ideal para practicar:
•	do-while
•	switch-case
•	variables acumulativas
•	lógica de menú
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise28 {

    public static void main(String[] args) {
        System.out.println("Hola, Bienvenido al cajero");
        Scanner sc = new Scanner(System.in);
        double saldo = 100; //saldo inicial
        boolean continuar = true;
        int opcion;
        do {
            System.out.println("***************************");
            System.out.println("QUE OPERACION DESEA REALIZAR: ");
            System.out.println("******************************");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar efectivo");
            System.out.println("0. Salir");
            System.out.print("OPCION: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar: ");
                    float efectivo = sc.nextFloat();
                    if (efectivo < saldo) {
                        saldo -= efectivo;
                        System.out.println("Ud. retiro: " + efectivo);
                        System.out.println("Su saldo actual es: " + saldo);
                    } else {
                        System.out.println("Saldo infuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Cuanto depositara: ");
                    float deposito = sc.nextFloat();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Su saldo actual es: " + saldo);
                    } else {
                        System.out.println("⚠️ El depósito debe ser mayor que 0.");
                    }

                    break;
                case 0://salir
                    
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta luego!");
                    break;

                default:
                    
                    throw new AssertionError();
            }

        } while (opcion != 0);

    }
}
