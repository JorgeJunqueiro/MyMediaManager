package ficha4;
import java.util.Scanner;
public class Ex20 {
    static void estrelas(int num){

        for(int i=0;i<=num;i++){
            System.out.print("*");
        }

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0;
            do{
                System.out.println("\nIntroduza um numero: ");
                num = teclado.nextInt();

                if(num!=0){
                    estrelas(num);
                }


            }while(num!=0);
        teclado.close();
    }

}
