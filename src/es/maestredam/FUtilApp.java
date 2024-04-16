package es.maestredam;




public class FUtilApp {
    public static void main(String[] args) {
        String[] archivo = {"archivo1.txt", "", "   ", "archivo2.txt"};

        for (String filename : archivo) {
            try {
                boolean existe = FUtil.existe(filename);
                System.out.println("El archivo '" + filename + "' existe: " + existe);
            } catch (IllegalArgumentException e) {
                System.out.println("Excepción atrapada: " + e.getMessage());
            }
        }
    }
}
