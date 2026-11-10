package metodos;

import java.util.Scanner;

public class Exe_005 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("\n Informe a temperatura");
        double temp = tec.nextDouble();

        System.out.println("\nConverter para Celsius ou Fanrenheit? (C/F)");
        String op = tec.next();

        switch (op){
            case "c":
                temp = convCelsius(temp);
                System.out.println (temp + "graus Celsius");
                break;

                case "f":
                    temp = convFahrenheit(temp);
                    System.out.println (temp + " graus Fahrenheit");
                    break;
        }

           
    }

    public static double convCelsius(double t){
        return 5* (t-32)/9;

    }

    public static double convFahrenheit(double t){
        return (9*t/5) + 32;

    }







}
