package ficha21;

public class Ex3 {
    static int produto(int num1, int num2){
        int produto=0;
        produto= num1*num2;
        return produto;
    
    }
    static int divisaoInteira(int num1, int num2){
        int divInteira=0;
        divInteira= num1/num2;
        return divInteira;
    }

    static int resto(int num1, int num2){
        int res=0;
        res=num1%num2;
        return res;
    }

    static int quadrado(int num1){
        int quadrado1=0;

        quadrado1=num1*num1;

        return quadrado1;

    }
    public static void main(String[] args) {
        int valor1=5, valor2=2;

            
            System.out.println("O Protuto de "+valor1+"*"+valor2+"="+ produto(valor1, valor2));
            System.out.println("Divisão inteira:"+ divisaoInteira(valor1, valor2)+ " Resto divisão:"+ resto(valor1, valor2));
            System.out.println("Quadrado 1º numero: "+ quadrado(valor1)+"\nQuadrado 2º numero 2: "+ quadrado(valor2));
    }
}
