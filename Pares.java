public class Pares {
    public static void main(String[]args){
        int par = 2;
        int [] pares = new int [50];
        for (int i = 0; i < pares.length ; i++){
            pares[i] = par;
            par += 2;
        }
        System.out.println("Pares del 2 al 100: ");
        for (int i = 0; i < pares.length ; i++){
            System.out.print(pares[i]+", ");
        }
    }
}
