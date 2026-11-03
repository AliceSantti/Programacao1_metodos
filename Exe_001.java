package metodos;

import java.util.Scanner;

public class Exe_001 {
    public static void main(String[] args) {
        // metodo principal
       Scanner tec = new Scanner(System.in);
       System.out.println("\nInforme o primeiro numero: ");
       int a = tec.nextInt();
       System.out.println("\nInforme o segundo numero: ");
       int b = tec.nextInt();

       System.out.println("\nO maior numero é: " + maior(a,b));
        }
        
    static int maior (int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    
    }

}
