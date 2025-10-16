
import java.util.Scanner;

/*
 calculadora basica

/**
 *
 * @author JHONATAN
 */
public class exercise21_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opcion;
        float respuesta;
        boolean continuar = true;
        System.out.println("********** CALCULADORA BASICA ***********");
        do {
            System.out.println("\n¿Que operacion desea realizar?");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("0. SALIR");

            System.out.print("OPCION: ");
            opcion = sc.nextInt();
            if (opcion == 0) {
                break;
            }

            System.out.println("\n*********************************");
            System.out.println("Ingrese el 1er valor: ");
            num1 = sc.nextInt();
            System.out.println("Ingrese el 2do valor: ");
            num2 = sc.nextInt();
            switch (opcion) {
                case 1:
                    respuesta = num1 + num2;
                    System.out.println("la suma es: " + respuesta);
                    break;

                case 2:
                    respuesta = num1 - num2;
                    System.out.println("la resta es: " + respuesta);
                    break;
                    case 3:
                    respuesta = num1 * num2;
                    System.out.println("la MULTIPLICACION es: " + respuesta);
                    break;
                    case 4:
                        if(num2 != 0){
                            respuesta = num1 / num2;
                            System.out.println("la divsion es: " + respuesta);
                        }else{
                            System.out.println("No se puede dividir entre 0");
                        }
                    
                    break;
                default:
                    System.out.println("No es una alternativa valida...!");
            }
            
            // validacion si seguir o no
            char seguir;
            do {                
                System.out.print("DESEA CONTINUAR? (S/N): ");
                seguir=Character.toLowerCase(sc.next().charAt(0));
                if(seguir != 's' && seguir != 'n'){
                    System.out.println("Opcion incorrecta, ingrese solo S/N ");
                }
            } while (seguir !='s' && seguir !='n');
            continuar=(seguir=='s');
            
        } while (continuar);

        System.out.println("¡ Saliendo del sistema....!");
    }
}
