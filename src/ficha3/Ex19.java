package ficha3;
import java.util.Scanner;
public class Ex19 {
    static String IRS(double bruto){
        double rate=0f;
        if(bruto< 500) rate= 0;
        else if(bruto<650 ) rate = 0.015;
        else if (bruto<800) rate = 0.035;
        else if (bruto<1200) rate= 0.05;
        else if (bruto<2000) rate = 0.10;
        else if (bruto<3000) rate= 0.20;
        else if (bruto>=3000) rate= 0.35;
        
        double retencao =(bruto*rate);
        double salLiquido = bruto-retencao;

        String resultado = String.format("Salario Bruto: %.2f \nSalario \nLiquido: %.2f \nMontante a Reter: %.2f", bruto,salLiquido,retencao);

        return resultado;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduza o seu Salario bruto: ");
        double salario = teclado.nextDouble();

        System.out.println(IRS(salario));

        teclado.close();
    }
}
