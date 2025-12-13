package ficha4;
import java.util.Scanner;
public class Ex02 {

    static void tabuada(int numero){
        
        for(int i = 1;  i<11;i++)
            System.out.printf("%d x %d = %d\n", numero, i, i*numero);

    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o numero da tabuada: ");
        int tabuada = teclado.nextInt();
        tabuada(tabuada);
        teclado.close();
    }
}
