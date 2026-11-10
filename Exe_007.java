package metodos;
import java.util.Scanner;
public class Exe_007 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        

        System.out.print("\nInforme o primeiro numero:");
        int a = tec.nextInt();

        System.out.print("\nInforme o segundo numero:");
        int b = tec.nextInt();

        System.out.print("\nInforme o terceiro numero:");
        int c = tec.nextInt();

        System.out.println("\nO resultado é: " + result(a,b,c));



    }

    public static boolean result (int a, int b, int c){

        if (a>b && b>c){
            return true;
        }else
            return false;
            

    }

}
