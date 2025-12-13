package ficha4;
import java.util.Scanner;
public class Ex18 {

    static void minMai(){
        Scanner teclado = new Scanner(System.in);
        char input;
        do{
            System.out.println("Introduza um Character: ");
            input = teclado.nextLine().charAt(0);
            if((input >= 65 && input <=90)||(input>=97 && input <= 122)){
                System.out.println(input + " Pertence.");
            }else{System.out.println(input+" Não pertence.");}
        }while(input!= '.' );

        teclado.close();
    }

    public static void main(String[] args) {
        minMai();
    }


}
