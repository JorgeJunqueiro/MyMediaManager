package Ficha05;

public class Ex17 {
    public static void main(String[] args) {
        int iAlunos[] = new int[30];
        String menu[] = {"<=17 Anos: ","18 Anos: ","19 Anos: ","20 Anos: ",">=21 Anos: "};
        int idades[] = new int[5];
        for(int i=0;i<iAlunos.length;i++){
            iAlunos[i]= (int) (17+(5*Math.random()));

        }
        for(int i=0;i<iAlunos.length;i++){
            if(iAlunos[i]<=17) idades[0]=idades[0]+1;
            else if(iAlunos[i]==18)idades[1]=idades[1]+1;
            else if(iAlunos[i]==19)idades[2]=idades[2]+1;
            else if(iAlunos[i]==20)idades[3]=idades[3]+1;
            else if(iAlunos[i]>=21)idades[4]=idades[4]+1;
        }
    
        for(int i=0;i<menu.length;i++){

            System.out.printf("%s\t %d\n", menu[i],idades[i]);
        }
        System.out.println();
        for(int i=0;i<menu.length;i++){

            System.out.printf("%s\t", menu[i]);
            for(int j=0;j<=idades[i];j++){System.out.print("*");}
            System.out.println();
        }
    
    
    
    }
}
