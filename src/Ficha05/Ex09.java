package Ficha05;

public class Ex09 {
public static void main(String[] args) {
    double [] arr1 = new double[20];
    double [] arr2 = new double[20];
    double produto=0, soma=0;
    for(int i=0;i<arr1.length;i++){
        arr1[i]=(Math.random()*20);
        arr2[i]=(Math.random()*20);

        produto = arr1[i]*arr2[i];
        soma=soma+produto;
        
    }

    System.out.printf("Resultado: %.2f",soma);
}
}
