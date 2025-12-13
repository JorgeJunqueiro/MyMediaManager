package ficha4;

import java.util.Scanner;

public class Ex01 {
    static void valores(int m, int n){
        for(int i=m;i<n;i++){
            System.out.println(i);

        }

    
    }

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Insira M: ");
        int m = teclado.nextInt();
        System.out.println("Insira N: ");
        int n = teclado.nextInt();
       
        valores(m, n);
        
        teclado.close();
    }
}
