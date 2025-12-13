package ficha4;
import java.util.Scanner;
public class Ex19 {


    static String primo(int num){
        String resultado ="";

           
            boolean primo = true;
            for(int i=2;i<num;i++){
                if(num % i==0 ){
                    primo=false;
                }
                
            }
            if(primo==true){
                resultado= "É Primo";
            }else{
                resultado= "É não é Primo";
            }

        return resultado;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        
            System.out.println("Introduza um Numero Inteiro positivo: ");
            int num = teclado.nextInt();
            System.out.println(primo(num));



        teclado.close();
    }
}
