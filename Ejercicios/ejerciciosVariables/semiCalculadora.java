import java.util.Scanner;

public class semiCalculadora {
    public static void main(String[] args) {

      
        
        var scanner = new Scanner(System.in);

        int num1;
        int num2;
        int suma;
        int resta;
        double multiplicacion;
        double division;
        // operacion
        

        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = scanner.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        System.out.println("");
        System.out.println("Los resultados son: " );
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        scanner.nextLine();
    }
}
