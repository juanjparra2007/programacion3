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
        sala.listarPeliculas();
        System.out.print("\nDesea agregar una nueva pelicula?  (S/N): ");
        String resp = scanner.nestLine();

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
    
    
    
}
