package metodos;

import java.util.Scanner;

public class Exe_008 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("\nInforme a temperatura:");
        double temp = tec.nextDouble();

        System.out.println("\n Converter para Celsius ou Fahrenheit? (C/F)");
        String op = tec.next();

        switch (op) {
            case "C":
                temp = convCelsius(temp);
                System.out.println(temp + " graus Celsius");
                break;
            case "F":
                temp = convFahrenheit(temp);
                System.out.println(temp + " graus Fahrenheit");
                break;

        }

    }

    public static double convCelsius(double temp) {
        return 5 * (temp - 32) / 9;

    }

    public static double convFahrenheit(double temp) {
        return (9 * temp / 5) + 32;

    }

}
