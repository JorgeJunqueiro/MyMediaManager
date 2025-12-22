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
 *     Nº   : 20181052
 *     Curso: Engenharia Informática
 *     Turma: 2
 * ============================================================
 */




// erro quando aperta enter sem escolher opcoes ele crasha RESOLVIDO ()

// e o s de sair esta mal quando vai para alhum menu e volta // RESOLVIDO

// DICA char next() nao le o enter ou seja "" string vazio

package TrabalhoFinal;
import java.util.Scanner;

public class MyMediaManage {

    static void menuPrincipal (int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

       char opcao;
       
        
       limparTela();
       do{
           

            System.out.println("+==================  MENU  ========================+");          
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," * (V)isualizar");
            System.out.printf("|%-50s|%n"," * (M)arcar / Classificar");
            System.out.printf("|%-50s|%n"," * (E)ditar");
            System.out.printf("|%-50s|%n"," * Es(t)atísticas");
            System.out.printf("|%-50s|%n"," * (S)air");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");



            opcao = lerChar();

            switch (opcao) {
                case 'v':
                    menuVisualizar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'm':
                    menuMarcar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'e':
                    menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 't':
                    menuEstatisticas(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;    
                case 's':
                    break;
                    
                default:
                    limparTela();
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

     //------------------------------------------------Metodo: Ler Inteiros-----------------------------------------------
    static int lerInt (){

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        while (!teclado.hasNextInt()) {

            teclado.nextLine();    
        }

        int num = teclado.nextInt();
        return num;

    }

    //------------------------------------------------Metodo: Ler Inteiros com restricao de  intervalo-----------------------------------------------
    static int lerInt(int min, int max){

        
        int num = lerInt();;

        while (num < min || num > max) {

            num = lerInt();
            
        }

        
        
        return num;

    }


    //------------------------------------------------Metodo: Ler String-----------------------------------------------
    static String lerStringPalavra (){

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.next();
        return resultado;

    }

    //------------------------------------------------Metodo: ler char e tranforma para minuscula se necessario--------
    static char lerChar (){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\nEscolha sua opcao: ");
        char palavra = teclado.next().charAt(0);
        


        // Verificar de é Maisucla e converte para minuscula
        char opcao = palavra;
        if (opcao >= 'A' && opcao <= 'Z'){
            int dif = 'a' - 'A';
            return (char)(opcao+dif);
        }
        
        
        return opcao;
    }


    //------------------------------------------------Metodo: Cria cabeçalho tabela-------------------------
    static void cabecalhoTabela(){

        limparTela();
        System.out.printf("%-4s%s%15s%15s%15s%15s\n----------------------------------------------------------------------\n", "No", "Titulo", "Tipo", "Ano", "Visto", "Rating");
        
    }

    //------------------------------------------------Metodo: Cria tabela com array dos filmes-------------------------
    static void criarLinhaTabela(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens, int i){

       

        System.out.printf("%-4d%-18s%-15c%-14d%-14c%2d\n", i+1, titulo[i], tipo[i],ano[i],FazedorDeCruz(visto, i),rating[i]);
            
       
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

    //------------------------------------------------Metodo: Visualizar todos-------------------------
    static void visualizarTodos(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        
        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);
            
        }

        System.out.println("\n\n");


        }

    //------------------------------------------------Metodo: Visualizar por ano-------------------------


    static void visualizarPorAno(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        System.out.print("\nDigite o ano escolhido: ");

        int anoEscolhido = lerInt();

        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            if(anoEscolhido == ano[i]){

                criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);

            }
        }

        System.out.println("\n\n");
     
    }

