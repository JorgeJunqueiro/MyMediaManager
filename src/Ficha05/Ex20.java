package Ficha05;

public class Ex20 {
public static void main(String[] args) {
    /*
    1-Paus
    2-Espadas
    3-Ouros
    4-Copas

    1 é ás, 11 valete,12 dama,13 rei
     */
    String nipe[] = {"paus", "copas", "ouros" , "espadas"};
    int cartas[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
    


    String trunfo = nipe[(int) (4*Math.random())];
    System.out.printf("Trunfo: %s\n", trunfo);
    int numJ1=(int)(13*Math.random());
    String nipeJ1= nipe[(int)(4*Math.random())];
    int numJ2=(int)(13*Math.random());
    String nipeJ2= nipe[(int)(4*Math.random())];

    System.out.printf("Jogador 1 joga: %d de %s\n" ,numJ1 ,nipeJ1);
    System.out.printf("Jogador 2 joga: %d de %s\n" , numJ2 ,nipeJ2);


    if((nipeJ1==trunfo || numJ1>numJ2)){
        System.out.printf("Ganha o jogador 1 com %d  de %s",numJ1,nipeJ1);
    }else if(nipeJ2==trunfo || numJ2>numJ1){
        System.out.printf("Ganha o jogador 2 com %d  de %s",numJ2,nipeJ2);
    }
}
}
