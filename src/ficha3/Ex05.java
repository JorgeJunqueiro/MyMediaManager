package ficha3;

public class Ex05 {
    static String caraCroa(){
        String resultado = String.format("Croa.");
         double moeda = (Math.random())*100; 

         if(moeda>50){
            resultado = String.format("Cara.");
         }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(caraCroa());
    }
}
