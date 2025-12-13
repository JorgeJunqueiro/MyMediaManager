package Ficha06;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva uma Frase: ");
        String frase = teclado.nextLine();
        String vogais="aeiouAEIOUáéíóúÁÉÍÓÚâêîôûÂÊÎÔÛàèìòùÀÈÌÒÙãõÃÕ";
        int contador=0;
        for(int i=0; i<frase.length();i++){
            System.out.println(frase.charAt(i));
            for(int j=0;j <vogais.length();j++){
                
                    if(vogais.charAt(j)==frase.charAt(i)){
                        
                        contador++;
                    }
            }
        
    }
        //System.out.println(frase );
        System.out.println(contador);
        teclado.close();
    }
}

