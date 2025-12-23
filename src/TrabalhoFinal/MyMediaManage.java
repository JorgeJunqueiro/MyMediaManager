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


/*----------------------------------A FAZERES/ NOTAS --------------------------------------------------
ha um bug na saida do programa, repete varias vezes. *corrijido
verificar o meu codigo. (jjunkas)
fiz metedos para leitura de boolean, int, ler rating, movimentar e adicionar (tem que se organizarar)
falta fazer apagar na linha e apagar vistos *feito
vou jantar *feito
coloquei tudo do editar em metedos bonitinhos zaga zaga.
temos de ter atenção aos cases para correspondrem as letras. * feito atenção as maiusculas
temos tambem de ter atenção as proteções dos inputs.
*/

package TrabalhoFinal;
import java.util.Scanner;
//=================================================================== MENU PRINCIPAL ============================================================
public class MyMediaManage {

    static void menuPrincipal (int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

       char opcao = 'a';
        
       limparTela();
       do{
            
            System.out.println(nItens);//para debug apagar depois
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
                case ('V'):
                    menuVisualizar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case ('M'):
                    menuMarcar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case ('E'):
                    menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;
                case ('t'):
                    menuEstatisticas(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;    
                case ('S'):
                    break; 
            
                default:
                    limparTela();
                    System.out.println("**** Opcao invalida ****\n\n");
                    break;
            }

        }while (opcao != 's');
         

    }

