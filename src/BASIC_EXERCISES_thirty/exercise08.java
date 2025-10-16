/*
 •	FACTORIAL DE UN NUMERO
 */
package BASIC_EXERCISES_thirty;

/**
 *
 * @author JHONATAN
 */
public class exercise08 {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println("factorial de "+num+ " es: "+fact);
    }
    
    
}
