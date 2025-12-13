package ficha22;
import java.util.Scanner;
public class Ex11 {

    static double calcularSenCos( double valor1){
        double resultado=0;
        
        resultado = Math.pow(Math.sin(valor1), 2)+ Math.pow(Math.cos(valor1), 2);
        
        return resultado;

    }

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("Introduza um angulo: ");
        double ang1 = teclado.nextDouble();
        double resultado= calcularSenCos(ang1);

        System.out.println("O Resultado de Sen^2 "+ang1+ "Cos^2 = "+resultado);
        teclado.close();
    }

}
