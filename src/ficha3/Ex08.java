package ficha3;
import java.util.Scanner;

public class Ex08 {

    static String verificadorIntervalo(int num1){
        String resultado = String.format("Está no Intervalo [50,100], Valor: %d",num1);

            if(num1<50){
                resultado = String.format("Não está no Intervalo [50,100] e é menor que 50, Novo Valor: %d",num1=50);
            }else if(num1>100){
                resultado = String.format("Não está no Intervalo [50,100] e é maior que 100, Novo Valor: %d",num1=100);
            }


        return resultado;
    }

    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.printf("Introduza um numero: ");

    int numero= teclado.nextInt(); 

    System.out.printf(verificadorIntervalo(numero));

    teclado.close();
        
    }

}
