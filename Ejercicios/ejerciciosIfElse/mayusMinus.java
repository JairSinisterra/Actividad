import java.util.Scanner;

public class mayusMinus {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
       
        System.out.println("Escriba una letra: ");
        char letra = scanner.next().charAt(0);

        System.out.println("");
        if(Character.isUpperCase(letra)){
          System.out.println("La letra es mayuscula");
        }else if(Character.isLowerCase(letra)){
            System.out.println("La letra es minuscula");
        }else{
            System.out.println("Escriba por favor una letra correcta.");
        }
        scanner.close();
    }
}
