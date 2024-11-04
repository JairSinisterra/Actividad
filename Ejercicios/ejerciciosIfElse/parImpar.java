import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        
        if(num % 2 != 1){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

        scanner.close();
       
    }
}
