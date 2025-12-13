package ficha3;
import java.util.Scanner;
public class Ex17 {

    static String IMC(double peso, double altura){

        double imc = peso / (altura*altura);
        String categoria = "";
        if(imc < 18.5){
            categoria="Baixo Peso.";
        }else if(imc>=30){
            categoria="Obeso.";
        }else if(imc >25 && imc < 30){
            categoria="Excesso de peso";
        }else{
            categoria="Peso Normal.";
        }


        String resultado = String.format( "Peso: %.2f \nAltura: %.2f \nIMC:%.2f \nCategoria: %s", peso, altura, imc, categoria);

        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o Peso:");
        double peso = teclado.nextDouble();
        System.out.println("Introduza o altura:");
        double altura = teclado.nextDouble();

        System.out.println(IMC(peso, altura));


        teclado.close();
    }


}
