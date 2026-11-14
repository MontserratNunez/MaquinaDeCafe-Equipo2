package maquinacafe;

/**
 * Deposito de cafe de la maquina, medido en onzas.
 */
public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    /** Indica si hay al menos la cantidad de cafe solicitada. */
    public boolean hasCafe(int cantidadSolicitada) {
        return cantidadCafe >= cantidadSolicitada;
    }

    /** Sirve cafe: descuenta la cantidad entregada del deposito. */
    public void giveCafe(int cantidadEntregada) {
        cantidadCafe -= cantidadEntregada;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
}
