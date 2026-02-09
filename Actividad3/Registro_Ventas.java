import java.util.Scanner;
public class Registro_Ventas {
    public static Double total(double t, double v){
        t+=v;
        return t;
            }
    public static double promedio(double t, int n){
        double prom = t/n;
        return prom;
    }
    public static boolean comprobacion(double v){
        if (v!=-1){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double t = 0;
        int n = 0;
        boolean c = true;
        while (c){
            System.out.println("Ingrese la cantidad de la venta (ingrese -1 para concluir el registro)");
            double v = sc.nextDouble();
            c = comprobacion(v);
            if  (comprobacion(v)){
                double tot = total(t, v);
                t = tot;
                n++;
            } else{
                break;
            }
        }
        System.out.println("Total de ventas: "+ t);
        System.out.println("Promedio de ventas: "+ promedio(t, n));
        System.out.println("Numero de ventas: "+n);
    }
}
