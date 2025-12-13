package ficha4;
import java.util.Scanner;
public class Ex03 {
    static void numInteiros(int limite){
        int soma=0;
        int i=0;
        for(i=1; soma<limite; i++){
            soma=soma+i;
            
        }
        System.out.printf("%d\n",i);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o nmero Limite: ");
        int limite = teclado.nextInt();
        numInteiros(limite);
        teclado.close();
    }
}
