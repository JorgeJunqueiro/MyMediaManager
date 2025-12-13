package ficha22;
import java.util.Scanner;
    
    



public class Ex01 {
    static int devolveInt(char ch){
        int valor = ch-'0';

        return valor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
    
        System.out.println("Introduza um numero de 0 a 9:\n");
        char algarismo = teclado.next().charAt(0);
        num = devolveInt(algarismo);
        System.out.println("O Algarismo Introuzido corresponde ao valor:"+ num);




        teclado.close();
    }
}
