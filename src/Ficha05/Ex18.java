package Ficha05;
import java.util.Scanner;
public class Ex18 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dia,mes, ano;
        System.out.println("Introduza uma data(formato dd/mm/aaaa): ");
        dia=teclado.nextInt(); 
        mes=teclado.nextInt();
        ano=teclado.nextInt(); 
        System.out.printf("%d de %s de %d", dia, meses[mes-1],ano );

        teclado.close();
    }
}
