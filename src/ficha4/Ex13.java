package ficha4;
import java.util.Scanner;
public class Ex13 {

    static void somarPos(){
        Scanner teclado = new Scanner(System.in);
        int num=0, soma=0;
        do{
            System.out.println("Soma: "+soma);
            System.out.println("Introduza o numero:");
            num= teclado.nextInt();
            if(num>0){
                soma=soma+num;
            }
            
        }while(num!=0);

        teclado.close();

    }

    public static void main(String[] args) {
        somarPos();
    }

}
