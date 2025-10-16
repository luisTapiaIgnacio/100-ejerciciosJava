/*
•	INGRESAR DIA DE LA SEMANA
 */
package BASIC_EXERCISES_thirty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         

        // Pedir la fecha en formato dd/mm/aaaa
        System.out.print("Ingrese la fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        // Separar por el carácter "/"
        String[] partes = fecha.split("/");

        // Guardar cada parte
        String dia = partes[0];
        String mes = partes[1];
        String anio = partes[2];

        // Mostrar la fecha bien ordenada
        System.out.println("Día: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anio);

        // También podrías reordenar (ejemplo aaaa-mm-dd)
        System.out.println("Fecha en formato ISO: " + anio + "-" + mes + "-" + dia);

    }
}
