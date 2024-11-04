import java.util.Scanner;

public class camisasVendedor{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int camisaUnidad;

        System.out.println("Ingrese el numero de camisas que quiere comprar: ");
        camisaUnidad = scanner.nextInt();

        if(camisaUnidad >1 && camisaUnidad<50){
            System.out.println("El valor de la camisa por unidad es de $50.000");
        }else if (camisaUnidad>50 && camisaUnidad<100){
            System.out.println("El valor de la camisa por unidad es de $45.000");
        }else if(camisaUnidad>100 && camisaUnidad<150){
            System.out.println("El valor de la camisa por unidad es de $40.000");
        }else if(camisaUnidad>150 && camisaUnidad<200){
            System.out.println("El valor de la camisa por unidad es de $35.000");
        }else if(camisaUnidad>200){
            System.out.println("El valor de la camisa por unidad es de $30.000");
        }else{
            System.out.println("Ingrese una cantidad de camisas correcta por favor. ");
        }
        scanner.close();
    }
}
