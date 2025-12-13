package Ficha06;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza uma frase: ");
        String frase=teclado.nextLine();
        System.out.println("Introduza o tamanho dos segmentos.");
        int n = teclado.nextInt();
        /*for(int i=0;i <= frase.length()-1;i++){
            System.out.printf("%c",frase.charAt(i));
            if(i%n-1==0){
                System.out.println();
            }
        } */
        do{
             frase = frase + " ";
        }while(frase.length()%n!=0);
        do{
           System.out.printf("\n%s",frase.substring(n-3,n));
           n=n+3;
        }while(n<=frase.length());
        teclado.close();
        //abcdefghijklmnop
    }
}
