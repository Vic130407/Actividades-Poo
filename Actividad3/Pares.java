import java.util.Scanner;
public class Pares {
            public static boolean esPar(int num){
            boolean p;
                if (num%2 == 0 ){
                    p = true;
                } else {
                    p = false;
                }
                return p;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int num = sc.nextInt();
        Boolean par = esPar(num);
        if (par){
            System.out.print(num+ " es un numero par");
        } else{
            System.out.print(num+ " no es un numero par");
        }
        
    }
}

