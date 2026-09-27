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

    public int getSillasDisponibles() {
        int libres = 0;
        for(int i = 0; i < sillasGeneral.length; i++) {
            for(int j = 0; j < sillasGeneral[i].length; j++) {
                if(!sillasGeneral[i][j]) {
                    libres++;
                }
            }
        }

        if (sillasPreferencial != null) {
            for(int i = 0; i < sillasPreferencial.length; i++) {
                for(int j = 0; j < sillasPreferencial[i].length; j++) {
                    if(!sillasPreferencial[i][j]) {
                        libres++;
                }
            }
        }
        }
        return libres;
    }

    public boolean sillaOcupada(char fila, int numero) {
        fila = Character.toUpperCase(fila);
        int col = numero - 1;

        if (fila >= 'A' && fila <= 'E') {
            int f = fila - 'A';
            if (f >= 0 && f < 5 && col >= 0 && col < 12) {
                return sillasGeneral[f][col];
            }
        } else if ((fila == 'F' || fila == 'G') && sillasPreferencial != null) {
            int f = fila - 'G';
            if (f >= 0 && f < 2 && col >= 0 && col < 9) {
                return sillasPreferencial[f][col];
            }
        }
        return false;
    }










































}