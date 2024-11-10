import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        var num = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        var num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        var num3 = scanner.nextInt();

        if(num + num2 > num3 && num + num3 > num2 && num2 + num3 > num){
            System.out.println("Se puede formar un triangulo");
        }else{ 
            System.out.println("No se puede formar un triangulo");
        }
        scanner.close();
    }
}
