import java.util.Scanner;

public class diasMes {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del mes: ");
        var mes = scanner.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("El mes tiene 30 dias");
                break;
            default:
                System.out.println("Mes incorrecto");
                break;
        }
        scanner.close();
    }
}
