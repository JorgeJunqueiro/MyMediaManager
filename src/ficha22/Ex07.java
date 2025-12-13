package ficha22;
import java.util.Scanner;


public class Ex07 {
    static double calcularSomaPartes(double valor1, double valor2){
            double resultado=0;
            int num1 = (int) valor1;
            int num2 = (int) valor2;
            valor1 = valor1-num1;
            valor2 = valor2-num2;
            resultado = valor1+valor2;
        return resultado;
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza um numero real: ");
        double numero1 = teclado.nextDouble();
        System.out.println("Introduza um numero real: ");
        double numero2 = teclado.nextDouble();

        double resFinal = calcularSomaPartes(numero1, numero2);

        System.out.println("A soma das Partes decimais é: "+ resFinal);
        teclado.close();
    }

    

    
}
