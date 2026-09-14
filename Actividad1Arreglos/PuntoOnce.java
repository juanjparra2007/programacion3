import java.util.Scanner;

public class PuntoOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo:");
        int n = sc.nextInt();

        int[] a = new int[n];

        int contPos = 0;
        int contNeg = 0;
        int contCeros = 0;

        System.out.println("Ingrese los "+ n+"elementos del arreglo: ");
        for(int i = 0; i< n; i++) {
            System.out.print("a[" + i+ "]=");
            a[i] = sc.nextInt();
        }

        for(int i = 0; i <n; i++) {
            if(a[i] > 0) {
                contPos++;
            } else if(a[i] == 0) {
                contCeros++;
            } else {
                contNeg++;
            }

        }

        int[] b = new int[contPos];
        int[] c = new int[contNeg];
        int[] d = new int[contCeros];

        int posiPos = 0;
        int posiNeg = 0;
        int posiCeros = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] > 0) {
                b[posiPos] = a[i];
                posiPos++;
            } else if(a[i] < 0) {
                c[posiNeg] = a[i];
                posiNeg++;
            } else {
                d[posiCeros] = a[i];
                posiCeros++;
            }
        }

        System.out.println("\n--- ARREGLO ORIGINAL A ---");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println("\n---Arreglo Positivos---");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        System.out.println("\n---Arreglo Negativos---");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }

        System.out.println("\n---Arreglo Ceros---");
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }













    }
}