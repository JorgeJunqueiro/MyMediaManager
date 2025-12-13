package Ficha06;
import java.util.Scanner;
public class Ex02 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduza O seu primeiro e ultimo nome:");
    String nome = teclado.nextLine();
    String[] nomes=nome.split(" ");
    System.out.println(nome);
    System.out.printf("\n%s",nomes[1]);
    teclado.close();
}
}
