package Ficha06;
import java.util.Scanner;
public class Ex05 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduza uma frase:");
    String frase = teclado.nextLine();
    String[] palavras= frase.split(" ");
    String palavraMaior=" ";

    for(int i=0;i<palavras.length;i++){
        if(palavras[i].length()>palavraMaior.length()){
            palavraMaior=palavras[i];

        }
    }
    System.out.printf("A maior palavra é: %s",palavraMaior);
    teclado.close();
}
}
