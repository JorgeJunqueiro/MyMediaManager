package ficha3;
import java.util.Scanner;
public class Ex20 {
    static String data(int dia, int mes, int ano){

        String mesS="";
        switch (mes) {
            case 1:
                 mesS="Janeiro";
                break;
            case 2:
                 mesS="Fevereiro";
                break;
            case 3:
                 mesS="Março";
                break;
            case 4:
                 mesS="Abril";
                break;
            case 5:
                 mesS="Maio";
                break;
            case 6:
                 mesS="Junho";
                break;
            case 7:
                 mesS="Julho";
                break;
            case 8:
                 mesS="Agosto";
                break;
            case 9:
                mesS="Setembro";
                break;
            case 10:
                mesS="Outubro";
                break;
            case 11:
                mesS="Novembro";
                break;
            case 12:
                mesS="Dezembro";
                break;
        
            default:
                break;
        }

        String resultado = String.format("%02d/%02d/%d\n%d de %s de %d",dia,mes,ano,dia,mesS,ano );
        
        return resultado;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o dia: ");
        int dia = teclado.nextInt();
        System.out.println("Introduza o mês: ");
        int mes = teclado.nextInt();
        System.out.println("Introduza o ano: ");
        int ano = teclado.nextInt();
        
        System.out.println(data(dia, mes, ano));
        
        teclado.close();
        
    }
}
