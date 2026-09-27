public class Pelicula {
    private String nombre;
    private String idioma;
    private String tipo;
    private int duracionMinutos;

    public Pelicula(String pNombre, String pIdioma, String pTipo, int pDuracion) {
        nombre = pNombre;
        idioma = pIdioma;
        tipo = pTipo;
        duracionMinutos = pDuracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    
    public String getTipo() {
        return tipo;
    }

    public int getDuracion() {
        return duracionMinutos;
    }

















}
