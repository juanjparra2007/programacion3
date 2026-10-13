import java.util.Queue;
import java.util.LinkedList;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<String> estudiantes = new LinkedList<>();

        estudiantes.offer("Boston");
        estudiantes.offer("Castro");
        estudiantes.offer("Heynny");
        estudiantes.offer("Jordy");
        estudiantes.offer("Parra");

        System.out.println("Estudiantes: " + estudiantes);

        System.out.println("Primer estudiante: " + estudiantes.peek());

        System.out.println("Atender al estudiante: " + estudiantes.poll());

        System.out.println("Estudiantes que faltan por su nota: " + estudiantes.size());

        System.out.println("¿Está vacía?: " + estudiantes.isEmpty());

        System.out.println("¿Está Boston?: " + estudiantes.contains("Boston"));

        while(!estudiantes.isEmpty()) {
            System.out.println("Atendiendo a: " + estudiantes.poll());
        }

        System.out.println("Cola final de los estudiantes: " + estudiantes);

        /*
        Se hizo un ejemplo de una cola de estudiantes, donde se van atendiendo a los estudiantes en el orden en que llegaron para calificarles:
        offer() - para meter al estudiante a la cola
        poll() - para atender al estudiante de la cola
        size() - para saber cuantos estudiantes faltan por su nota
        isEmpty() - para saber si la cola está vacía
        contains() - para saber si existe el estudiante en la cola
        peek() - para ver el estudiante que está en la parte superior de la cola
        */
    }
}
