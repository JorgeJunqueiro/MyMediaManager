package ficha21;

public class Ex9 {
    static int conversorSegundos(int valor1/*Horas*/, int valor2/*minutos*/, int valor3/*segundos*/){
        int resultado =0;
        resultado = (valor1*3600) +(valor2*60)+(valor3);
        return resultado;
    }

    public static void main(String[] args) {
        
        int convercao=0, horas=2, minutos=20, segundos=20;

        convercao=conversorSegundos(horas, minutos, segundos);

        System.out.println(horas +"H "+ minutos+"M "+ segundos+"S, em segundos é: "+ convercao);
    }
}
