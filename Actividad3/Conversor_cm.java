import java.util.Scanner;
public class Conversor_cm {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca la medida en centimetros");
        double num = sc.nextDouble();
        double m = num/100;
        System.out.print("La conversion de "+num+"cm a metros es de: "+m+"m");
    }
}
