public class Sala {
    private Pelicula[] peliculas;
    private int cantPeliculas;

    private Funcion[] funciones;
    private int cantFunciones;

    public static final String [] FRANJAS = { "14:00-16:30", "16:30-19:00", "19:00-21:00" };

    public Sala() {
        peliculas = new Pelicula[20];
        cantPeliculas = 0;
        funciones = new Funcion[9];
        cantFunciones = 0;
    }

    public boolean agregarPelicula(Pelicula p) {
        if (cantPeliculas < peliculas.length) {
            peliculas[cantPeliculas++]=p;
            return true;
        }
        return false;
    }

    public void listaPeliculas() {
        if (cantPeliculas == 0) {
            System.out.println("No hay peliculas registradas.");
            return;
        }
        for(int i = 0; i < cantPeliculas; i++) {
            System.out.println((i + 1) + ". " + peliculas[i].toString());
        }
    }
























}