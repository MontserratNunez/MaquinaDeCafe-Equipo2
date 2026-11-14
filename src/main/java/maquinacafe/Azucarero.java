package maquinacafe;

/**
 * Azucarero de la maquina, medido en cucharadas.
 */
public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    /** Indica si hay al menos las cucharadas solicitadas. */
    public boolean hasAzucar(int cucharadasSolicitadas) {
        return cantidadAzucar >= cucharadasSolicitadas;
    }

    /** Entrega azucar: descuenta las cucharadas servidas. */
    public void giveAzucar(int cucharadasEntregadas) {
        cantidadAzucar -= cucharadasEntregadas;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
