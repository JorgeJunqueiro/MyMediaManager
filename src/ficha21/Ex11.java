package ficha21;

public class Ex11 {
    static double salarioTotal(double valor1, double valor2, double valor3, double valor4, double valor5 ){
        double resultado=0;

            resultado=valor1+(valor2*valor3)+(valor4*valor5);

        return resultado;

    }

    public static void main(String[] args) {
        double salarioBase=1000, bonus=50, carrosVendidosVendedor=10, carrosVendidosStand=200,  precentagem=0.1, salarioFinal=0;

        salarioFinal=salarioTotal(salarioBase, bonus, carrosVendidosVendedor, carrosVendidosStand, precentagem);

        System.out.println("Salario total: "+salarioFinal);
    }
}
