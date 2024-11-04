import java.util.Scanner;

public class tresNumeros {
    public static void main(String[] args) {
        System.out.println("Programa de tres numeros");
        var scanner = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El numero 1 es el Mayor");
        }else if(num2>num1 && num2>num3){
            System.out.println("El numero 2 es el mayor");
        }else{
            System.out.println("El numero 3 es el mayor");
        }
        scanner.close();
    }
}
