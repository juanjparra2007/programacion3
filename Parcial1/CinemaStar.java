import java.util.Scanner;


public class CinemaStar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Sala sala = new Sala();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n========== CINEMASTAR - MENU PRINCIPAL ==========");
            System.out.println("1. Creacion de peliculas");
            System.out.println("2. Asignacion de funciones");
            System.out.println("3. Ventas de entradas");
            System.out.println("Seleccione una opcion: ");

            int opcion = leerEntero(scanner);
        }


    }

}
