package ficha21;
   
    
public class Ex6 {
    static double areaCirculo(double valor1/*raio */){
            double area=0;
            area= 3.14*(valor1*valor1);
            return area;
        }
    public static void main(String[] args) {
            double raio=10, resultado=0;
            resultado= areaCirculo(raio);

            System.out.println("A area de um circulo com o raio "+ raio + " é " + resultado);
    }
    
}
