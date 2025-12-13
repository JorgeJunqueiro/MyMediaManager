package ficha22;
import java.util.Scanner;


public class Ex02 {
    static char minuscula(char maiuscula){
        int distancia = 'a'-'A';
        char letra =(char) (maiuscula + distancia);
        return letra;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Introduza uma Letra Maiuscula:\n");
        char letraMinuscula = teclado.next().charAt(0);
        char resultado = minuscula(letraMinuscula
        );
        System.out.println("A letra em minusculo: "+ resultado);
        teclado.close();
    }

}
