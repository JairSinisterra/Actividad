limport java.util.Scanner;

public class vocalConsonante {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escriba una letra: ");
        char letra = scanner.next().charAt(0);
        if(letra =='a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra =='A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println("Ingresaste una vocal");
        }else if(letra >='a' && letra <= 'z'){
            System.out.println("Ingresaste una consonante");
        }else{
            System.out.println("Ingresa una letra valida");
        }
    scanner.close();
    }
}
