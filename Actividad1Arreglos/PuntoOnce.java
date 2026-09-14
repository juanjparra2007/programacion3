import java.util.Scanner;

public class PuntoOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        //Rango para los números aleatorios
        int max = 50;
        int min = -50;

        int contPos = 0;
        int contNeg = 0;
        int contCeros = 0;

        for(int i = 0; i< a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);

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

        for(int i = 0; i < a.length; i++) {
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
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println("\n---Arreglo Positivos---");
        if(b.length == 0) {
            System.out.println("No hay números positivos en el arreglo.");
        } else {
            for (int i = 0; i < b.length; i++) {
                System.out.println("b[" + i + "] = " + b[i]);
            }
        }

        System.out.println("\n---Arreglo Negativos---");
        if(c.length == 0) {
            System.out.println("No hay números negativos en el arreglo.");
        } else {
            for (int i = 0; i < c.length; i++) {
                System.out.println("c[" + i + "] = " + c[i]);
            }
        }

        System.out.println("\n---Arreglo Ceros---");
        if(d.length == 0) {
            System.out.println("No hay números ceros en el arreglo.");
        } else {
            for (int i = 0; i < d.length; i++) {
                System.out.println("d[" + i + "] = " + d[i]);
            }
        }
        
        sc.close();
    }
}