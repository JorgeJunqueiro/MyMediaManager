package ficha21;



public class Ex10 {

    static double gastoTotal(double valor1/*valor inicial*/){
        double dia1=0, dia2=0, dia3=0, dia4=0, resultado=0;
       
           /*  for(int i=0;i<4;i++){
                resultado=resultado+ valor1+(valor1*0.1);
                
            }*/

            dia1=valor1;
            dia2=dia1+(dia1*01);
            dia3=dia2+(dia2*01);
            dia4=dia3+(dia3*0.1);
            resultado=dia4;

        return resultado;
    }
    public static void main(String[] args) {
        double custoInicial = 20, resultado = 0;
        resultado=gastoTotal(custoInicial);
        System.out.println("Gasto total: "+ resultado);

    }
}
