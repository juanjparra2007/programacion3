import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> papas = new Stack<>();

        papas.push("Papa 1");
        papas.push("Papa 2");
        papas.push("Papa 3");
        papas.push("Papa 4");
        papas.push("Papa 5");

        System.out.println("Pringles: " + papas);

        System.out.println("Última papa: " + papas.peek());

        System.out.println("Sacar papa: " + papas.pop());

        System.out.println("Tamaño del tubo de papas: " + papas.size());

        System.out.println("¿Está vacía?: " + papas.isEmpty());

        System.out.println("Posición de la papa: " + papas.search("Papa 3"));

        System.out.println("¿Existe esa papa?: " + papas.contains("Papa 5"));

        papas.clear();

        System.out.println("¿Está vacía?: " + papas.isEmpty());

        /*
        Tome de ejemplo a las papas Pringles, y pues relaice el ejemplo en base a que como van en un tubo, se van sacando de arriba hacia abajo:
        push() - para meter la papa al tubo
        pop() - para sacar la papa del tubo
        size() - para saber cuantas papas hay en el tubo
        isEmpty() - para saber si el tubo está vacío
        search() - para saber la posición de la papa en el tubo
        contains() - para saber si existe la papa en el tubo
        clear() - para vaciar el tubo de papas
        peek() - para ver la papa que está en la parte superior del tubo
        */

    }
}