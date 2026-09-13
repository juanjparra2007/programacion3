public class PuntoOcho {
    public static void main(String[] args) {

        int[] a = new int[30];

        int max = 100;
        int min = 1;

        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println("---------------------------------");

        int mayor = a[0];
        int menor = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > mayor) {
                mayor = a[i];
            }
            if(a[i] < menor) {
                menor = a[i];
            }
        }

        int cMayor  = 0;
        int cMenor = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == mayor) {
                cMayor++;
            }
            if(a[i] == menor) {
                cMenor++;
            }
        }
        System.out.println("El numero mayor es: " + mayor + " y se repite: " + cMayor + " veces");
        System.out.println("El numero menor es: " + menor + " y se repite: " + cMenor + " veces");
    }
}
