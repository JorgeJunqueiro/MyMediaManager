package ficha3;
import java.util.Scanner;

public class Ex12 {

    static String verificadorDeChars(char valor1){
        String resultado = String.format("Não é uma Letra");

            if((valor1>='A' && valor1<='Z')||(valor1>='a' && valor1<='z')){
                //resultado = String.format("O Character é uma letra " + (valor1>=65 && valor1<=90 ? "Maiuscula" : "Minuscula"));
                if(valor1>='A' && valor1<='Z'){
                    resultado = String.format("%c É uma Letra Maiuscula, letra em Minuscula %c",valor1, valor1+ ' ');

                }else if(valor1>='a' && valor1<='z'){
                    
                    resultado = String.format("%c É uma Letra Minuscula, letra em Maiuscula ", valor1, valor1 - ' ');
                }

            }


        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduza um Character: ");
        char original = teclado.next().charAt(0);

        System.out.println(verificadorDeChars(original));

        teclado.close();

        
    }



}
