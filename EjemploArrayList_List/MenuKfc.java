import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuKfc {
    public static void main(String[] args) {
        List<String> pedidoActual = new ArrayList<>();
        List<String> menuKFC = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        menuKFC.add("COMBO CORONEL BURGER");
        menuKFC.add("POPCORN GRANDE");
        menuKFC.add("BIG BOX ORIGINAL ALAS");
        menuKFC.add("SUNDAE AREQUIPE");
        menuKFC.add("PARTY COMPARTY BOX BURGER");
        menuKFC.add("NOCHES 12 PRESAS");

        int opcion = 0;

        do {
            System.out.println(" BIENVENIDO A KFC ");
            System.out.print(
                    "\n1. Ver menú disponible de KFC"
                    + "\n2. Agregar producto al pedido"
                    + "\n3. Agregar combo prioritario"
                    + "\n4. Ver pedido actual"
                    + "\n5. Consultar producto"
                    + "\n6. Modificar un producto del pedido"
                    + "\n7. Eliminar producto del pedido"
                    + "\n8. Buscar si un producto ya está en el pedido"
                    + "\n9. Despachar y atender pedido"
                    + "\n10. Cancelar pedido completo"
                    + "\n11. Finalizar pedido y facturar"
                    + "\n12. Salir"
                    + "\nSeleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- MENÚ DISPONIBLE EN KFC ---");
                    for (int i = 0; i < menuKFC.size(); i++) {
                        System.out.println((i + 1) + ". " + menuKFC.get(i));
                    }
                    break;

                case 2:
                    System.out.println("\n--- SELECCIONAR PRODUCTO ---");
                    for (int i = 0; i < menuKFC.size(); i++) {
                        System.out.println((i + 1) + ". " + menuKFC.get(i));
                    }
                    System.out.print("Ingrese el número del producto a añadir: ");
                    int numProd = sc.nextInt();
                    sc.nextLine();

                    if (numProd >= 1 && numProd <= menuKFC.size()) {
                        String productoElegido = menuKFC.get(numProd - 1);
                        pedidoActual.add(productoElegido);
                        System.out.println("-> '" + productoElegido + "' agregado a su orden.");
                    } else {
                        System.out.println("-> Opción de producto no válida.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del combo especial: ");
                    String comboVip = sc.nextLine();

                    pedidoActual.add(0, comboVip + " [PRIORITARIO]");
                    System.out.println("-> '" + comboVip + "' colocado en la cocina prioritaria.");
                    break;

                case 4:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("-> Su bandeja de pedido está vacía.");
                    } else {
                        System.out.println("\n--- DETALLE DEL PEDIDO (" + pedidoActual.size() + " productos) ---");
                        for (int i = 0; i < pedidoActual.size(); i++) {
                            System.out.println("[" + i + "] " + pedidoActual.get(i));
                        }
                    }
                    break;

                case 5:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("-> El pedido está vacío.");
                    } else {
                        System.out.print("Turno de preparación del combo " + (pedidoActual.size() - 1) + ": ");
                        int idx = sc.nextInt();
                        sc.nextLine();

                        if (idx >= 0 && idx < pedidoActual.size()) {
                            System.out.println("-> En la posición " + idx + " está: " + pedidoActual.get(idx));
                        } else {
                            System.out.println("-> Error: No hay ningún combo registrado en ese turno.");
                        }
                    }
                    break;

                case 6:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("-> No hay combos ni productos en el pedido para cambiar.");
                    } else {
                        System.out.println("\n--- SELECCIONA EL PRODUCTO A CAMBIAR ---");
                        for (int i = 0; i < pedidoActual.size(); i++) {
                            System.out.println("[" + i + "] " + pedidoActual.get(i));
                        }
                        System.out.print("Ingrese el índice a cambiar: ");
                        int indiceCambio = sc.nextInt();
                        sc.nextLine();

                        if (indiceCambio >= 0 && indiceCambio < pedidoActual.size()) {
                            System.out.print("Escriba el nombre del nuevo producto de reemplazo: ");
                            String nuevoItem = sc.nextLine();

                            String anterior = pedidoActual.set(indiceCambio, nuevoItem);
                            System.out.println("-> Se cambió '" + anterior + "' por '" + nuevoItem + "'.");
                        } else {
                            System.out.println("-> Índice inválido.");
                        }
                    }
                    break;

                case 7:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("-> No hay productos para eliminar.");
                    } else {
                        System.out.println("\n--- PRODUCTOS EN LA ORDEN ---");
                        for (int i = 0; i < pedidoActual.size(); i++) {
                            System.out.println("[" + i + "] " + pedidoActual.get(i));
                        }
                        System.out.print("Ingrese el número del producto que desea retirar del pedido: ");
                        int idxEliminar = sc.nextInt();
                        sc.nextLine();

                        if (idxEliminar >= 0 && idxEliminar < pedidoActual.size()) {
                            String removido = pedidoActual.remove(idxEliminar);
                            System.out.println("-> '" + removido + "' fue retirado del pedido.");
                        } else {
                            System.out.println("-> Posición no válida.");
                        }
                    }
                    break;

                case 8:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("-> El pedido está vacío.");
                    } else {
                        System.out.print("Escriba el nombre a buscar en el pedido: ");
                        String textoBuscar = sc.nextLine();

                        if (pedidoActual.contains(textoBuscar)) {
                            int pos = pedidoActual.indexOf(textoBuscar);
                            System.out.println("-> Se encuentra asignado al turno: " + pos);
                        } else {
                            System.out.println("-> '" + textoBuscar + "' no se encuentra en el pedido actual.");
                        }
                    }
                    break;

                case 9:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("-> No hay platos pendientes por preparar.");
                    } else {
                        System.out.println("\n--- DESPACHANDO DESDE COCINA ---");
                        while (!pedidoActual.isEmpty()) {
                            System.out.println("Cocina entrega: " + pedidoActual.remove(0));
                        }
                        System.out.println("-> Todo el pedido ha sido despachado.");
                    }
                    break;

                case 10:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("El pedido ya estaba vacío.");
                    } else {
                        pedidoActual.clear();
                        System.out.println("Pedido cancelado exitosamente.");
                    }
                    break;

                case 11:
                    if (pedidoActual.isEmpty()) {
                        System.out.println("No puede facturar una orden vacía.");
                    } else {
                        System.out.println("           FACTURA ELECTRÓNICA KFC        ");
                        for (int i = 0; i < pedidoActual.size(); i++) {
                            System.out.println(" * " + pedidoActual.get(i));
                        }
                        System.out.println("Total de productos: " + pedidoActual.size());
                        pedidoActual.clear();
                        System.out.println("¡Gracias por su compra en KFC!");
                    }
                    break;

                case 12:
                    System.out.println("Saliendo del menú KFC. ¡Buen día!");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 12);

        sc.close();
    }
}