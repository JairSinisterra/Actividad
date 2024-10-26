import java.util.Scanner;  //Importo la clase para leer pantalla.

public class PidePalabras {
    public static void main(String[] args) {
        
   
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("You're about to enter 3 words");
    System.out.println("");
    System.out.println("Please enter the 1st word: ");
    String word1 = entrada.nextLine();
    System.out.println("");
    System.out.println("Please enter the 2nd word: ");
    String word2 = entrada.nextLine();
    System.out.println("");
    System.out.println("Please enter the 3rd word: ");
    String word3 = entrada.nextLine();
    System.out.println("");
    System.out.println("These are the 3 words: "+ word1+" "+ word2+ " "+ word3 );
    }
}
