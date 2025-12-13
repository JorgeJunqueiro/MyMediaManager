package TrabalhoFinal;

import java.util.Scanner;

public class MyMediaManage {
    public static void main(String[] args) {

    menuPrincipal();
    int tamMax = 100;
    String[] titulo = new String[tamMax];
    char[] tipo = new char[tamMax];
    int[] ano = new int[tamMax];
    boolean[] visto = new boolean[tamMax];
    int[] rating = new int[tamMax];
    int nItens=3;
    titulo[0] = "The Matrix"; tipo[0] = 'F'; ano[0] = 1999; visto[0] = true; rating[0] = 9;
    titulo[1] = "Breaking Bad"; tipo[1] = 'S'; ano[1] = 2008; visto[1] = true; rating[1] = 10;
    titulo[2] = "Oppenheimer"; tipo[2] = 'F'; ano[2] = 2023; visto[2] = false; rating[2] = 0;
    titulo[3] = "Dark"; tipo[3] = 'S'; ano[3] = 2017; visto[3] = false; rating[3] = 0;
    fazedorTabela(tamMax, titulo, tipo, ano, visto, rating, nItens);
    }

    static void fazedorTabela(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        
        System.out.printf("%-4s%s%15s%15s%15s%15s\n----------------------------------------------------------------------\n", "No", "Titulo", "Tipo", "Ano", "Visto", "Rating");
        for(int i=0;i<=nItens;i++){

            System.out.printf("%-4d%-18s%-15c%-14d%-14c%2d\n", i+1, titulo[i], tipo[i],ano[i],FazedorDeCruz(visto, i),rating[i]);

        }


    }

    static char FazedorDeCruz(boolean visto[],int i){
        //este metodo retorna x ou vazio conforme foi visto
        char cruz='X', vazio= ' ';
        if(visto[i]==true){
            return cruz;
        }else{
            return vazio;
        }

    }


    //Metodo para Ler String
    static String lerString (){

        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.nextLine();
        
        return resultado;

    }

    static char lerchar (){

        
        String palavra = lerString();
        char opcao = palavra.charAt(0);

        
        return opcao;

    }



    public static void limparTela() {
    try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println(e);
    }
    }

    static void menuPrincipal (){

        char opcao = 'a';

       do{

            limparTela();
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-25s %25s%n", "","|");
            System.out.printf("|%-25s %25s%n"," * (V)isualizar","|");
            System.out.printf("|%-25s %25s%n"," * (M)arcar / Classificar","|");
            System.out.printf("|%-25s %25s%n"," * (E)ditar","|");
            System.out.printf("|%-25s %25s%n"," * Es(t)atísticas","|");
            System.out.printf("|%-25s %25s%n"," * (S)air","|");
            System.out.printf("|%-25s %25s%n", "","|");
            System.out.println("+==================================================+");



            System.out.print("\n\nEscolha sua opcao: ");
            opcao = lerchar();

        }while (opcao != 's');
         

        

    }

}

