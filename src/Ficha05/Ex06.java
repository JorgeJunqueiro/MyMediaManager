package Ficha05;

public class Ex06 {
public static void main(String[] args) {
    
    double [] numInt = new double[20];
    double maior=0, pior=20, aprovados=0,reprovados=0;
    for(int i=0;i<numInt.length;i++){
        numInt[i]=(Math.random()*20);
        System.out.printf("Aluno %d nota: %.2f\n",i+1,numInt[i]);
    }

    for(int j=0;j<numInt.length;j++){
        if(numInt[j]>maior){
            maior=numInt[j];
        }
        if(numInt[j]<pior){
            pior=numInt[j];
        }
        if(numInt[j]>=9.5){
            aprovados=aprovados+1;
        }else{
            reprovados=reprovados+1;
        }
    }
    System.out.printf("\nMelhor nota %.2f\nPior nota: %.2f\nAprovado: %.0f \nReprovados: %.0f",maior,pior,aprovados,reprovados);

}
}
