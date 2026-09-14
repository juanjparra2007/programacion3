import java.util.Scanner;

public class PuntoDoce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrse el tamño del arreglo: ");
        int n = sc.nextInt();

        int[] a = new int[n];


        System.out.println("Ingrse los "+ n + " elmentos del arrglo:");
        for(int i = 0; i < n; i++) {
            System.out.print("a[" +i+"]= " );
            a[i] = sc.nextInt();
        }

        System.out.print("Ingrse el valor de X a buscar; ");
        int x = sc.nextInt();

        int tamaB = 0;
        for(int i = 0; i < n; i++) {
            if (a[i] == x) {
                tamaB++;
            }
        }








    }
}
