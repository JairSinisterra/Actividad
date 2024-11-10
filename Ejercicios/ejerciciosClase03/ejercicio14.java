import java.util.Scanner;

public class ejercicio14 {
     public static void main(String[] args) {
        var console = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número para calcular cubo: ");
            numero = console.nextInt();

            if (numero >= 0) {
                int cubo = numero * numero * numero;
                System.out.println("El cubo de " + numero + " es: " +cubo);
            }

        } while (numero >= 0);
        System.out.println("Programa finalizado.");
        console.close();
}
}
