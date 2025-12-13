package Treinos;

import java.util.Scanner;

public class Ex01 {

public static String parImpar(double val1){
    String resultado="", parImpar="";
    if(val1%2==0){parImpar="Par"; }else{parImpar="Impar";}

    resultado=String.format("\nO Numero %3.2f é %s", val1,parImpar);

    return resultado;

}

public static String maiorMenor(double kelvin, double reamur, double rankine, double fahrenheit){
    String resultado="";

    double num1=kelvin, num2=reamur, num3=rankine, num4=fahrenheit;
    double maior=num1>num2 ? num1 : num2;
            maior=num2>num3 ? num2 : num3;
            maior=num3>num4 ? num3 : num4;
            
    resultado=String.format("Num maior: %3.2f "+ parImpar(maior),maior);
    return resultado;

}

static void tabudaFehrenheit(double val1){

    for(int i=1;i<=10;i++){
        System.out.printf("%d x %3.2f = %3.2f\n",i,val1,val1*i);

    }

}

public static String converterTemp(double valCelcios){
    String resultados= " ";
        double kelvin=0f, reaumur=0f, rankine=0f , fahrenheit=0f;

        kelvin=valCelcios+273;

        reaumur=(valCelcios*4)/5;

        rankine=(valCelcios*1.8)+491.67;

        fahrenheit=valCelcios*1.8+32;
        
        resultados= String.format("\nKelvin: %3.2f \tReaumur: %3.2f \tRankine: %3.2f\t fahrenheit: %3.2f\n"+maiorMenor(kelvin, reaumur, rankine, fahrenheit) ,kelvin,reaumur,rankine,fahrenheit);
        tabudaFehrenheit(fahrenheit);
        quadradoTrinaguloReaumur(reaumur);
    return resultados;
        
}
static void quadradoTrinaguloReaumur(double val1){
    System.out.println("Trinagulo");
    for(int i=1;i<=val1;i++){
        System.out.println();

        for(int k=(int)val1;k>=i-val1;k--){
            System.out.print(" ");
        }
        for(int j=(int)val1;j>=i;j--){
            System.out.print(" * ");
        }
        
    }

    System.out.printf("\nQuadrado");
    for(int i=1;i<=val1;i++){
        System.out.println();
        for(int j=1;j<=val1;j++){
            System.out.print(" * ");
        }
    }

}

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduza uma temperatura em Celcius: ");
    double tempCelcius= teclado.nextDouble();

    System.out.println(converterTemp(tempCelcius));
    
    teclado.close();
}

}
