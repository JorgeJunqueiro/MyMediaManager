package ficha22;
import java.util.Scanner;

public class Ex17 {


    static String peso(int bananas, int morangos, int mangas){
        double pBananas=0.15375;
        double pMorangos=0.3222222222222222222222222222222;
        double pMangas=0.36166666666666666666666666666667;
        double pTotalbananas = bananas * pBananas;
        double pTotalMorangos = morangos * pMorangos;
        double pTotalMangos = mangas * pMangas;
        

        String resultados = String.format("\nFruta\t|Quantidade\t| Peso\t|\n--------------------------------|\nBananas |\t %d\t| %2.2f\t|\nMorangos|\t %d\t| %2.2f\t|\nMangos  |\t %d\t| %2.2f\t|", bananas,pTotalbananas,morangos,pTotalMorangos,mangas,pTotalMangos);

        return resultados;
    }

    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduza quatas bananas: ");
        int banana = teclado.nextInt();
        System.out.println("Introduza quatos morangos: ");
        int morango = teclado.nextInt();
        System.out.println("Introduza quatas mangas: ");
        int mango = teclado.nextInt();
        System.out.printf(peso(banana, morango, mango));
        teclado.close();

    }
}
