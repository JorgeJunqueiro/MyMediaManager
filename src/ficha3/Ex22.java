package ficha3;

import java.util.Scanner;
public interface Ex22 {

    static String estadoCivil(char estado){

        /*if(estado == 'c' || estado == 'C') res="Casado";
        if else(estado == 'v' || estado == 'V') res="Viuvo";
        if else(estado == 'u' || estado == 'U') res="União de Facto";
        if else(estado == 's' || estado == 'S') res="Solteiro";
        else(estado == 'd' || estado == 'D')    res="Divorciado";*/
        String resultado;
        String res="";

        switch (estado) {
            case 'c':
                res="Casado";
                break;
            case 'C':
                res="Casado";
                break;
            case 'v':
                res="Viuvo";
                break;
            case 'V':
                res="Viuvo";
                break;
            case 'u':
                res="União de Facto";
                break;
            case 'U':
                res="União de Facto";
                break;
            case 's':
                res="Solteiro";
                break;
            case 'S':
                res="Solteiro";
                break;
            case 'd':
                res="Divorciado";
                break;
            case 'D':
                res="Divorciado";
                break;
            default:
                break;
        }
        
        return resultado= String.format("Estado Civil: %s", res);
    }

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduza a inicial do estado civil: ");
        char inicial=  teclado.next().charAt(0);

        System.out.println(estadoCivil(inicial));
        teclado.close();
    }
}
