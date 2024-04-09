package es.maestredam;
public class FUtilApp {
    public static void main(String[] args) {
        String[] archivo = {"HolaMundo", "Venta", "Usuario"};

        for (String archivo1 : archivo) {
            boolean existe = FUtil.existe(archivo1);
            System.out.println("El archivo '" + archivo1 + "' existe: " + existe);
        }
    }
}
