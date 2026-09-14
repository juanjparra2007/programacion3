public class PuntoDiez {
    public static void main(String[] args) {
        int[] a = {10, 20, 3, 7, 9, 8, 2};
        int n = a.length;

        int tamaB = (n +1)/2;
        int[] b = new int[tamaB];

        for(i = 0; i < tamaB; i++) {
            int opu = n -1 -i;
            if(i == opu) {
                b[i] = a[1];
            } else {
                b[i] = a[i] +a[opu];
            }
        }
    }
}