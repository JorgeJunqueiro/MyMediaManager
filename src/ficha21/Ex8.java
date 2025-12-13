package ficha21;
    
public class Ex8 {
    static double notaFinalFuncao(double valor1,double valor2, double valor3){
        double media =0;
            media=(valor1+valor2+valor3)/3;
        return media;

    }

    public static void main(String[] args) {
        double nota1=10, nota2=15, nota3=13, notaFinal=0;

        notaFinal=notaFinalFuncao(nota1, nota2, nota3);
        System.out.println("A nota final é: "+notaFinal);

    }

}
