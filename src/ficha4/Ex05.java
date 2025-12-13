package ficha4;
import java.util.Scanner;
public class Ex05 {

    static void tabelaDinheirp(double rJuros, double pEuros, int anos){
    double resultado=0f;
    System.out.printf("|Ano\t|Euros\t| Dinheiro Investido: %.2f\tJuros: %.2f\tAnos: %d\n-----------------\n",pEuros,rJuros, anos);
        for(int i = 1; i<=anos; i++){
            
            resultado =resultado + (pEuros*Math.exp(rJuros*anos));
            System.out.printf("|%d\t%.2f\t|\n", i,resultado);
        }


    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza os anos(t):");
        int anos = teclado.nextInt();
        System.out.println("Introduza o dinheiro a investir(p):");
        double euros = teclado.nextDouble();
        System.out.println("Introduza os juro anual(r):");
        double juros= (teclado.nextDouble())/100;
        tabelaDinheirp(juros, euros, anos);


        teclado.close();
    }
}
