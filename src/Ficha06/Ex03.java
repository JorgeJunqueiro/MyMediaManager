package Ficha06;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o seu nome: ");
        String nome = teclado.nextLine();
        int contadorSpace=0, contadortab=0;
        
        for(int i=0;i<nome.length();i++){
            if(nome.charAt(i)== ' '){
                contadorSpace++;
            }else if(nome.charAt(i)==9){
                contadortab++;
            }
        }
        System.out.printf("\nNome: %s \nNumero de espaços: %d\n Numero de tabs: %d",nome, contadorSpace,contadortab);

        teclado.close();
    }
}
