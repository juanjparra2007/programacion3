import java.util.Stack;

public class EjercicioNueveTres {
    public static boolean estaBalanceada(String expresion) {
        if (expresion == null) {
            return false;
        } 

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if (c == ')' && tope != '(') {
                    return false;
                }

                if (c == ']' && tope != '[') { 
                    return false;
                }

                if (c == '}' && tope != '{') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "((a+b)*5) - 7";
        System.out.println(exp1 + " -> " + estaBalanceada(exp1));

        String exp2 = "2*[(a+b)/2.5 + x - 7*y";
        System.out.println(exp2 + " -> " + estaBalanceada(exp2));

        System.out.println("{[()]} -> " + estaBalanceada("{[()]}"));
        System.out.println("([)]   -> " + estaBalanceada("([)]"));
        System.out.println(")a+b(  -> " + estaBalanceada(")a+b("));
    }
}
