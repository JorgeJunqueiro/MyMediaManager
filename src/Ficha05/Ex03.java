package Ficha05;
import java.util.Scanner;
public class Ex03 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
    int [] numInt = new int[10];
    boolean existe =false;
    for(int i=0;i<numInt.length;i++){
        numInt[i]= (int) (Math.random()*10);
        
    }
    System.out.printf("Introduza um numero:");
    int numeroIcognico=teclado.nextInt();
    
    for(int j=0;j<numInt.length;j++){
        System.out.println(numInt[j]);
        if(numInt[j]==numeroIcognico){
            existe=true;
        }
    }
    if (existe==true) {
        System.out.println("O numero existe no Array.");
    }else{
        System.out.println("O numero não existe no Array.");
    }


    teclado.close();
    }
}
