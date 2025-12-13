package ficha21;

public class Ex2 {

    static int somarTresNumeros(int num1, int num2, int num3){
        int soma=0;
        soma=num1+num2+num3;
        return soma;
    }
    public static void main(String[] args) {
        
        int var1=1, var2=2, var3=3, resultado=0; // declaração de variaveis
        resultado = somarTresNumeros(var1, var2, var3);
        System.err.println("Com o retorno apanhado numa variavel: "+resultado);
        System.out.println("Calculo direto: "+somarTresNumeros(var1, var2, var3));

    }
}
