import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros por favor: ");
        var num1  = scanner.nextInt();
        var num2  = scanner.nextInt();
        var num3  = scanner.nextInt();

        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los 3 numeros es: "+promedio);
    }
}
