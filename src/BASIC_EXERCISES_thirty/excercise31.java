/*
Crear un programa que determine cuánto paga una persona al ingresar a la discoteca,
considerando su edad, género, día de la semana y número de veces que ha asistido antes.
 */
package BASIC_EXERCISES_thirty;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class excercise31 {
    public static void main(String[] args) {
        
        

        int precioEntrada = 20;
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎉 HOLA, BIENVENIDO A LA DISKOTECA 🎉");
        System.out.print("¿Cuál es su nombre? ");
        String name = sc.nextLine();

        
        char genero = pedirGenero(sc);
        int age;
        while (true) {
            try {
                System.out.print("¿Cuántos años tienes? ");
                age = sc.nextInt();
                if (age > 0 && age < 120) {
                    break;
                } else {
                    System.out.println("⚠️ Ingrese una edad realista.");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error: Debe ingresar solo números.");
                sc.nextLine();
            }
        }

        if (age < 18) {
            System.out.println("🚫 Lo sentimos " + name + ", eres menor de edad. No puedes ingresar.");
            return;
        }

        System.out.print("¿Cuántas veces has asistido antes? ");
        int asistencias = sc.nextInt();

        // Día aleatorio
        String dia = dias[random.nextInt(dias.length)];

        // Aplicar descuentos
        double total = precioEntrada;

        if (genero == 'F') {
            total = total / 2; // mujeres pagan mitad siempre
        }

        if (dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miércoles")) {
            if (genero == 'M') total /= 2; // varones mitad de precio en días de semana
        }

        if (asistencias >= 5) {
            total *= 0.8; // 20% de descuento por cliente frecuente
        }

        System.out.println("\n✅ DATOS DE INGRESO ✅");
        System.out.println("Nombre: " + name);
        System.out.println("Género: " + (genero == 'M' ? "Masculino" : "Femenino"));
        System.out.println("Edad: " + age);
        System.out.println("Día: " + dia);
        System.out.println("Número de asistencias previas: " + asistencias);
        System.out.printf("💰 Precio a pagar: S/ %.2f%n", total);
        System.out.println("🎶 ¡Gracias por tu visita a la Diskoteca! 🎶");
    }
    
    public static char pedirGenero(Scanner sc) {
    while (true) {
        System.out.print("¿Cuál es su género? (F / M): ");
        String input = sc.next().trim().toUpperCase(); // toma la entrada, elimina espacios y la convierte a mayúscula
        if (input.equals("F") || input.equals("M")) {
            return input.charAt(0); // devuelve la letra válida
        }
        System.out.println("⚠️ Entrada inválida. Ingrese solo 'F' o 'M'.");
    }
}
        
    }

