import java.util.Scanner;

public class PuntoOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Ingrese los "+ n+"elementos del arreglo: ");
        for(int i = 0; i< n; i++) {
            System.out.print("a[" + i+ "]=");
            a[i] = sc.nextInt();
        }













    }
}