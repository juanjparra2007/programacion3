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

        sillasGeneral = new boolean[6][12];

        if (numeroSala == 1 || numeroSala == 2) {
            sillasPreferencial = new boolean[2][9];
        } else {
            sillasPreferencial = null;
        }
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public int getSillasDisponibles() {
        int libres = 0;
        for (int i = 0; i < sillasGeneral.length; i++) {
            for (int j = 0; j < sillasGeneral[i].length; j++) {
                if (!sillasGeneral[i][j]) {
                    libres++;
                }
            }
        }

        if (sillasPreferencial != null) {
            for (int i = 0; i < sillasPreferencial.length; i++) {
                for (int j = 0; j < sillasPreferencial[i].length; j++) {
                    if (!sillasPreferencial[i][j]) {
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

        if (fila >= 'A' && fila <= 'F') {
            int f = fila - 'A';
            if (f >= 0 && f < 6 && col >= 0 && col < 12) {
                return sillasGeneral[f][col];
            }
        } else if ((fila == 'G' || fila == 'H') && sillasPreferencial != null) {
            int f = fila - 'G';
            if (f >= 0 && f < 2 && col >= 0 && col < 9) {
                return sillasPreferencial[f][col];
            }
        }
        return false;
    }

    public boolean ocupaSilla(char fila, int numero) {
        fila = Character.toUpperCase(fila);
        int col = numero - 1;

        if (fila >= 'A' && fila <= 'F') {
            int f = fila - 'A';
            if (f >= 0 && f < 6 && col >= 0 && col < 12) {
                if (!sillasGeneral[f][col]) {
                    sillasGeneral[f][col] = true;
                    return true;
                }
            }
        } else if ((fila == 'G' || fila == 'H') && sillasPreferencial != null) {
            int f = fila - 'G';
            if (f >= 0 && f < 2 && col >= 0 && col < 9) {
                if (!sillasPreferencial[f][col]) {
                    sillasPreferencial[f][col] = true;
                    return true;
                }
            }
        }
        return false;
    }

    public void DibujoDeSala() {
        System.out.println("\n--- ESQUEMA DE SALA" + numeroSala + " (" + franjaHoraria + ") ---");
        System.out.println("     1  2  3  4  5  6  7  8  9 10 11 12");

        if (sillasPreferencial != null) {
            char[] prefFilas = { 'H','G' };
            for (int i = 1; i >= 0; i--) {
                System.out.print(prefFilas[i] + "    ");
                for (int j = 0; j < 9; j++) {
                    System.out.print(sillasPreferencial[i][j] ? " X " : " _ ");
                }
                System.out.println();
            }
            System.out.println("----------------------------------------");
        }

        char[] genFilas = {'F', 'E', 'D', 'C', 'B', 'A'};
        for (int i = 0; i < 6; i++) {
            System.out.print(genFilas[i] + "   ");
            for (int j = 0; j < 12; j++) {
                System.out.print(sillasGeneral[5 - i][j] ? " X " : " _ ");
            }
            System.out.println();
        }
        System.out.println("    [------------- PANTALLA -------------]\n");
    }
}