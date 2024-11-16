import java.util.Scanner;

public class ejercicio01 {
  public static void main(String[] args) {
    
    var console = new Scanner(System.in);
    double fahrenheit;
    double celsius;
   double celsiusConvercion;
   double fahrenheitConvercion;
    int opcion;
 
    System.out.println("Valor de la Celsius: ");
    celsius = console.nextDouble();
    System.out.println("Valor de Fahrenheit: ");
    fahrenheit = console.nextDouble();

    System.out.println("Seleccione la  conversion que quiere realizar: ");
    System.out.println("1. Fahrenheit");
    System.out.println("2. Celsius");
    opcion = console.nextInt();
   
    celsiusConvercion=(fahrenheit-32)/(9/5);
    fahrenheitConvercion=(celsius*(9/5))+ 32;

    if(opcion == 1){
     System.out.println(" la conversion a Celsius es: "+celsiusConvercion);
    }else if(opcion ==2){
        System.out.println(" la conversion a Fahrenheit es: "+fahrenheitConvercion);
    }else{
        System.out.println("Salir");
    }

    
    console.close();

  
  }  
}
