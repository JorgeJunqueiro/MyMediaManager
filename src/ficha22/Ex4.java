package ficha22;

import java.util.Scanner;
public class Ex4 {
    static char retomaAleatoriaMenor(char letra){
        
        char resultado = (char) ('a' + (letra-'a')* Math.random());
        
        return resultado;


    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza uma Letra entre A e Z:\n");
        char letraInicial = teclado.nextLine().charAt(0);
        
        char letraRandom = retomaAleatoriaMenor(letraInicial);
        System.out.println("Letra ao Calhas: "+ letraRandom);
        teclado.close();
    }
}
