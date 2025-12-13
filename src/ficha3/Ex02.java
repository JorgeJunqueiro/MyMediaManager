package ficha3;
import java.util.Scanner;


public class Ex02 {

    static String parImpar( int num1){
        String resultado;
            if(num1%2==0){
                resultado= String.format("O Numero é Par.");
            }else{
                resultado= String.format("O Numero é Impar.");
            }


        return resultado;
    }


    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduza um numero: ");
    int numero = teclado.nextInt();
    System.out.printf(parImpar(numero));
        

    teclado.close();
    }
}
