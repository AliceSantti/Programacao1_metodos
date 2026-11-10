package metodos;
import java.util.Scanner;
public class Exe_004 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        System.out.println("\nInforme o primeiro numero: "); 
        int a = tec.nextInt();

        System.out.println("\n Informe o segundo numero: ");
        int b =tec.nextInt();

        System.out.println("\nInfomre o terceiro numemero: ");
        int c = tec.nextInt();

        System.out.println("\nO menor numero é: " + menor(a,b,c)); 


    }
    public static int menor (int a, int b, int c){

        if(a<b && a<c){
            return a;
        } else if (b<a & b<c){
            return b;

        }else{
            return c;
        }

    }


}