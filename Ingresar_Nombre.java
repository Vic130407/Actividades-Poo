import java.util.Scanner;
public class Ingresar_Nombre {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre");
        String nombre = sc.nextLine();
        
        if (nombre.equals("Victor") || nombre.equals("victor")){
        System.out.println("Bienvenido creador " + nombre);
        } else {
            System.out.println("Usuario no identificado");
        }
    }
}
