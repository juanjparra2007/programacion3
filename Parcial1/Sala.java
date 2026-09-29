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

    public Pelicula getPelicula(int index) {
        if(index>=0 && index < cantPeliculas) {
            return peliculas[index];
        }
        return null;
    }

    public boolean asignarFuncion(Pelicula p, int sala, int opcionFranja) {
        if(sala < 1 || sala > 3 || opcionFranja < 1 || opcionFranja > 3) {
            return false;
        }

        String franja = FRANJAS[opcionFranja - 1];

        if ((sala == 1 || sala == 2) && p.getTipo().equalsIgnoreCase("3D")) {
            System.out.println(">> Error: Las Salas 1 y 2 no proyectan películas en 3D.");
            return false;
        }

        if (sala == 3 && !p.getTipo().equalsIgnoreCase("3D")) {
            System.out.println(">> Error: La Sala 3 SOLO proyecta películas en 3D.");
            return false;
        }

        for (int i = 0; i < cantFunciones; i++) {
            if (funciones[i].getNumeroSala() == sala && funciones[i].getFranjaHoraria().equals(franja)) {
                System.out.println(">> Error: Ya existe una función asignada en esta sala y franja horaria.");
                return false;
            }
        }

        funciones[cantFunciones++] = new Funcion(p, sala, franja);
        return true;
    }


























}