    //------------------------------------------------Metodo: Visualizar por nao visto-------------------------
    static void visualizarPorNaoVisto(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){


        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            if(visto[i] == false){

                criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);

            }
        }

        System.out.println("\n\n");
     
    }

    //------------------------------------------------Metodo: Visualizar por ja visto-------------------------
    static void visualizarPorJaVisto(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){


        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            if(visto[i] == true){

                criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);

            }
        }

        System.out.println("\n\n");
     
    }  
    
    //------------------------------------------------Metodo: Visualizar por palavra que contenha no titulo------------------------
    static void visualizarPorPalavra(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        System.out.print("\nDigite a palavra escolhido: ");
        String palavra = lerStringPalavra();
        cabecalhoTabela();
        
        for(int i = 0; i < nItens; i++){

            int contador = 0;

            // Converte titulo do filme em array  divididos por palavras
            String [] tituloPorPalavra = titulo[i].split(" ");

                for(int j = 0; j < tituloPorPalavra.length; j++){

                    //verifica cada palavra do array comparando com a palavra introduzida pelo utilizador, ignorando sensitiveCase
                    //e tambem imprime quando encontrar apenas um elemento, ou seja, se conter palavras repetidas no filme ainda sim sera impresso 1 vez
                    if(tituloPorPalavra[j].equalsIgnoreCase(palavra) && contador < 1){

                        criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);
                        contador++;
                    }
                }
                        
        }
        System.out.println("\n\n");

    } 

    //------------------------------------------------Metodo: Visualizar por nota minima-------------------------
    static void visualizarPorRating(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        System.out.print("\nDigite a nota minima do filme devera ter: ");

        int notaEscolhida = lerInt();


        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            if(rating[i]>=notaEscolhida && notaEscolhida !=0){

                criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);

            }
        }

        System.out.println("\n\n");
     
    } 
                 
         
    //------------------------------------------------Metodo: Menu Visualizar---------------------------------------------
    static void menuVisualizar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao;
        limparTela();
        do{
            System.out.println("+==================  VISUALIZAR ===================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n", " * Visualizar (t)odos");
            System.out.printf("|%-50s|%n", " * Visualizar por (a)no exato");
            System.out.printf("|%-50s|%n", " * Visualizar por (j)a vistos");
            System.out.printf("|%-50s|%n", " * Visualizar por (n)ão vistos");
            System.out.printf("|%-50s|%n", " * Visualizar por (p)alavra no título");
            System.out.printf("|%-50s|%n", " * Visualizar por (r)ating mínimo");
            System.out.printf("|%-50s|%n", " * Visualização (m)ulticritério");
            System.out.printf("|%-50s|%n", " * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            

            switch (opcao) {
                case 't':
                    visualizarTodos(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'a':
                    visualizarPorAno(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'j':
                    visualizarPorJaVisto(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'n':
                    visualizarPorNaoVisto(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'p':
                    visualizarPorPalavra(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case 'r':
                    visualizarPorRating(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;

                case 'v':
                    //menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    limparTela();
                    break;
               
            
                default:
                    System.out.println("**** Opcao invalida ****\n\n");
                    break;
            }

            
        
        }while(opcao != 'v');
    }


    //------------------------------------------------Metodo: Menu Marcar---------------------------------------------
    static void menuMarcar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao;
        limparTela();
        do{
            System.out.println("+==================  MARCAR  ======================+");
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
            case 'v':
                //menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                limparTela();
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao != 'v');
    }

    //------------------------------------------------Metodo: Menu Editar--------------------------------------------
    static void menuEditar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao;
        limparTela();
        do{
            System.out.println("+==================  EDITAR  ======================+");
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
            case 'v':
                //menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                limparTela();
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao != 'v');
    }

    //------------------------------------------------Metodo: Menu Estatistica----------------------------------------
    static void menuEstatisticas(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao;
        limparTela();
        do{
            System.out.println("+==================  ESTATISTICA  =================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," * (P)ercentagem de vistos");
            System.out.printf("|%-50s|%n"," * (M)édia de rating dos vistosn");
            System.out.printf("|%-50s|%n"," * Distribuição por (d)écada");
            System.out.printf("|%-50s|%n"," * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            switch (opcao) {
            case 'v':
                //menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                limparTela();
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao != 'v');
    }


    //===============================================     MAIN     =================================================

    public static void main(String[] args) {

   
    int tamMax = 10;
    String[] titulo = new String[tamMax];
    char[] tipo = new char[tamMax];
    int[] ano = new int[tamMax];
    boolean[] visto = new boolean[tamMax];
    int[] rating = new int[tamMax];
    int nItens=4;
    titulo[0] = "The Matrix"; tipo[0] = 'F'; ano[0] = 1999; visto[0] = true; rating[0] = 9;
    titulo[1] = "Breaking Bad Bad"; tipo[1] = 'S'; ano[1] = 2008; visto[1] = true; rating[1] = 10;
    titulo[2] = "Oppenheimer"; tipo[2] = 'F'; ano[2] = 1999; visto[2] = false; rating[2] = 0;
    titulo[3] = "Dark"; tipo[3] = 'S'; ano[3] = 2017; visto[3] = false; rating[3] = 0;

    menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
   
    }

        

}

