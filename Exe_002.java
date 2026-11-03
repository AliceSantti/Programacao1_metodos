package metodos;

import java.util.Scanner;

public class Exe_002 {
    public static void main(String[] args) { 
        // metodo principal
       Scanner tec = new Scanner(System.in);
       System.out.println("\nInforme o primeiro numero: ");
       int a = tec.nextInt();
       System.out.println("\nInforme o segundo numero: ");
       int b = tec.nextInt();

       System.out.println("\nO menor numero é: " + menor(a,b));
        }
        
    static int menor (int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    

    
    }
}
