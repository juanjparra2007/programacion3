import java.util.Scanner;

public class PuntoDoce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] a = new int[n];


        System.out.println("Ingrese los "+ n + " elementos del arreglo:");
        for(int i = 0; i < n; i++) {
            System.out.print("a[" + i +"]= " );
            a[i] = sc.nextInt();
        }

        System.out.print("Ingrese el valor de X a buscar: ");
        int x = sc.nextInt();

        int tamaB = 0;
        for(int i = 0; i < n; i++) {
            if (a[i] == x) {
                tamaB++;
            }
        }

        if(tamaB == 0) {
            System.out.println("El número" + x + "no se encuentra en el arreglo");
        } else {
            
            int[] b = new int[tamaB];
            int posB = 0;

            for(int i = 0; i < n; i++) {
                if(a[i] == x) {
                    b[posB] = i + 1;
                    posB++;
                }
            }

            System.out.println("\n--- Arreglo b (Posiciones de " + x + ") ---");
            for(int i = 0; i < b.length; i++) {
                System.out.println("b[" + i + "]= " + b[i]);
            }
        }
        sc.close();
    }
}
