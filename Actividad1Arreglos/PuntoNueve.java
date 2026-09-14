import java.util.Scanner;

public class PuntoNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse el tamaño del arreglo: ");
        int tam = sc.nextInt();

        int[] a = new int[tam];

        System.out.println("Ingrese los "+tam+"elmentos del arreglo: ");
        for(int i = 0; i < tam; i++) {
            System.out.println("Elemento [" +i+"]:");
            a[i] = sc.nextInt();
        }

        System.out.println("Ingrse el número que se desea buscar:");
        int numB = sc.nextInt();

        int conta = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == numB) {
                conta++;
            }
        }

        System.out.println("El número " + numB + " se repite "+ conta + " vecces en el arreglo.");














    }
}
