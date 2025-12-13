package Ficha07;



public class Ex01 {
    static void imprimeArray(int a[], int inicio, int fim){
        if(inicio>fim){
            for(int i=inicio;i>=fim;i--)
            System.out.println(a[i]);
        }else{
            for(int i=inicio;i<=fim;i++)
            System.out.println(a[i]);
        }
}
public static void main(String[] args) {
    int a[]={1,2,3,4}, inicio=0, fim=3;
    imprimeArray(a, inicio, fim);
}
}
