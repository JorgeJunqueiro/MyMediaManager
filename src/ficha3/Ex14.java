package ficha3;
import java.util.Scanner;
public class Ex14 {
    static String verificarMaior(int num1, int num2, int num3){
        int maior1= (num1 > num2  ? num1 : num2);
        int maior2= maior1>num3 ? maior1 : num3;
        String resultado = String.format("O Numero %d é o maior", maior2);

        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduza um numero: ");
        int val1= teclado.nextInt();
        System.out.printf("Introduza um numero: ");
        int va2= teclado.nextInt();
        System.out.printf("Introduza um numero: ");
        int va3= teclado.nextInt();

        System.out.println(verificarMaior(val1, va2, va3));

        teclado.close();
    }
}
