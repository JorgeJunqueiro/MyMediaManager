package ficha22;
import java.util.Scanner;
public class Ex15 {

    static String conversorSegundos(int secs){
        int horas, minutos, segundos;

        horas= secs/3600;
        minutos=(secs%3600)/60;
        segundos = (secs%3600)%60;

        String resultado = String.format("Horas: %02d Minutos: %02d Segundos: %02d", horas, minutos,segundos);
        return resultado;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduza Segundos: ");
        int segundosIniciais = teclado.nextInt();
        System.out.println(conversorSegundos(segundosIniciais));
        teclado.close();
    }
}
