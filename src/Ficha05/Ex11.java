package Ficha05;
//importante
import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int [] arr1 = new int[25];

    
    for(int i=0;i<arr1.length;i++){
        arr1[i]=i+1;
        System.out.printf("Numero %d nota: %d\n",i+1,arr1[i]);
    }

    System.out.printf("\nIntroduza um numero que queira introduzir no Array: ");
    int num = teclado.nextInt();

    
    for(int i=arr1.length-1;i>num;i--){
        arr1[i]=arr1[i-1];
    }

    for(int i=0;i<arr1.length;i++){
        if(arr1[i]==num && num!=arr1.length){
            arr1[i+1]=num;
            break;
        }
    }
  
    for(int i=0;i<arr1.length;i++){
        System.out.printf("Numero %d nota: %d\n",i+1,arr1[i]);
    }  
    
    teclado.close();
    }
    
}

