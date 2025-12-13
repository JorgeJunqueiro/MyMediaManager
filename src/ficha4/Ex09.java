package ficha4;
//import java.util.Scanner;
public class Ex09 {

    static String doisDados(){
        
        int numDados=0;
        int dado1, dado2;

        do{
            System.out.println("d1:"+ (dado1 = (int)( Math.random()*6+1)));
            System.out.println("d2:"+ (dado2 = (int)( Math.random()*6+1)));
            
            numDados++;

        }while(dado1!=6 || dado2!=6);

        String resultado = String.format("Numero de lançamentos: %d", numDados);
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(doisDados());
    }

}
