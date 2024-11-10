import java.util.Scanner;

public class negativoPositivo{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numero;
        

        System.out.println("Numero negativo y positivo");

        
        System.out.println("");
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();
        if(numero<0){
            System.out.println("El numero es negativo");
        }else if(numero == 0){
            System.out.println("El numero es 0");
        }else{
            System.out.println("El numero es positivo");
        }
        scanner.close();
    }
}