import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        var numeroEntero = scanner.nextInt();
        var contador =1;
        var divisores = 0;
        

        while(contador <= numeroEntero){
            if(numeroEntero % contador == 0){
                divisores++;
            }
            contador++;
        }
        if(divisores==2){   //Si divisores es igual a 2, significa que numeroEntero solo 
                         // tiene dos divisores (1 y él mismo), por lo que es primo
            System.out.println("El numero "+numeroEntero+" es primo");
        }else{
            System.out.println("El numero "+numeroEntero+" no es primo");
        }
       scanner.close();
      



    }
}
