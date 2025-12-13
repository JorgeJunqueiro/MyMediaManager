package ficha4;
import java.util.Scanner;
public class Ex4 {

    static void fibonacio(int limite){
        int num=0;
        int numAnterior=0;
        int numAnteriorAnterior=1;
        int i=1;
        do{
            System.out.printf("f%d = %d\n",i, num);
            num = numAnteriorAnterior+numAnterior; 
            numAnteriorAnterior=numAnterior;
            numAnterior=num;
            i = i+1;
//            numAnterior = num;
            
        }while(num<limite);

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o numero limite:");
        int limite=teclado.nextInt();
        fibonacio(limite);
        teclado.close();
    }
}
