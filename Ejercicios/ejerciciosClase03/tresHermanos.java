
import java.util.Scanner;

public class tresHermanos {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("Ingrese los números de los dos hermanos que llegaron a tiempo (por ejemplo, 1 2):");

        int hermano1 = console.nextInt();
        int hermano2 = console.nextInt();

        int hermanoT = 0;

    
        if ((hermano1 == 1 && hermano2 == 2) || (hermano1 == 2 && hermano2 == 1)) {
            hermanoT = 3;
        } else if ((hermano1 == 1 && hermano2 == 3) || (hermano1 == 3 && hermano2 == 1)) {
            hermanoT = 2;
        } else if ((hermano1 == 2 && hermano2 == 3) || (hermano1 == 3 && hermano2 == 2)) {
            hermanoT = 1;
        }

        System.out.println("El hermano que llegará tarde es el número: " + hermanoT);
        console.close();
    }
}
