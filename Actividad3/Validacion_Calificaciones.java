import java.util.Scanner;
public class Validacion_Calificaciones {
    public static int Validacion(int c){
        boolean invalido = true;
        Scanner sc = new Scanner(System.in);
        while(invalido) {
            if (c>=0 && c<=100){
                invalido = false;
            } else{
                invalido = true;
                System.out.println("Calificacion invalida, ingresela otra vez:");
                c = sc.nextInt();
            }
        }
        return c;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificacion a validar: ");
        int cal = sc.nextInt();
        int c = Validacion(cal);
        System.out.println("La calificacion "+c+ " es valida");
    }
}
