import java.util.Scanner;

public class cantidadAnos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad en numeros: ");
        var edad = scanner.nextInt();

        if(edad>0 && edad <5){
            System.out.println("Esta en primera infancia");
        }else if( edad > 6  && edad < 11) {
            System.out.println("Esta en la infancia");
        }else if( edad >12 && edad <18){
            System.out.println("Esta en la adolescencia");
        }else if(edad >19 && edad<26){
            System.out.println("Esta en la juventud");
        }else if(edad >27 && edad <59){
            System.out.println("Esta en la adultez");
        }else{
           System.out.println("es una persona mayor");
        }
        scanner.close();
    }
}
