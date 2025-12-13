package ficha21;

    

public class Ex5 {
    static double celciusConverterFahrenheit(double valor1){
        double resultado=0;
        resultado = 1.8*valor1+32;
        return resultado;
    }
    public static void main(String[] args) {
        double celcius=0, fahrnheit =0;
        fahrnheit = celciusConverterFahrenheit(celcius);
        System.out.println("A temperatura em:"+celcius+"\nA temperatura em fahrenheit:"+ fahrnheit);
    }
}
