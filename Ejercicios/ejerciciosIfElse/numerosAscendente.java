import java.util.Scanner;

public class numerosAscendente {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
         int numMayor;
                System.out.println("Ingrese el primer numero: ");
                var num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                var num2 = scanner.nextInt();
                System.out.println("Ingrese el tercer numero: ");
                var num3 = scanner.nextInt();
            
                if(num1>num2 && num1>num3 && num2 > num3){ 
                    System.out.println("Los numeros ascendentes son: "+num3+num2+num1); 
                }else if(num2>num1 && num2> num3 && num3>num1){
                    System.out.println("Los numeros ascendentes son: "+num1+num3+num2);
                }else if(num3>num2 && num3>num1 && num1>num2){
                    System.out.println("Los numeros ascendentes son: "+num2+num1+num3);
                }else  if(num1<num2 && num1>num3 && num2 > num3){ 
                    System.out.println("Los numeros ascendentes son: "+num3+num1+num2); 
                }else if(num2>num1 && num2< num3 && num3>num1){
                    System.out.println("Los numeros ascendentes son: "+num1+num2+num3);
                }else if(num3>num2 && num3<num1 && num1>num2){
                    System.out.println("Los numeros ascendentes son: "+num2+num3+num1);
                }
               
                scanner.close();
        
    }
}
