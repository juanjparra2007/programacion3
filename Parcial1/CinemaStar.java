import java.util.Scanner;

public class CinemaStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n========== CINEMASTAR - MENU PRINCIPAL ==========");
            System.out.println("1. Creacion de peliculas");
            System.out.println("2. Asignacion de funciones");
            System.out.println("3. Ventas de entradas");
            System.out.print("Seleccione una opcion: ");

            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    menuPeliculas(scanner, sala);
                    break;
                case 2:
                    menuAsignacion(scanner, sala);
                    break;
                case 3: menuVentas(scanner, sala);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Cerrando el programa... vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion invalida. intente de nuevo");
                    break;
            }
        }
        scanner.close();
    }

    private static void menuPeliculas(Scanner scanner, Sala sala){
        System.out.println("\n--- REGISTRO DE PELICULAS ---");
        sala.listaPeliculas();
        System.out.print("\nDesea agregar una nueva pelicula?  (S/N): ");
        String resp = scanner.nextLine();

        if(resp.equalsIgnoreCase("S")){
            System.out.print("Nombre de la pelicula: ");
            String nombre = scanner.nextLine();

            System.out.print("idioma: ");
            String idioma = scanner.nextLine();
            
            System.out.print("Tipo (1 para 35mm, 2 para 3D): ");
            int tipo0p = leerEntero(scanner);
            
            String tipo = (tipo0p == 2) ? "3D" : "35mm";
            System.out.print("Duracion (en minutos): ");
            int duracion = leerEntero(scanner);

            if (sala.agregarPelicula(new Pelicula(nombre, idioma, tipo, duracion))){
                System.out.println("Pelicula registrada con exito.");
            }else{
                System.out.println("No se puede agregar mas peliculas (limite alcanzado). ");
            }
        }
    }
    
    private static void menuAsignacion(Scanner scanner, Sala sala) {
        System.out.println("\n--- ASIGNACIÓN DE FUNCIONES ---");
        sala.listaPeliculas();

        System.out.print("Seleccione el número de la pelicula a asignar: ");
        int idx = leerEntero(scanner) - 1;
        
        Pelicula p = sala.getPelicula(idx);
        
        if (p == null) {
            System.out.println(">> Película no encontrada.");
            return;
        }
        
        System.out.print("Seleccione la Sala (1, 2 o 3): ");
        int sa = leerEntero(scanner);

        System.out.println("Seleccione Franja Horaria:");
        System.out.println("1. 14:00 - 16:30");
        System.out.println("2. 16:30 - 19:00");
        System.out.println("3. 19:00 - 21:00");
        int franjaOp = leerEntero(scanner);
        
        if (sala.asignarFuncion(p, sa, franjaOp)) {
            System.out.println(">> Función asignada exitosamente.");
        }
    }
    
    private static void menuVentas(Scanner scanner, Sala sala){
        System.out.println("\n--- APARTADO DE VENTAS ---");
        sala.listaFunciones();
        System.out.print("Sseleccione el numero de la funcion");
        int idx = leerEntero(scanner) - 1;
        Funcion f = sala.getFuncion(idx);

        if(f == null) {
            System.out.println(" Funcion no valida. ");
            return; 
        }
        
        boolean ventaActiva = true;
        while (ventaActiva){
            f.mostrarEsquemaSillas();
            System.out.println("Sillas disponibles en esta funcion: " + f.getSillasDisponibles());
            System.out.println("Cuantas sillas desea comprar? (0 para volver al menu): ");
            int cantidad = leerEntero(scanner);

            if ()
        }


    }


}
