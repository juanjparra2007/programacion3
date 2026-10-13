import java.util.Stack;

public class EjercicioNueveDos {
    public static boolean esInversa(String entrada) {
        if(entrada == null) {
            return false;
        }

        int sep = entrada.indexOf('&');

        if (sep == -1 || sep != entrada.lastIndexOf('&')) {
            return false;
        }

        Stack<Character> miPila = new Stack<>();

        for(int i = 0; i < sep; i++) {
            miPila.push(entrada.charAt(i));
        }

        for (int i = sep + 1; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if(miPila.isEmpty() || miPila.pop() != c) {
                return false;
            }
        }
        
        return miPila.isEmpty();
    }

    public static void main(String[] args) {
        String entrada1 = "abc&cba";
        String entrada2 = "abc&abc";
        String entrada3 = "a&b";
        String entrada4 = "ab&ba";
        String entrada5 = "abc&cba&";

        System.out.println(entrada1 + " es inversa: " + esInversa(entrada1));
        System.out.println(entrada2 + " es inversa: " + esInversa(entrada2));
        System.out.println(entrada3 + " es inversa: " + esInversa(entrada3));
        System.out.println(entrada4 + " es inversa: " + esInversa(entrada4));
        System.out.println(entrada5 + " es inversa: " + esInversa(entrada5));
    }
}
