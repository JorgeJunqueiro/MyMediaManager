package TrabalhoFinal;
import java.util.Scanner;

public class MyMediaManage {


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

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.nextLine();
        return resultado;

    }

    // Metodo ler char e tranforma para minuscula
    static char lerchar (){

        System.out.print("\n\nEscolha sua opcao: ");
        String palavra = lerString();

        //Verifica se o usuario digitou mais que 1 letra
        if(palavra.length() > 1){
            System.out.println("\n**** Escolha apenas uma letra ****");
            lerchar();
        }

        // Verificar de é Maisucla e converte para minuscula
        char opcao = palavra.charAt(0);
        if (opcao >= 'A' && opcao <= 'Z'){
            int dif = 'a' - 'A';
            return (char)(opcao+dif);
        }
        

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
        limparTela();

       do{

            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-25s %25s%n", "","|");
            System.out.printf("|%-25s %25s%n"," * (V)isualizar","|");
            System.out.printf("|%-25s %25s%n"," * (M)arcar / Classificar","|");
            System.out.printf("|%-25s %25s%n"," * (E)ditar","|");
            System.out.printf("|%-25s %25s%n"," * Es(t)atísticas","|");
            System.out.printf("|%-25s %25s%n"," * (S)air","|");
            System.out.printf("|%-25s %25s%n", "","|");
            System.out.println("+==================================================+");



            opcao = lerchar();

            switch (opcao) {
                case ('v'):
                    System.out.println("Menu Visualizar\n\n\n");
                    
                    break;
            
                default:
                    break;
            }

        }while (opcao != 's');
         

    }

    static void menuMarcar(){
        //Este é o menu de marcação.
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-25s %25s%n"," * Maracar como (V)isto por posição","|");
            System.out.printf("|%-25s %25s%n"," * Marcar como visto por (t)ítulo","|");
            System.out.printf("|%-25s %25s%n"," * (D)esmarcar último marcado como visto","|");
            System.out.printf("|%-25s %25s%n"," * (A)tribuir / alterar rating por números","|");
            System.out.printf("|%-25s %25s%n"," * (V)oltar","|");
            System.out.println("+==================================================+");
            
            System.out.print("\n\nEscolha sua opcao: ");
            opcao = lerchar();
        
        }while(opcao!='v');
    }

    static void adicionador(){
        //Este é o menu permite a adicionar ou eleminar conteudos.
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-25s %25s%n"," * (A)dicionar item no fim","|");
            System.out.printf("|%-25s %25s%n"," * Adicionar (i)tem na posição n","|");
            System.out.printf("|%-25s %25s%n"," * Apagar item na (p)osição n","|");
            System.out.printf("|%-25s %25s%n"," * Apagar itens (v)istos","|");
            System.out.printf("|%-25s %25s%n"," * (V)oltar","|");
            System.out.println("+==================================================+");
            
            System.out.print("\n\nEscolha sua opcao: ");
            opcao = lerchar();
        
        }while(opcao!='v');
    }

    static void Estatisticas(){
        //Este é o menu permite o utilizador escolher que estatisticas pretende ver.
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-25s %25s%n"," * (P)ercentagem de vistos","|");
            System.out.printf("|%-25s %25s%n"," * (M)édia de rating dos vistosn","|");
            System.out.printf("|%-25s %25s%n"," * Distribuição por (d)écada","|");
            System.out.printf("|%-25s %25s%n"," * (V)oltar","|");
            System.out.println("+==================================================+");
            
            System.out.print("\n\nEscolha sua opcao: ");
            opcao = lerchar();
        
        }while(opcao!='v');
    }

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

        
        

}

