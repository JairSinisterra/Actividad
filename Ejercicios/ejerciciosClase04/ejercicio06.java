import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
     var scanner = new Scanner(System.in);
     System.out.println("Ingresa la distancia en metros: ");
     double metros = scanner.nextDouble();

     // llama al metoto para convertir metros a kilometros

     double kilometros = convertirMetrosAKilometros(metros);
    System.out.println(metros+ " Metros son "+ kilometros + " kilometros. \n");
    
    System.out.println("Ingresa la distancia en kilometros: ");
    kilometros = scanner.nextDouble();
    // llamar metodo para convertir kilometros a metros
    metros = convertirKilometrosAMetros(kilometros);
    System.out.println(kilometros+" kilometros son "+metros+" metros. \n");

    System.out.println("Ingresa la cantidad en gramos: ");
    double gramos = scanner.nextDouble();
    // llamo el el metodo de convertir gramos a kilogramos
    double kilogramos = convertirGramosAKilogramos(gramos);
    System.out.println(gramos+" gramos son "+kilogramos+ " kilogramos \n");

    System.out.println("Ingresa la cantidad en kilogramos: ");
    kilogramos = scanner.nextDouble();
    // llamo el metodo de kilogramos a gramos
    gramos = convertirKilogramosAGramos(kilogramos);
    System.out.println(kilogramos+ " kilogramos son igual a "+gramos+ " gramos");

    //
    
    }
    public static double convertirKilometrosAMetros(double kilometros) {
        final double FACTOR_CONVERSION = 1000; // Factor de conversión de kilómetros a metros
        return kilometros * FACTOR_CONVERSION;
    }
    public static double convertirMetrosAKilometros(double metros){
        final double FACTOR_CONVERSION = 1000;
        return metros / FACTOR_CONVERSION;
    }
    public static double convertirKilogramosAGramos(double kilogramos) {
        final double FACTOR_CONVERSION = 1000; // Factor de conversión de kilómetros a metros
        return kilogramos * FACTOR_CONVERSION;
    }
    public static double convertirGramosAKilogramos(double gramos){
        final double FACTOR_CONVERSION = 1000;
        return gramos / FACTOR_CONVERSION;
    }
}
