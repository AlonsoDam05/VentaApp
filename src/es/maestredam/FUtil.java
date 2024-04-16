package es.maestredam;

import java.io.File;

public class FUtil {
	 /**
     * Comprueba si un archivo existe en el sistema de archivos.
     *
     * @param filename el nombre del archivo a verificar
     * @return true si el archivo existe, false en caso contrario
     * @throws IllegalArgumentException si el nombre de archivo es nulo o está vacío
     */
    public static boolean existe(String filename) throws IllegalArgumentException {
        if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de archivo no puede estar vacío o contener solo espacios en blanco");
        }
        
        File file = new File(filename);
        return file.exists();
    }
}
