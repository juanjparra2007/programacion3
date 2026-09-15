public class PuntoDiez {
    public static void main(String[] args) {
        int[] a = {10, 20, 3, 7, 9, 8, 2};
        int n = a.length;

        System.out.println("---Arreglo original---");
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]= " + a[i]);
        }

        int tamaB = (n +1) / 2;
        int[] b = new int[tamaB];

        for(int i = 0; i < tamaB; i++) {
            int opu = n - 1 - i;
            if(i == opu) {
                b[i] = a[i];
            } else {
                b[i] = a[i] + a[opu];
            }
        }
        System.out.println("---Arreglo resultante b---");
        for(int i = 0; i < b.length; i++){
            System.out.println("b[" + i + "]= " + b[i]);
        }

    }
}