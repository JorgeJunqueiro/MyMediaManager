package ficha21;
public class Ex4 {


    static float IMC(float var1, float var2){
             float imc=0f;

            imc=var1/(var2*var2);

            return imc;
    }

    public static void main(String[] args) {
        float peso =20f, altura=1.70f, resultado=0f;
        resultado=IMC(peso,altura);
        System.out.println("O IMC é: "+resultado);

    }
}
