package ficha22;
import java.util.Scanner;
public class Ex9 {
static boolean verdadeMentira(boolean valor1, boolean valor2, boolean valor3){
    boolean resultado=false;
    
        resultado = valor1 && !valor2&& !valor3 || !valor1 && !valor2&& valor3 || !valor1 && valor2&& !valor3 || valor1 && valor2&& !valor3; 
        
    return resultado;

}
public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);

    System.out.println("Argumento 1: Introduza um Valore True ou False: ");
    boolean argumento1 = teclado.nextBoolean();
    System.out.println("Argumento 2: Introduza um Valore True ou False: ");
    boolean argumento2 = teclado.nextBoolean();
    System.out.println("Argumento 3: Introduza um Valore True ou False: ");
    boolean argumento3 = teclado.nextBoolean();

    boolean res=verdadeMentira(argumento1, argumento2, argumento3);

    System.out.println("Resultado: "+res);

    teclado.close();
}

}
