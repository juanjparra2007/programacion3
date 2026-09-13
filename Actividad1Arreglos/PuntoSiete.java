public class PuntoSiete {
    public static void main(String[] args) {

        int[] a = {122, 45, 8, 88, 10, 32, 38, 1, 55, 99};

        for(int i = 0; i < a.length; i++) {
            System.out.println("a["+ i + "] = " + a[i]);
        }

        System.out.println("---------------------------------");

        int[] pa = new int[10];
        int[] imp = new int[10];

        int p = 0;
        int im = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                pa[p] = a[i];
                p++;
            } else {
                imp[im] = a[i];
                im++;
            }
        }

        System.out.println("Pares: ");
        for(int i = 0; i < p; i++){
            System.out.println(pa[i]);
        }

        System.out.println("---------------------------------");

        System.out.println("Impares: ");
        for(int i = 0; i < im; i++){
            System.out.println(imp[i]);
        }
    }
}
