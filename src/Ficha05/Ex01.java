package Ficha05;
import java.util.Scanner;
public class Ex01 {
public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int [] numInt = new int[10];
    int soma=0, media=0;
    for(int i=0;i<numInt.length;i++){
        System.out.printf("(%d/10)Introduza um numero:",i+1);
        numInt[i]=teclado.nextInt();
        soma=soma+numInt[i];
        media=soma/numInt.length;
    }

    System.out.printf("Soma:%d \nMedia=%d",soma, media);


    teclado.close();


}
}
