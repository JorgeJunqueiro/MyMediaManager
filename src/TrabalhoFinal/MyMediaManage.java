/*
 * ============================================================
 * Projeto: My Media Manager
 *
 * Alunos:
 *   - Nome : Hector Silva
 *     Nº   : 20250360
 *     Curso: Engenharia Informática
 *     Turma: 2
 *
 *   - Nome : Jorge Junqueiro
 *     Nº   : XXXXXXXX
 *     Curso: Engenharia Informática
 *     Turma: 2
 * ============================================================
 */




package TrabalhoFinal;
import java.util.Scanner;

public class MyMediaManage {

    static void menuPrincipal (int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

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



            opcao = lerChar();

            switch (opcao) {
                case ('v'):
                    menuVisualizar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case ('m'):
                    menuMarcar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case ('e'):
                    menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case ('t'):
                    menuEstatisticas(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;    
            
                default:
                    System.out.println("**** Opcao invalida ****\n\n");
                    break;
            }

        }while (opcao != 's');
         

    }

    //------------------------------------------------Metodo: Limpar a tela do terminal--------------------------------
    public static void limparTela() {
    try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println(e);
    }
    }


    //------------------------------------------------Metodo: Ler String-----------------------------------------------
    static String lerString (){

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.nextLine();
        return resultado;

    }

    //------------------------------------------------Metodo: ler char e tranforma para minuscula se necessario--------
    static char lerChar (){

        System.out.print("\n\nEscolha sua opcao: ");
        String palavra = lerString();

        //Verifica se o usuario digitou mais que 1 letra
        if(palavra.length() > 1){
            System.out.println("\n**** Escolha apenas uma letra ****");
            lerChar();
        }

        // Verificar de é Maisucla e converte para minuscula
        char opcao = palavra.charAt(0);
        if (opcao >= 'A' && opcao <= 'Z'){
            int dif = 'a' - 'A';
            return (char)(opcao+dif);
        }
        

        return opcao;
    }




    //------------------------------------------------Metodo: Cria tabela com array dos filmes-------------------------
    static void fazedorTabela(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        limparTela();
        
        System.out.printf("%-4s%s%15s%15s%15s%15s\n----------------------------------------------------------------------\n", "No", "Titulo", "Tipo", "Ano", "Visto", "Rating");
        for(int i=0;i<nItens;i++){

            System.out.printf("%-4d%-18s%-15c%-14d%-14c%2d\n", i+1, titulo[i], tipo[i],ano[i],FazedorDeCruz(visto, i),rating[i]);
            
        }

        System.out.println("\n\n\n");
    }


    //------------------------------------------------Metodo: retorna x ou vazio conforme foi visto--------------------
    static char FazedorDeCruz(boolean visto[],int i){
      
        char cruz='X', vazio= ' ';
        if(visto[i]==true){
            return cruz;
        }else{
            return vazio;
        }

    }

     //------------------------------------------------Metodo: Menu Visualizar---------------------------------------------
    static void menuVisualizar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================================================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n", " * Visualizar (t)odos");
            System.out.printf("|%-50s|%n", " * Visualizar por (a)no exato");
            System.out.printf("|%-50s|%n", " * Visualizar por (n)ão vistos");
            System.out.printf("|%-50s|%n", " * Visualizar por (p)alavra no título");
            System.out.printf("|%-50s|%n", " * Visualizar por (r)ating mínimo");
            System.out.printf("|%-50s|%n", " * Visualização (m)ulticritério");
            System.out.printf("|%-50s|%n", " * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            

            switch (opcao) {
                case ('t'):
                    fazedorTabela(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;

                case ('v'):
                    menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
               
            
                default:
                    System.out.println("**** Opcao invalida ****\n\n");
                    break;
            }
        
        }while(opcao!='v');
    }


    //------------------------------------------------Metodo: Menu Marcar---------------------------------------------
    static void menuMarcar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," * Maracar como (V)isto por posição");
            System.out.printf("|%-50s|%n"," * Marcar como visto por (t)ítulo");
            System.out.printf("|%-50s|%n"," * (D)esmarcar último marcado como visto");
            System.out.printf("|%-50s|%n"," * (A)tribuir / alterar rating por números");
            System.out.printf("|%-50s|%n"," * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            switch (opcao) {
            case ('v'):
                menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao!='v');
    }

    //------------------------------------------------Metodo: Menu Editar--------------------------------------------
    static void menuEditar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," * (A)dicionar item no fim");
            System.out.printf("|%-50s|%n"," * Adicionar (i)tem na posição n");
            System.out.printf("|%-50s|%n"," * Apagar item na (p)osição n");
            System.out.printf("|%-50s|%n"," * Apagar itens (v)istos");
            System.out.printf("|%-50s|%n"," * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            switch (opcao) {
            case ('v'):
                menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao!='v');
    }

    //------------------------------------------------Metodo: Menu Estatistica----------------------------------------
    static void menuEstatisticas(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   MENU  =======================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," * (P)ercentagem de vistos");
            System.out.printf("|%-50s|%n"," * (M)édia de rating dos vistosn");
            System.out.printf("|%-50s|%n"," * Distribuição por (d)écada");
            System.out.printf("|%-50s|%n"," * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            switch (opcao) {
            case ('v'):
                menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao!='v');
    }


    //===============================================     MAIN     =================================================

    public static void main(String[] args) {

   
    int tamMax = 100;
    String[] titulo = new String[tamMax];
    char[] tipo = new char[tamMax];
    int[] ano = new int[tamMax];
    boolean[] visto = new boolean[tamMax];
    int[] rating = new int[tamMax];
    int nItens=4;
    titulo[0] = "The Matrix"; tipo[0] = 'F'; ano[0] = 1999; visto[0] = true; rating[0] = 9;
    titulo[1] = "Breaking Bad"; tipo[1] = 'S'; ano[1] = 2008; visto[1] = true; rating[1] = 10;
    titulo[2] = "Oppenheimer"; tipo[2] = 'F'; ano[2] = 2023; visto[2] = false; rating[2] = 0;
    titulo[3] = "Dark"; tipo[3] = 'S'; ano[3] = 2017; visto[3] = false; rating[3] = 0;

    menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
   
    }

        

}

