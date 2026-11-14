package maquinacafe;

/**
 * Dispensador de vasos de un mismo tamano.
 * Guarda cuantos vasos quedan y cuantas onzas de cafe lleva cada uno.
 */
public class Vaso {
    private int cantidadVasos;
    private int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    /** Indica si quedan al menos la cantidad de vasos solicitada. */
    public boolean hasVasos(int cantidadSolicitada) {
        return cantidadVasos >= cantidadSolicitada;
    }

    /** Entrega vasos: los descuenta del inventario. */
    public void giveVasos(int cantidadEntregada) {
        cantidadVasos -= cantidadEntregada;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
}
