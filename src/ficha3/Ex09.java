package ficha3;
import java.util.Scanner;

public class Ex09 {
    static double abs(double original){
        double absoluto= original>0 ? original : -original;


           /* if (original<0) {
                absoluto = -original;
            }*/
                
        return absoluto;
    }
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Introduza um numero:\n");
        
        
        double num1 = teclado.nextDouble();

        System.out.printf("|%.2f| = %.2f.", num1, abs(num1));

        teclado.close();


    }
}
