package ficha4;
import java.util.Scanner;
public class Ex8 {
    static void estrellaDam(int num){
        for(int i=0;i<num;i++){
            System.out.println(" ");
            
            
            for(int j=0;j<=num;j++){
                
               System.out.print(" * ");
                
            }
            
          
        }
        
    }

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduza um Numero:");
        int num = teclado.nextInt();
        estrellaDam(num);
        teclado.close();
    }
}
