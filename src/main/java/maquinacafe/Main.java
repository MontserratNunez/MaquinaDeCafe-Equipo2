package maquinacafe;

import java.util.Scanner;

/**
 * Programa principal: usa la maquina de cafe desde la consola.
 * Los tamanos siguen la guia: pequeno 3 oz, mediano 5 oz, grande 7 oz.
 */
public class Main {

    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasosPequeno(new Vaso(10, 3));
        maquina.setVasosMediano(new Vaso(10, 5));
        maquina.setVasosGrande(new Vaso(10, 7));
        maquina.setCafetera(new Cafetera(100));
        maquina.setAzucarero(new Azucarero(30));

        Scanner entrada = new Scanner(System.in);
        System.out.println("=== MAQUINA DE CAFE ===");

        while (true) {
            mostrarInventario(maquina);
            System.out.print("Tamano (pequeno / mediano / grande, o salir): ");
            if (!entrada.hasNextLine()) {
                break;
            }
            String tipo = entrada.nextLine().trim().toLowerCase();
            if (tipo.equals("salir")) {
                break;
            }

            int cucharadas = leerEntero(entrada, "Cucharadas de azucar: ");
            if (cucharadas < 0) {
                break;
            }

            Vaso vaso = maquina.getTipoDeVaso(tipo);
            String resultado = maquina.getVasoDeCafe(vaso, 1, cucharadas);
            System.out.println(">> " + resultado);
            if (resultado.equals("Felicitaciones")) {
                System.out.println(">> Recoja su vaso " + tipo + " de " + vaso.getContenido()
                        + " oz con " + cucharadas + " cucharada(s) de azucar.");
            }
            System.out.println();
        }
        System.out.println("Gracias por usar la maquina de cafe.");
    }

    private static int leerEntero(Scanner entrada, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (!entrada.hasNextLine()) {
                return -1;
            }
            try {
                int valor = Integer.parseInt(entrada.nextLine().trim());
                if (valor >= 0) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // se vuelve a pedir el dato
            }
            System.out.println("Ingrese un numero entero mayor o igual a 0.");
        }
    }

    private static void mostrarInventario(MaquinaDeCafe maquina) {
        System.out.println("[Inventario] Vasos P/M/G: "
                + maquina.getVasosPequeno().getCantidadVasos() + "/"
                + maquina.getVasosMediano().getCantidadVasos() + "/"
                + maquina.getVasosGrande().getCantidadVasos()
                + " | Cafe: " + maquina.getCafetera().getCantidadCafe() + " oz"
                + " | Azucar: " + maquina.getAzucarero().getCantidadAzucar() + " cdas");
    }
}
