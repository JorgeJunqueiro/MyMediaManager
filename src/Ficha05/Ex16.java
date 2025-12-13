package Ficha05;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
       boolean sair=false;
       Scanner teclado = new Scanner(System.in);
       int escolhaMenu=0, quantidade=0;
       boolean plateia1[] = new boolean[200];   double pPlateia1 =50; int p1Disponiveis = 200;
       boolean plateia2[] = new boolean[100];   double pPlateia2 =40; int p2Disponiveis = 100;
       boolean balcao[] = new boolean[100];     double pBalcao =60;   int bDisponiveis = 100;
       boolean camarotes[] = new boolean[10];  double pCamarote =90; int cDisponiveis = 10;

       for(int i=0;i<plateia1.length;i++){
        plateia1[i]=false;
        if(i<100)plateia2[i]=false;
        if(i<100)balcao[i]=false;
        if(i<10)camarotes[i]=false;
       }

       
       
       
       do{
            System.out.printf("Menu Lugar Cinema\n1. 1ª Plateia\t(50€) - <%3d> Lugares disponiveis\n2. 2ª Plateia\t(50€) - <%3d> Lugares disponiveis\n3. Balcão\t(60€) - <%3d> Lugares disponiveis\n4. Camarotes\t(90€) - <%3d> Lugares disponiveis\n0. Sair\n",p1Disponiveis,p2Disponiveis,bDisponiveis,cDisponiveis);
            escolhaMenu= teclado.nextInt();
            System.out.printf("Quantos Bilhetes quer comprar?\n");
            quantidade=teclado.nextInt();
            switch (escolhaMenu){
                case 1:
                    if(p1Disponiveis-quantidade>=0){
                        for(int i=0;i<plateia1.length;i++){
                            for(int j=i;j<=i+quantidade;j++){
                                if(plateia1[j]==false){
                                    plateia1[j]=true;
                                break;
                                }
                            }
                        }
                        p1Disponiveis=p1Disponiveis-quantidade;
                        System.out.printf("Preço: %.2f\n",pPlateia1*quantidade);
                    }else{System.out.printf("Não há lugares disponiveis\n");}
                    break;
                case 2:
                    if(p2Disponiveis-quantidade>=0){
                        for(int i=0;i<plateia2.length;i++){
                            for(int j=i;j<=i+quantidade;j++){
                                if(plateia2[j]==false){
                                    plateia2[j]=true;
                                break;
                                }
                            }
                        }
                        p2Disponiveis=p2Disponiveis-quantidade;
                        System.out.printf("Preço: %.2f\n",pPlateia2*quantidade);
                    }else{System.out.printf("Não há lugares disponiveis\n");}
                    
                    break;
                case 3:
                    if(bDisponiveis-quantidade>=0){
                        for(int i=0;i<balcao.length;i++){
                            for(int j=i;j<=i+quantidade;j++){
                                if(balcao[j]==false){
                                    balcao[j]=true;
                                break;
                                }
                            }
                        }
                        bDisponiveis=bDisponiveis-quantidade;
                        System.out.printf("Preço: %.2f\n",pBalcao*quantidade);
                    }else{System.out.printf("Não há lugares disponiveis\n");}    

                    break;
                case 4:
                    if(cDisponiveis-quantidade>=0){
                        for(int i=0;i<camarotes.length;i++){
                            for(int j=i;j<=i+quantidade;j++){
                                if(camarotes[j]==false){
                                    camarotes[j]=true;
                                break;
                                }
                            }
                        }
                        cDisponiveis=cDisponiveis-quantidade;
                        System.out.printf("Preço: %.2f\n",pCamarote*quantidade);
                    }else{System.out.printf("Não há lugares disponiveis\n");}
                    break;
                case 0:
                    sair=true;
                    break;
            
                default:
                    break;
            }
            

        }while(sair!=true);
        teclado.close();
    }
}
