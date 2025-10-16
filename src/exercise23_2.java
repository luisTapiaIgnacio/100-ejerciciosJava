
import java.util.Scanner;

/*
23. ASIGNAR CARRERA SEGÚN NOTA(10-12 ->ENFERM / 13-15->ELECTRIC …)
 */

/**
 *
 * @author JHONATAN
 */
public class exercise23_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //esto es una lista
        String a[] = {"software", "cientificos", "ingenieros", "medicos"};
        String b[] = {"informatica", "redes", "psicologos"};

        String c[] = {"enfermeria", "contadores", "docentes"};
        String nomCategoria;
        System.out.print(" CUAL ES SU NOTA?:  ");
        int nota=sc.nextInt();
        
        switch (nota) {
    case 10, 11, 12 -> mostrar(c);
    case 13, 14, 15 -> mostrar(b);
    case 16, 17, 18, 19, 20 -> mostrar(a);
    default -> System.out.println("Nota fuera de rango (10-20).");
}
        
        
    }
    static void mostrar(String[] carreras) {
    System.out.println("Carreras asignadas:");
    for (String c : carreras) {
        System.out.println("- " + c);
    }
    }
}
