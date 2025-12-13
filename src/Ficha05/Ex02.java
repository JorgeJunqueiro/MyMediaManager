package Ficha05;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int [] numInt = new int[10];
    int soma=0, media=0;
    
    for(int i=0;i<numInt.length;i++){
        System.out.printf("(%d/10)Introduza um numero:",i+1);
        numInt[i]=teclado.nextInt();
        if(numInt[i]==0){
            break;
        }
    }

    for(int j=0;j<numInt.length;j++){
        System.out.printf("\n(%d/10)Numero introduzido:%d",j+1,numInt[j]);
        soma=soma+numInt[j];
        media=soma/numInt.length;
    }

    System.out.printf("\nSoma:%d \nMedia=%d",soma, media);


    teclado.close();
    }
}
