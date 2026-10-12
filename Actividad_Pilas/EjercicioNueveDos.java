import java.util.Stack;

public class EjercicioNueveDos {
    public static void main(String[] args) {
        Stack<String> miPila = new Stack<>();

        miPila.push("Primer Elemento");
        miPila.push("Segundo Elemento");  
        miPila.push("Tercer Elemento");
        miPila.push("Cuarto Elemento");

        mostrarPila(miPila);

        System.out.println("Pila Original: " + miPila);
    }

    public static void mostrarPila(Stack<String> pilaOriginal) {
        Stack<String> pilaAuxiliar = new Stack<>();

        System.out.println("Elementos de la pila: ");

        while(!pilaOriginal.isEmpty()) {
            String Elemento = pilaOriginal.pop();
            System.out.println(Elemento);
            pilaAuxiliar.push(Elemento);
        }

        while(!pilaAuxiliar.isEmpty()) {
            pilaOriginal.push(pilaAuxiliar.pop());
        }
    }

}