package maquinacafe;

/**
 * Maquina dispensadora de cafe.
 * Coordina los dispensadores de vasos, la cafetera y el azucarero:
 * primero verifica que haya de todo y solo entonces sirve y descuenta.
 */
public class MaquinaDeCafe {

    static final String PEQUENO = "pequeno";
    static final String MEDIANO = "mediano";
    static final String GRANDE = "grande";

    static final String NO_HAY_VASOS = "No hay Vasos";
    static final String NO_HAY_CAFE = "No hay Cafe";
    static final String NO_HAY_AZUCAR = "No hay Azucar";
    static final String FELICITACIONES = "Felicitaciones";

    // Visibilidad de paquete: las pruebas de la guia acceden a estos campos.
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;

    /**
     * Devuelve el dispensador de vasos que corresponde al tamano pedido
     * ("pequeno", "mediano" o "grande"), o null si el tamano no existe.
     */
    public Vaso getTipoDeVaso(String tipoDeVaso) {
        if (PEQUENO.equals(tipoDeVaso)) {
            return vasosPequeno;
        } else if (MEDIANO.equals(tipoDeVaso)) {
            return vasosMediano;
        } else if (GRANDE.equals(tipoDeVaso)) {
            return vasosGrande;
        }
        return null;
    }

    /**
     * Sirve los vasos de cafe solicitados con sus cucharadas de azucar.
     * Devuelve un mensaje con el resultado de la operacion.
     */
    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (tipoDeVaso == null || !tipoDeVaso.hasVasos(cantidadDeVasos)) {
            return NO_HAY_VASOS;
        }

        int cafeNecesario = calcularCafeNecesario(tipoDeVaso, cantidadDeVasos);
        if (!cafetera.hasCafe(cafeNecesario)) {
            return NO_HAY_CAFE;
        }
        if (!azucarero.hasAzucar(cantidadDeAzucar)) {
            return NO_HAY_AZUCAR;
        }

        servir(tipoDeVaso, cantidadDeVasos, cafeNecesario, cantidadDeAzucar);
        return FELICITACIONES;
    }

    private int calcularCafeNecesario(Vaso tipoDeVaso, int cantidadDeVasos) {
        return tipoDeVaso.getContenido() * cantidadDeVasos;
    }

    private void servir(Vaso tipoDeVaso, int cantidadDeVasos, int cafeNecesario, int cantidadDeAzucar) {
        tipoDeVaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);
    }

    // ----- Getters y setters -----

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }
}
