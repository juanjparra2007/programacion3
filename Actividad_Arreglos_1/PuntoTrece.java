import java.util.Scanner;

public class PuntoTrece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        int[] b = new int[a.length];
        int[] c = new int[a.length];


        int suma = 0;
        int may = 0;
        int men = 0;

        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
            suma += a[i];
        }

        double media = (double) suma / a.length;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > media) {
                b[may] = a[i];
                may++;
            } else if (a[i] < media) {
                c[men] = a[i];
                men++;
            }
        }

        System.out.println("\n--- ARREGLO ORIGINAL A ---");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // Mostrar media (usando println)
        System.out.println("\nMedia del arreglo: " + media);

        // Mostrar elementos mayores
        System.out.println("\n--- Arreglo Mayores a la Media ---");
        if (may == 0) {
            System.out.println("No hay números mayores a la media.");
        } else {
            for (int i = 0; i < may; i++) {
                System.out.println("b[" + i + "] = " + b[i]);
            }
        }

        // Mostrar elementos menores
        System.out.println("\n--- Arreglo Menores a la Media ---");
        if (men == 0) {
            System.out.println("No hay números menores a la media.");
        } else {
            for (int i = 0; i < men; i++) {
                System.out.println("c[" + i + "] = " + c[i]);
            }
        }
        sc.close();
    }
}
