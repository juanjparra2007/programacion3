import java.util.Scanner;
import java.util.Stack;

public class EjercicioNueveCuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Stack<Integer>[] pilas = new Stack[5];

        for (int i = 0; i < pilas.length; i++) {
            pilas[i] = new Stack<>();
        }

        int i, j;

        do {
            System.out.print("Ingrese i: ");
            i = entrada.nextInt();

            if (i != 0) {
                System.out.print("Ingrese j: ");
                j = entrada.nextInt();

                int indice = Math.abs(i) - 1;

                if (indice < 0 || indice >= 5) {
                    System.out.println("Pila no válida");
                } else if (i > 0) {
                    pilas[indice].push(j);
                } else {
                    Stack<Integer> aux = new Stack<>();
                    boolean encontrado = false;

                    while (!pilas[indice].isEmpty()) {
                        int elemento = pilas[indice].pop();
                        if (elemento == j && !encontrado) {
                            encontrado = true;
                            break;
                        }
                        aux.push(elemento);
                    }

                    while (!aux.isEmpty()) {
                        pilas[indice].push(aux.pop());
                    }

                    if (!encontrado) {
                        System.out.println("El elemento " + j + " no se encontró en la P" + (indice + 1));
                    }
                }
            }

        } while (i != 0);

        System.out.println("\n--- Contenido final de las pilas ---");
        for (int p = 0; p < pilas.length; p++) {
            System.out.println("P" + (p + 1) + ": " + pilas[p]);
        }

        entrada.close();
    }
}
