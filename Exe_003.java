package metodos;
import java.util.Scanner;

public class Exe_003 {
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("\nInforme o primeiro numero: ");
    int a = tec.nextInt();

    System.out.println("\nInforme o segundo numero: ");
    int b = tec.nextInt();  

    System.out.println("\nInforme o terceiro numero: ");
    int c = tec.nextInt();

    System.out.println("\nO maior numero é: " + maior(a,b,c));
}
static int maior (int a, int b, int c){

    if ( a>b && a>c){
       return a; 
    }
    else if (b>a && b>c){
        return b;

    }else{
        return c;
    
    }
     
        
    




   
}


}
