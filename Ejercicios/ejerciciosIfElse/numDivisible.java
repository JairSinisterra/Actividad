import java.util.Scanner;

public class numDivisible {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        var num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("El numero es divisible de 2");
        }else if(num% 7 ==0){
            System.out.println("El numero es divisible de 7");
        }else {
            System.out.println("No es un numero divisible de 2 ni de 7");
        }
        scanner.close();
    }
}
