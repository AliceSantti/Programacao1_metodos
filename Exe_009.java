package metodos;

import java.util.Scanner;

public class Exe_009 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = tec.nextInt();

        resultado(n);
        tec.close();

    }
// quando n retorna valor é void e não int 
    public static void resultado(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }

    }
}
