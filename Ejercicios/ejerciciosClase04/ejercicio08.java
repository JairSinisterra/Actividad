import java.util.Scanner;

public class ejercicio08 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int opcion;
                do {
                    System.out.println("=====Calculo de areas=====");
                    System.out.println("1. Calcula el area de un circulo: ");
                    System.out.println("2. Calcula el area de un cuadrado: ");
                    System.out.println("3. Calcula el area de un triangulo: ");
                    System.out.println("4. Salir\n");
                    System.out.println("Elige una opcion: ");
                    opcion = scanner.nextInt();
                   
                 switch (opcion){  
                   
                    
                    case 1:
                        double radio;
                        System.out.println("Ingrese el valor de radio: ");
                        radio = scanner.nextDouble();
                        double resultado = Math.pow(radio, 2);
                        double areaCirculo = 3.14 * resultado;
                        System.out.println("El area del circulo es: " + areaCirculo);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Ingrese la longitud del cuadrado: ");
                        var longitud = scanner.nextInt();
                        var areaCuadrado = longitud * 2;
                        System.out.println("El area del cuadrado es: " + areaCuadrado);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Ingrese la base y la altura: ");
                        var baseTriangulo = scanner.nextInt();
                        var alturaTriangulo = scanner.nextInt();
                        double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
                        System.out.println("El area del triangulo es: " + areaTriangulo);
                        break;
                    case 4:
                        System.out.println("Gracias por ingresar!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion incorrecta, Seleccione una opcion del 1 al 4: ");
                        break;
                    }
                    System.out.println();
        
                } while(opcion != 4);
     scanner.close();
   
    }
}
