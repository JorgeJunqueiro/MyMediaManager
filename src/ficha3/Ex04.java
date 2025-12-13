package ficha3;
import java.util.Scanner;
public class Ex04 {

    static String trocas(int var1, int var2){
        String resultado;
        
        
        if(var2>var1){
            int var3 = var1;
            var1=var2;
            var2=var3;
        }

        resultado = String.format("Nova Ordem: 1º Valor: %d, 2º Valor %d", var1, var2);
        return resultado;
    }

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduza o 1º valor: ");
    int valor1 = teclado.nextInt();
    System.out.printf("Introduza o 2º valor: ");
    int valor2 = teclado.nextInt();
    System.out.printf(trocas(valor1, valor2));
    teclado.close();
}

}
