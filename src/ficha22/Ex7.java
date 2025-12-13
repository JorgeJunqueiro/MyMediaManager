package ficha22;
public class Ex7 {
    static double calcularDesconto(double valor1/*preço original*/){
        double novoPreco = 0;
        novoPreco=valor1-(valor1*0.1);
        return novoPreco;
    }
    public static void main(String[] args) {
        double precoOriginal=40, precoDescontado =0;
        precoDescontado= calcularDesconto(precoOriginal);
        System.out.println("O preço com desconto é: "+ precoDescontado);
    }
}
