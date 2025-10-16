
import java.util.Scanner;

/*
23. ASIGNAR CARRERA SEGÚN NOTA(10-12 ->ENFERM / 13-15->ELECTRIC …)
 */

/**
 *
 * @author JHONATAN
 */
public class exercise23_1 {
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
            case 10: case 11: case 12: case 13:
                nomCategoria="C";
                System.out.println("UD. PERTENECE A LA CATEGORIA: "+nomCategoria);
                for(String carreras: c){
                    System.out.print("=>");
                    System.out.println(carreras);
                }
               case 14: case 15: case 16:
                nomCategoria="B";
                System.out.println("UD. PERTENECE A LA CATEGORIA: "+nomCategoria);
                for(String carreras: b){
                    System.out.print("=>");
                    System.out.println(carreras);
                }
                case 17: case 18: case 19: case 20:
                nomCategoria="A";
                System.out.println("UD. PERTENECE A LA CATEGORIA: "+nomCategoria);
                for(String carreras: a){
                    System.out.print("=>");
                    System.out.println(carreras);
                }
                
                break;
            default:
                System.out.println("Fuera de rango, solo 10-20");
        }
    }
}
