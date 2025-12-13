package Treinos;

public class Ex02 {
    public static void main(String[] args) {
        int val1 = 5;
        System.out.println("Trinagulo");
        for(int i=0;i<=val1;i++){
            System.out.println();

            for(int k=val1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=val1;j>=val1-i;j--){
                System.out.print("*");
            }
        }
    }
}
