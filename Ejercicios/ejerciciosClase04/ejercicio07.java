import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese la base y el exponente de la operacion: ");
        var base = scanner.nextInt();
        var exponente = scanner.nextInt();

        double resultado = Math.pow(base, exponente);
        System.out.println(base+" elevado a "+exponente+" es igual a: "+resultado);
    }
}
