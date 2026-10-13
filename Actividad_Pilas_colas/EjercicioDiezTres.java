import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EjercicioDiezTres {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Queue<Integer> carrosLibres = new LinkedList<>();
        for (int n = 1; n <= 25; n++) {
            carrosLibres.add(n);
        }

        Queue<Integer> colaEspera = new LinkedList<>();

        Queue<String> filaCaja1 = new LinkedList<>();
        Queue<String> filaCaja2 = new LinkedList<>();
        Queue<String> filaCaja3 = new LinkedList<>();

        int menu;
        int idTurno = 1;

        do {
            System.out.println("\n--- Supermercado ---");
            System.out.println("1. Llegada de un cliente");
            System.out.println("2. Cliente termina de comprar");
            System.out.println("3. Atender pago en caja");
            System.out.println("4. Ver estado general");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            menu = lector.nextInt();

            if (menu == 1) {
                if (carrosLibres.isEmpty()) {
                    colaEspera.add(idTurno);
                    System.out.println("No hay carritos disponibles. Cliente " + idTurno + " queda en cola de espera.");
                } else {
                    int carroAsignado = carrosLibres.poll();
                    System.out.println("Cliente " + idTurno + " recibe el carrito " + carroAsignado);
                }
                idTurno++;

            } else if (menu == 2) {
                System.out.print("Numero del cliente: ");
                int numCliente = lector.nextInt();

                System.out.print("Numero del carrito: ");
                int numCarro = lector.nextInt();

                String registro = numCliente + "-" + numCarro;

                if (filaCaja1.size() <= filaCaja2.size() && filaCaja1.size() <= filaCaja3.size()) {
                    filaCaja1.add(registro);
                    System.out.println("Cliente asignado a caja 1");
                } else if (filaCaja2.size() <= filaCaja3.size()) {
                    filaCaja2.add(registro);
                    System.out.println("Cliente asignado a caja 2");
                } else {
                    filaCaja3.add(registro);
                    System.out.println("Cliente asignado a caja 3");
                }

            } else if (menu == 3) {
                System.out.print("Caja a atender (1, 2 o 3): ");
                int cajaElegida = lector.nextInt();

                String registroAtendido = null;

                if (cajaElegida == 1 && !filaCaja1.isEmpty()) {
                    registroAtendido = filaCaja1.poll();
                } else if (cajaElegida == 2 && !filaCaja2.isEmpty()) {
                    registroAtendido = filaCaja2.poll();
                } else if (cajaElegida == 3 && !filaCaja3.isEmpty()) {
                    registroAtendido = filaCaja3.poll();
                }

                if (registroAtendido != null) {
                    String[] partes = registroAtendido.split("-");
                    int carroDevuelto = Integer.parseInt(partes[1]);

                    System.out.println("Cliente " + partes[0] + " ha pagado.");

                    if (!colaEspera.isEmpty()) {
                        int clienteEsperando = colaEspera.poll();
                        System.out.println("Carrito " + carroDevuelto + " entregado al Cliente " + clienteEsperando + " que estaba en espera.");
                    } else {
                        carrosLibres.add(carroDevuelto);
                        System.out.println("Carrito " + carroDevuelto + " disponible nuevamente.");
                    }
                } else {
                    System.out.println("La caja seleccionada esta vacia.");
                }

            } else if (menu == 4) {
                System.out.println("Carritos disponibles: " + carrosLibres);
                System.out.println("Clientes en espera de carrito: " + colaEspera);
                System.out.println("Caja 1: " + filaCaja1);
                System.out.println("Caja 2: " + filaCaja2);
                System.out.println("Caja 3: " + filaCaja3);
            }

        } while (menu != 0);

        lector.close();
    }
}