    //-------------------------------- Metodo: Limpar a tela do terminal--------------------------------
    public static void limparTela() {
    try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println(e);
    }
    }


    //-------------------------------- Metodo: Ler String-----------------------------------------------
    static String lerString (){


        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.nextLine();
        //teclado.close();
        return resultado;

    }

    //-------------------------------- Metodo: Ler Inteiros-----------------------------------------------
    static int lerInt(){

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        while (!teclado.hasNextInt()) {

            teclado.nextLine();    
        }

        int num = teclado.nextInt();
        return num;

    }

    //-------------------------------- Metodo: Ler Inteiros com restricao de  intervalo-----------------------------------------------
    static int lerInt(int min, int max){

        
        int num = lerInt();;

        while (num < min || num > max) {

            num = lerInt();
            
        }

        
        
        return num;

    }


    //-------------------------------- Metodo: Ler String por palavra -----------------------------------------------
    static String lerStringPalavra (){

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.next();
        return resultado;

    }

    //-------------------------------- Metodo: ler char e tranforma para minuscula se necessario--------
    static char lerChar (){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\nEscolha sua opcao: ");
        char letra = teclado.next().charAt(0);
         
        
        return letra;
    }

 




    //-------------------------------- Metodo: Cria tabela com array dos filmes-------------------------
    static void fazedorTabela(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        limparTela();
        
        System.out.printf("%-4s%s%15s%15s%15s%15s\n----------------------------------------------------------------------\n", "No", "Titulo", "Tipo", "Ano", "Visto", "Rating");
        for(int i=0;i<nItens;i++){

            System.out.printf("%-4d%-18s%-15c%-14d%-14c%2d\n", i+1, titulo[i], tipo[i],ano[i],FazedorDeCruz(visto, i),rating[i]);
            
        }
 
        System.out.println("\n\n\n");
    }

    //-------------------------------- Metodo: Cria cabeçalho tabela-------------------------
    static void cabecalhoTabela(){

        limparTela();
        System.out.printf("%-4s%s%15s%15s%15s%15s\n----------------------------------------------------------------------\n", "No", "Titulo", "Tipo", "Ano", "Visto", "Rating");
        
    }

    //-------------------------------- Metodo: Cria tabela com array dos filmes uma linha-------------------------
    static void criarLinhaTabela(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens, int i){

       

        System.out.printf("%-4d%-18s%-15c%-14d%-14c%2d\n", i+1, titulo[i], tipo[i],ano[i],FazedorDeCruz(visto, i),rating[i]);
            
       
    }    


    //-------------------------------- Metodo: retorna x ou vazio conforme foi visto--------------------
    static char FazedorDeCruz(boolean visto[],int i){
      
        char cruz='X', vazio= ' ';
        if(visto[i]==true){
            return cruz;
        }else{
            return vazio;
        }

    }

    

    //=========================================================== MENU VISUALIZAR ==========================================================
    static void menuVisualizar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================================================+");
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
                case 'm':
                    visualizarPorMulticriterio(tamMax, titulo, tipo, ano, visto, rating, nItens);
                    break;

                case 'v':
                    limparTela();
                    break;
               
            
                default:
                    System.out.println("**** Opcao invalida ****\n\n");
                    break;
            }
        
        }while(opcao!='v');
    }

    //-------------------------------- Metodo: Visualizar todos-------------------------
    static void visualizarTodos(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){

        
        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);
            
        }

        System.out.println("\n\n");


        }

    //-------------------------------- Metodo: Visualizar por ano-------------------------


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

    //-------------------------------- Metodo: Visualizar por nao visto-------------------------
    static void visualizarPorNaoVisto(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){


        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            if(visto[i] == false){

                criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);

            }
        }

        System.out.println("\n\n");
     
    }

    //-------------------------------- Metodo: Visualizar por ja visto-------------------------
    static void visualizarPorJaVisto(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){


        cabecalhoTabela();
        for(int i = 0; i < nItens; i++){

            if(visto[i] == true){

                criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);

            }
        }

        System.out.println("\n\n");
     
    }  
    
    //-------------------------------- Metodo: Visualizar por palavra que contenha no titulo------------------------
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

    //-------------------------------- Metodo: Visualizar por nota minima-------------------------
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

    //-------------------------------- Metodo: MultiCriterio-------------------------
    static void visualizarPorMulticriterio(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
     
    int opcaoTipo, opcaoVisto, opcaoAno, opcaoNota;
    int anoMin = -1, anoMax = -1;
    int notaMin = -1, notaMax = -1;
     
                         
        do {
            limparTela();
            System.out.println("+==================   Filtrar por tipo?  ==========+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," 1 - Filme");
            System.out.printf("|%-50s|%n"," 2 - Série");
            System.out.printf("|%-50s|%n"," 0 - Não filtrar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            System.out.print("+\n\n opcao:"); 
            opcaoTipo = lerInt();
        } while (opcaoTipo < 0 || opcaoTipo > 2);
                            
        
        do {
            limparTela();                  
            System.out.println("+==================   Filtrar por status?  ========+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," 1- Já visto");
            System.out.printf("|%-50s|%n"," 2 - Não visto");
            System.out.printf("|%-50s|%n"," 0 - Não filtrar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            System.out.print("+\n\n opcao:");                  
            opcaoVisto = lerInt(); 
        } while (opcaoVisto < 0 || opcaoVisto > 2);
                            
        do {
            limparTela();
            System.out.println("+==================   Filtrar por ano?  ===========+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," 1- Ano específico");
            System.out.printf("|%-50s|%n"," 2 - Intervalo de anos");
            System.out.printf("|%-50s|%n"," 0 - Não filtrar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");   
            System.out.print("+\n\n opcao:");                  
            opcaoAno = lerInt();   
        } while (opcaoAno < 0 || opcaoAno > 2);
        
        if (opcaoAno == 1) {
            System.out.print("Ano: ");
            anoMin = anoMax = lerInt();
        } 
        else if (opcaoAno == 2) {
            System.out.print("Ano inicial: ");
            anoMin = lerInt();
            System.out.print("Ano final: ");
            anoMax = lerInt();
        }
        
    
        do {
            limparTela();
            System.out.println("+==================   Filtrar por nota?  ==========+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," 1- Maior ou igual a X");
            System.out.printf("|%-50s|%n"," 2 - Menor ou igual a X");
            System.out.printf("|%-50s|%n"," 3 - Entre X e Y");
            System.out.printf("|%-50s|%n"," 0 - Não filtrar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");   
            System.out.print("+\n\n opcao:");                  
            opcaoNota = lerInt();   
        } while (opcaoNota < 0 || opcaoNota > 3);
        
        if (opcaoNota == 1) {
            System.out.print("Nota mínima: ");
            notaMin = lerInt();
            notaMax = -1; // sem limite superior
        } 
        else if (opcaoNota == 2) {
            System.out.print("Nota máxima: ");
            notaMax = lerInt();
            notaMin = -1; // sem limite inferior
        } 
        else if (opcaoNota == 3) {
            System.out.print("Nota mínima: ");
            notaMin = lerInt();
            System.out.print("Nota máxima: ");
            notaMax = lerInt();
        } 
        else {
            // não filtrar
            notaMin = -1;
            notaMax = -1;
        }

        cabecalhoTabela();

        for (int i = 0; i < nItens; i++) {

            // 1 FILME / 2 SERIE    
            if (opcaoTipo == 1 && tipo[i] != 'F') continue;
            if (opcaoTipo == 2 && tipo[i] != 'S') continue;

            // 1 TRUE / 2 FALSE  
            if (opcaoVisto == 1 && !visto[i]) continue;
            if (opcaoVisto == 2 && visto[i]) continue;

            if (anoMin != -1 && ano[i] < anoMin) continue;
            if (anoMax != -1 && ano[i] > anoMax) continue;

            if (notaMin != -1 && rating[i] < notaMin) continue;
            if (notaMax != -1 && rating[i] > notaMax) continue;

            criarLinhaTabela(tamMax, titulo, tipo, ano, visto, rating, nItens, i);
        }
                          
                              
                              

        
 

     
    } 


    //=========================================================== MENU MARCAR ==========================================================
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
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao!='v');
    }

    //=========================================================== MENU EDITAR ==========================================================
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

            case ('A'): //Adinciona filme no final
                
                adicionarFinal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                
                break;
            case ('i') : //Introduzir na posição. (Movimenta e adiciona).
                
                adicionarPos(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;

            case('p'): //Apaga na Posição pretendida.
                apagarPos(tamMax, titulo, tipo, ano, visto,  rating,  nItens);
                break;         
            
            case('v'): //apaga os vistos
                apagarVistos(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;

            case ('V'): //Volta para o menu principal.
                menuPrincipal(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;
                   
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao!='V');
    }

    static void adicionarFinal(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        int pos = nItens;
        if(nItens<tamMax){
                    adicionar(tamMax, titulo, tipo, ano, visto,  rating,  nItens, pos);
                    nItens++; //nItens++ não pode ser dentro do metedo porque este tem 2 propositos diferentes, um deles não adiciona itens.
                }else{
                    System.out.println("A Lista está cheia!");
                }
        menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
    }

    static void adicionarPos(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
    //Este metedo adiciona na posição pretendida.
        
            System.out.println("Introduza a posição em que pretende colocar: ");
            int pos = lerInt()-1; 
            if(pos<nItens){ 
                        movimentar(tamMax, titulo, tipo, ano, visto, rating, nItens, pos);
                        adicionar(tamMax, titulo, tipo, ano, visto, rating, nItens, pos);
                        if(nItens<tamMax){
                            nItens++;
                        }
                    }else{
                        pos=nItens;
                        adicionar(tamMax, titulo, tipo, ano, visto, rating, nItens, pos);
                        if(nItens<tamMax){
                            nItens++;
                        }
                    }
        menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
    }

    static void apagarPos(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        if(nItens!=0){
                    System.out.println("Introduza o Numero do filme que pretende Eleminar: ");
                    int pos = lerInt();
                        if(pos>nItens){
                            System.out.println("Esse numero está vazio.");
                        }else{
                            
                            apagar(tamMax, titulo, tipo, ano, visto, rating, nItens, pos);
                            nItens--;
                        }    
                }else if(nItens==0){
                    System.out.println("Tabela está vazia.");
                }
        menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
    }

    static void apagarVistos(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        int pos;
        for(int i=tamMax-1;i>=0;i--){
                    if(visto[i]==true){
                        pos=i;
                        apagar(tamMax, titulo, tipo, ano, visto, rating, nItens, pos);
                        nItens--;
                    }                    
                }
        menuEditar(tamMax, titulo, tipo, ano, visto, rating, nItens);
    }

    static void apagar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens, int pos){
    //este metedo apaga a posição pretendida, basicamente faz o inversto do movimentar.
        for(int i=pos;i<nItens-1;i++){
            titulo[i]=titulo[i+1];
            tipo[i]=tipo[i+1];
            ano[i]=ano[i+1];
            visto[i]=visto[i+1];
            rating[i]=rating[i+1];
        }
        
    }

    static void movimentar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens, int pos){
    //este metedo faz abre um espaço para colocar outro item
        for(int i=tamMax-1;i>pos;i--){
            titulo[i]=titulo[i-1];
            tipo[i]=tipo[i-1];
            ano[i]=ano[i-1];
            visto[i]=visto[i-1];
            rating[i]=rating[i-1];
        }
        
    }

    static void adicionar(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens, int pos){
        //apos abrir o espaço usa-se este metedo para adicionar o item
        System.out.println("Introduza o titulo: ");
        titulo[pos]= lerString();
        System.out.println("Introduza o tipo: ");
        tipo[pos]=tipoMaiusculo();
        System.out.println("Introduza o ano: ");
        ano[pos]=lerInt();
        System.out.println("Introduza se já viu(S/N): ");
        visto[pos]=lerBooleano();
        System.out.println("Introduza o rating: ");
        rating[pos]=lerRating();
    }

    static char tipoMaiusculo(){
        //este metedo faz com que o char introduzido no tipo de item seja S ou F maiusculos
        char c;
        do{
            c=lerChar();
            if (c == 's'){
                c='S';
                return c;
            }else if(c=='f'){
                c='F';
                return c;
            } 
            else System.out.println("Introduza S(erie) ou F(ilme)!!!!!!!");
        }while(c!='C'||c!='F');
        return c;
    }

    static boolean lerBooleano(){
        //este metedo le booleano e insere no array
        Scanner teclado = new Scanner(System.in);
        boolean b=false;
        String simNao;
        do{
        simNao = lerString();
            if(simNao.equalsIgnoreCase("S")){
                return true;
            }else if(simNao.equalsIgnoreCase("N")){
                return false;
            }else{
                System.out.println("Só pode introduzir S ou N!!!!!!");
            }
        }while(simNao.equalsIgnoreCase("S")==false || simNao.equalsIgnoreCase("N")==false);
        
        return b;
    }

    static int lerRating(){
        //este metedo chama o metedo ler int e verifica se está dentro dos parametros.
        int n;
        do{
            n=lerInt();
            if(n< 0 || n>10){
                System.out.println("O rating tem de ser entre 0 e 10!!!!!!!!!!!");
            }
        }while(n<0 || n>10);
            return n;

    }


    //=========================================================== MENU ESTATISTICA ==========================================================
    static void menuEstatisticas(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
        char opcao = 'a';
        limparTela();
        do{
            System.out.println("+==================   ESTATISTICA  =================+");
            System.out.printf("|%-50s|%n", "");
            System.out.printf("|%-50s|%n"," * (P)ercentagem de vistos");
            System.out.printf("|%-50s|%n"," * (M)édia de rating dos vistos");
            System.out.printf("|%-50s|%n"," * Distribuição por (d)écada");
            System.out.printf("|%-50s|%n"," * (V)oltar");
            System.out.printf("|%-50s|%n", "");
            System.out.println("+==================================================+");
            
            opcao = lerChar();

            switch (opcao) {

            case ('P'): //precentagem
                precentagemVistos(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;
            case ('M'): //media
                mediaRating(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;
            case ('d'): //distribuição por decada
                disDecada(tamMax, titulo, tipo, ano, visto, rating, nItens);
                break;

            case ('V'): //voltar
                limparTela();
                break;
            
        
            default:
                System.out.println("**** Opcao invalida ****\n\n");
                break;
            }
        
        }while(opcao!='v');
    }

    static void mediaRating(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
    //este metedo faz a media dos ratings    
        double nVistos=0;
         int rate=0;
        
        for(int i=0;i<nItens;i++){
            if(visto[i]==true){
                rate=rate+rating[i];
                nVistos++;
            }
        }
        System.out.printf("\nMedia de rating dos vistos: %.2f\n\n", rate/nVistos);


    }

    static void precentagemVistos(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
    //este metedo faz a precentagem dos vistos 
        double precentagem=0, nVistos=0;
        for(int i=0;i<nItens;i++){
            if(visto[i]==true){
                nVistos++;
            }
        }
        precentagem=nVistos/nItens;
        System.out.printf("\nPrecentagem de vistos: %.2f%%\n\n" , precentagem*100);

    }

    static void disDecada(int tamMax, String titulo[], char tipo[], int ano[], boolean visto[], int rating[], int nItens){
    //este metedo faz a distribuição por decada.
        int dNoventa=0, dZeros=0, dDez=0, dVintes=0;

            for(int i=0;i<nItens;i++){
                if(ano[i]>=1990 && ano[i]<2000) dNoventa++;
                else if(ano[i]>=2000 && ano[i]<2010) dZeros++;
                else if(ano[i]>=2010 && ano[i]<2020) dDez++;
                else if(ano[i]>=2020 && ano[i]<2030) dVintes++;
            }

        System.out.printf("\nDestribuição por decada: \n1990-1999: %d \n2000-2009: %d \n2010-2019: %d \n2020-2029: %d\n\n",dNoventa,dZeros,dDez,dVintes);
    }

    //===============================================     MAIN     =================================================

    public static void main(String[] args) {
   
    int tamMax = 5;
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

