/*
lanzar un dado 3 veces y sumr 
 */
package BASIC_EXERCISES_thirty;

import java.util.Random;

/**
 *
 * @author JHONATAN
 */
public class exercise29 {

    public static void main(String[] args) {

        Random ran = new Random();
        System.out.println("🎲 BIENVENIDO AL JUEGO DEL DADO 🎲");
        System.out.println("Vas a lanzar el dado 3 veces...\n");

        int cant = 3;
        int sumaTotal = 0;

       for (int i = 0; i < cant; i++) {
    System.out.println("Lanzando el dado #" + (i + 1) + "...");
    try {
        Thread.sleep(1000); // Pausa de 1 segundo
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    int resultado = ran.nextInt(6) + 1;
    System.out.println("➡️ Resultado: " + resultado + "\n");

    sumaTotal += resultado;
}

        System.out.println("🎯 Suma total de tus lanzamientos: " + sumaTotal);

        // Evaluación del resultado
        if (sumaTotal >= 15) {
            System.out.println("🏆 ¡Excelente! Tienes mucha suerte hoy.");
        } else if (sumaTotal >= 10) {
            System.out.println("👍 ¡Buen intento! Estás en el promedio.");
        } else {
            System.out.println("😅 ¡Sigue practicando! La suerte no estuvo de tu lado.");
        }

    }
}
