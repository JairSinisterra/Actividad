import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        int number; // Número para el cual queremos calcular el factorial
        System.out.println("Ingrese un numero entero positivo: ");
        number = scanner.nextInt();
        int result = 1; // Variable para almacenar el resultado

        for (int contador = 1; contador <= number; contador++) {
            result *= contador; // Multiplica result por contador en cada iteración
        }

        System.out.println("El factorial de " + number + " es " + result);

        
    }
}
