package Ficha06;
import java.util.Scanner;
public class Ex01 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduza o seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Nome: %s\nTamanho: %s\nPrimeiro: %s\nUltimo: %s",nome,nome.length(),nome.charAt(0),nome.charAt(nome.length()-1));





        teclado.close();
    }
}
