import java.util.Scanner;
import java.util.Stack;

public class EjercicioNueveCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Stack<Integer>[] pilas = new Stack[5];

        for (int i = 0; i < pilas.length; i++) {
            pilas[i] = new Stack<>();
        }

        int i, j, k;

        do {
            System.out.print("Ingrese i: ");
            i = entrada.nextInt();

            if (i != 0) {
                System.out.print("Ingrese j: ");
                j = entrada.nextInt();

                System.out.print("Ingrese k: ");
                k = entrada.nextInt();

                int pos = Math.abs(i) - 1;

                if (pos < 0 || pos >= 5) {
                    System.out.println("Pila no válida");
                } 
                else if (k == -1) {
                    while (!pilas[pos].isEmpty()) {
                        pilas[pos].pop();
                    }
                    System.out.println("Se vació por completo la P" + (pos + 1));
                } 
                else if (k == 0) {
                    if (i > 0) {
                        pilas[pos].push(j);
                    } else {
                        Stack<Integer> aux = new Stack<>();
                        boolean encontrado = false;

                        while (!pilas[pos].isEmpty()) {
                            int elemento = pilas[pos].pop();
                            if (elemento == j && !encontrado) {
                                encontrado = true;
                                break;
                            }
                            aux.push(elemento);
                        }

                        while (!aux.isEmpty()) {
                            pilas[pos].push(aux.pop());
                        }

                        if (!encontrado) {
                            System.out.println("El elemento " + j + " no se encontró en la P" + (pos + 1));
                        }
                    }
                } else {
                    System.out.println("Valor de k no válido (solo se permite -1 o 0)");
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
