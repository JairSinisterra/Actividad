import java.util.Scanner;

public class pesoSandia {
    public static void main(String[] args) {
      var console = new Scanner(System.in);
    int sandiaPeso;
    System.out.println("Ingrese el peso de la sandia: \n");
    sandiaPeso = console.nextInt();

    if(sandiaPeso % 2 == 0){
      System.out.println("La sandia se puede dividir en pares");
    }else if(sandiaPeso % 2 == 1){
      System.out.println("La sandia no se puede dividir en pares");
    }else{ 
      System.out.println("Ingrese un numero correcto por favor");
    }

    }
}
