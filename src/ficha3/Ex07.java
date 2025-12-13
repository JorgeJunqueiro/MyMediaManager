package ficha3;
import java.util.Scanner;

public class Ex07 {
    static String bisextro(int valor1){
        String resultado = String.format("O Ano é Comum.");

        if((valor1%4==0 && valor1%100!=0)||valor1%400==0){
            resultado = String.format("O Ano é Bixesto.");
        }

        return resultado;
    }

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduza um ano: ");
    int ano = teclado.nextInt();
    System.out.printf(bisextro(ano));

    teclado.close();
    }

}
