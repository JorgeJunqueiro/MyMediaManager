package ficha22;

public class Ex06 {
static int aleatorio(){
        int resultado = (int)(1 + 6* Math.random());

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Numero Aleatorio de 0 a 6: "+aleatorio());
    }
}
