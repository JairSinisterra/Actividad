import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("==Menu de calculo de intereses==");
            System.out.println("1. Interes Simple: ");
            System.out.println("2. Interes Compuesto: ");
            System.out.println("3. Salir\n");
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto de capital: ");
                    double capital = scanner.nextDouble();
                    System.out.println("Ingrese la tasa de interes anual en porcentaje: ");
                    double interesAnual = scanner.nextDouble();
                    System.out.println("Ingresa el tiempo en años: ");
                    int tiempo = scanner.nextInt();
                    double interesSimple = capital * interesAnual * tiempo;
                    System.out.println();
                    System.out.println("El interes simple es: " + interesSimple);
                    break;
                case 2:
                    System.out.println("Ingrese el monto de capital: ");
                    double capitalCompuesto = scanner.nextDouble();
                    System.out.println("Ingrese la tasa de interes anual en porcentaje: ");
                    double interesAnualCompuesto = scanner.nextDouble();
                    System.out.println("Ingresa el tiempo en años: ");
                    int tiempoCompuesto = scanner.nextInt();
                    System.out.println("Ingresa en numero de veces que se aplica el interes por año: ");
                    var numeroPorAno = scanner.nextInt();
                    double division = interesAnualCompuesto / numeroPorAno;
                    double multiplicacion = numeroPorAno * tiempoCompuesto; 
                   double total = Math.pow(division,multiplicacion);
                   double interesCompuesto = capitalCompuesto*(1+total);
                   
                    System.out.println();
                    System.out.println("El interes compuesto es: " + interesCompuesto);

                    break;
                case 3:
                    System.out.println("Gracias por ingresar!! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta...");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }
}
