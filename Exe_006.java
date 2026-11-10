package metodos;
import java.util.Scanner;

public class Exe_006 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("\nInforme o primeiro numero : ");
        double num1 = tec.nextDouble();

        System.out.println("\nInforme o segundo numero: ");
        double num2 = tec.nextDouble();

        System.out.println("\nA soma dos dois numeros é: " + soma(num1,num2));

    }

    public static double soma (double num1, double num2){

        if(num1 >= 0 && num2 >= 0){
            return num1 + num2;

        }else
{
            return 0;
        }

        
    }



}
