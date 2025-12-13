package ficha4;

public class Ex16 {
    static void maximo(){
        int maior=0, numAleatorio=0;
        for(int i=0;i<10;i++){

                numAleatorio = (int) (100*Math.random());

                System.out.println(numAleatorio);

                if(numAleatorio>maior){
                    maior=numAleatorio;
                }

        }

        System.out.println("O numero maximo é: "+maior);

    }

    public static void main(String[] args) {
        maximo();
    }
}
