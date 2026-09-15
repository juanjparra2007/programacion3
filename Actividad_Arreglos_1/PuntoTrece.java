import java.util.Scanner;

public class PuntoTrece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el rtamño del arreglo; ");
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

        System.out.println("");










    }
}
