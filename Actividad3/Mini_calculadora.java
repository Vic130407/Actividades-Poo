import java.util.Scanner;
public class Mini_calculadora {
    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    public static int restar(int n1, int n2){
        int resta= n1 - n2;
        return resta;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("--------MENU------- \n 1.-Sumar \n 2.-Restar");
        int opcion = sc.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        switch (opcion){
            case 1 -> System.out.println("El resultado es: "+sumar(num1, num2));
            case 2 -> System.out.println("El resultado es: "+restar(num1, num2));
        }
    }
}
