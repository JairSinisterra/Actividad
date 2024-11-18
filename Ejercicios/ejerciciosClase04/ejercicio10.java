import java.util.Scanner;

public class ejercicio10{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
    int opcion;
    int contador = 1;
    int contador2 = 2;
    int contador3 = 3;
    int contador4 = 4;
    int contador5 = 5;
    int contador6 = 6;
    int contador7 = 7;
    int contador8 = 8;
    int contador9 = 9;
    int contador10 = 10;
     do{
        System.out.println("=====Menu de tablas de multiplicar=====");
        System.out.println("1. Table de multiplicar del 1: ");
        System.out.println("1. Table de multiplicar del 2: ");
        System.out.println("1. Table de multiplicar del 3: ");
        System.out.println("1. Table de multiplicar del 4: ");
        System.out.println("1. Table de multiplicar del 5: ");
        System.out.println("1. Table de multiplicar del 6: ");
        System.out.println("1. Table de multiplicar del 7: ");
        System.out.println("1. Table de multiplicar del 8: ");
        System.out.println("1. Table de multiplicar del 9: ");
        System.out.println("1. Table de multiplicar del 10\n: ");
        System.out.println("0. Salir\n");
        System.out.print("Elija una opcion: \n");
        opcion = scanner.nextInt();
         System.out.println();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Tabla del 1");
                while(contador<=10){
                    System.out.println(contador);
                    contador++;
                }
                break;
            case 2:
            System.out.println("Tabla del 2");
            while(contador2<=20){
                System.out.println(contador2);
                contador2 +=2;
            }
                
                break;
            case 3:
            System.out.println("Tabla del 3");
            while(contador3<=30){
                System.out.println(contador3);
                contador3 +=3;
            }
                break;
            case 4:
            while(contador4<=40){
                System.out.println(contador4);
                contador4 +=4;
            }
                
                break;
            case 5:
            while(contador5<=50){
                System.out.println(contador5);
                contador5 +=5;
            }
                break;
            case 6:
            while(contador6<=60){
                System.out.println(contador6);
                contador6 +=6;
            }
                break;
            case 7:
            while(contador7<=70){
                System.out.println(contador7);
                contador7 +=7;
            }
                break;
            case 8:
            while(contador8<=80){
                System.out.println(contador8);
                contador8 +=8;
            }
                break;
            case 9:
            while(contador9<=90){
                System.out.println(contador9);
                contador9 +=9;
            }
                break;
            case 10:
            while(contador10<=100){
                System.out.println(contador10);
                contador10 +=10;
            }
                break;
            case 0:
            System.out.println("Gracias por ingresar!!");
            System.exit(0);
            break;
            default:
            System.out.println("Seleccione una opcion correcta...");
                break;
        }

     }while(opcion !=11);
     scanner.close();
    }
}