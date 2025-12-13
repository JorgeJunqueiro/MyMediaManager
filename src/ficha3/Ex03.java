package ficha3;
import java.util.Scanner;


public class Ex03 {

static String divisaoSegura(int num1, int num2){
String resultado = String.format("Não é Possivel Dividir por 0.");
    if (num2!=0) {
       int divisao= num1/num2;
       resultado = String.format("%d / %d = %d", num1, num2, divisao); 
      }
return resultado;
}

public static void main(String[] args) {

Scanner teclado= new Scanner(System.in);

System.out.printf("Introduza o Numerador: ");
int numerador = teclado.nextInt();
System.out.printf("Introduza o Denominador: ");
int denominador = teclado.nextInt();
System.out.printf(divisaoSegura(numerador, denominador));

teclado.close();

}

}
