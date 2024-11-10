import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: \n");
        int number;
        number = scanner.nextInt();
        while (number != 0) {
            System.out.println(number);
            number++;
        }
        System.out.println("Termino");
    }
}
