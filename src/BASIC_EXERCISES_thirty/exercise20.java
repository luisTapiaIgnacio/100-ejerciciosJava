/*
20. gestor de contraseña
 */
package BASIC_EXERCISES_thirty;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise20 {

    public static void main(String[] args) {
        //declarar los arreglos paralelos, cuantas cuantas max, y contador
        Scanner sc = new Scanner(System.in);
        final int MAX_CUENTA = 10;
        //arreglos paralelos
        String servicio[] = new String[MAX_CUENTA];
        String usuario[] = new String[MAX_CUENTA];
        String contraseña[] = new String[MAX_CUENTA];
        int contador = 0;
        int opcion;
        do {
            System.out.println("\n******** GESTOR DE CONTRASEÑA ******");
            System.out.println("1. Agregar contraseña");
            System.out.println("2. Ver servicios guardados");
            System.out.println("3. Consultar contraseña");
            System.out.println("4. Salir");
            System.out.println("Seleccionar Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();//limpiar buffer
            switch (opcion) {
                case 1:
                    if (contador < MAX_CUENTA) {
                        System.out.println("Ingrese nombre del servicio: ");
                        servicio[contador] = sc.nextLine();
                        System.out.println("Ingrese nombre del usuario: ");
                        usuario[contador] = sc.nextLine();
                        System.out.println("Ingrese contraseña: ");
                        contraseña[contador] = sc.nextLine();

                        contador++;
                        System.out.println("Cuenta guardada correctamente...!");
                    } else {
                        System.out.println("Limite de cuenta alcanzada");
                    }
                    break;
                case 2:
                    if (contador == 0) {
                        System.out.println("No hay servicios guardados");

                    } else {
                        System.out.println("Servicios guardados");
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + servicio[i]);
                        }
                    }
                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("No hay cuentas cuentas guardadas. ");
                        break;
                    }
                    System.out.println("Ingrese nombre de servicio");
                    String servicioBuscado = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (servicio[i].equalsIgnoreCase(servicioBuscado)) {
                            System.out.println("USUARIO: " + usuario[i]);
                            System.out.println("COTRASEÑA: " + contraseña[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Servicio no encontrado");
                    }

                    break;
                case 4:
                    System.out.println("Saliendo del gestor... ");
                    break;
                default:
                    System.out.println("Opcion no valida,  intente nuevamente.");
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado...!");

    }
}
