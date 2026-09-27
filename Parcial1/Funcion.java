public class Funcion {
    private Pelicula pelicula;
    private int numeroSala;
    private String franjaHoraria;

    private boolean[][] sillasGeneral;

    private boolean[][] sillasPreferencial;

    public Funcion(Pelicula pPelicula, int pNumeroSala, String pFranjaHoraria) {
        pelicula = pPelicula;
        numeroSala = pNumeroSala;
        franjaHoraria = pFranjaHoraria;


        sillasGeneral = new boolean[5][12];


        if (numeroSala == 1 || numeroSala == 2) {
            sillasPreferencial = new boolean[2][9];
        } else {
            sillasPreferencial = null;
        }
    }

    public Pelicula getPelicula() { return pelicula; }
    public int getNumeroSala() { return numeroSala; }
    public String getFranjaHoraria() { return franjaHoraria; }













































}
