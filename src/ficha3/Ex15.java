package ficha3;
import java.util.Scanner;

public class Ex15 {
    static String devolverOrdenados(int val1, int val2, int val3){

        int numTemp=0;

        if (val1>val3) {
            //compara val2 com 1
            numTemp=val1;
            val1=val3;
            val3=numTemp;
        }else if(val1>val2){
            //compara val3 com 2
            numTemp=val2;
            val2=val1;
            val1=numTemp;
        }else if(val2>val3){
            //compara o val 3 com 1
            numTemp=val2;
            val2=val3;
            val3=numTemp;
        }

        String resultado = String.format("1º Numero: %d \n2º Numero: %d\n3º Numero: %d", val1, val2, val3);

        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza um numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduza um numero: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduza um numero: ");
        int num3 = teclado.nextInt();

        System.out.println(devolverOrdenados(num1, num2, num3));


        teclado.close();
    }
}
