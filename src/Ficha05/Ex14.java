package Ficha05;

public class Ex14 {
public static void main(String[] args) {
        int [] numInt = new int[20];
        
        for(int i=0;i<=numInt.length-1;i++){
            numInt[i]=i;
            System.out.printf("\n%d",numInt[i]);
        }

        System.out.printf("\nInverso.");

        for(int i=numInt.length-1;i>=0;i--){
            
            System.out.printf("\n%d",numInt[i]);
        }
    }
}
