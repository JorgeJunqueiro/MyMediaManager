package ficha4;
import java.util.Scanner;

public class Ex07 {


    static String fatorial(int num){
        String resultado="";
        int numFinal=1;

        for(int i=0;i<num;i++){

            numFinal=numFinal*(num-i);

        }
        
        resultado = String.format("Resultado de !%d: %d", num,numFinal);

        return resultado;


    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um Numero: ");
        int num = teclado.nextInt();
        System.out.println(fatorial(num));
        teclado.close();

    }
}
