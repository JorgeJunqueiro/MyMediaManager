package TrabalhoFinal;

public class MyMediaManage {
    public static void main(String[] args) {
    int tamMax = 100;
    String[] titulo = new String[tamMax];
    char[] tipo = new char[tamMax];
    int[] ano = new int[tamMax];
    boolean[] visto = new boolean[tamMax];
    int[] rating = new int[tamMax];
    int nItens=10;
    titulo[0] = "The Matrix"; tipo[0] = 'F'; ano[0] = 1999; visto[0] = true; rating[0] = 9;
    titulo[1] = "Breaking Bad"; tipo[1] = 'S'; ano[1] = 2008; visto[1] = true; rating[1] = 10;
    titulo[2] = "Oppenheimer"; tipo[2] = 'F'; ano[2] = 2023; visto[2] = false; rating[2] = 0;
    titulo[3] = "Dark"; tipo[3] = 'S'; ano[3] = 2017; visto[3] = false; rating[3] = 0;
    fazedorTabela(tamMax, titulo, tipo, ano, visto, rating, nItens);
    }

    static void fazedorTabela(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        
        System.out.println("Nº\tTítulo\t\tTipo\tAno\tVisto\tRating\n--------kk--teste1------------------------------------------------");
        System.out.println("Teste1");
        for(int i=0;i<=nItens;i++){

            System.out.printf("%d\t%10s\t%c\t%d\t%b\t%d \n", i+1, titulo[i], tipo[i],ano[i],visto[i],rating[i]);

        }


    }


}

