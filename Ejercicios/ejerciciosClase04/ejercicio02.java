import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
       
        int i,j;
       String palindromo;
       boolean  espalindromo = true;

       System.out.println("Ingresa una frase: ");
       palindromo = scanner.nextLine();
       
       palindromo = palindromo.replace(" ", "");
       palindromo = palindromo.toLowerCase();

       i=0;
       j= palindromo.length()-1;

       while((i<j) && espalindromo){
        if(palindromo.charAt(i) != palindromo.charAt(j)){
            espalindromo = false;
        }
        i++;
        j--;
       }
       if(espalindromo){
        System.out.println("Es un palindromo");
       }else{
        System.out.println("No es un palindromo");
       }
       
    }
}
