/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobme.pk;

/**
 *
 * @author Majey
 */
import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Majey
 */
public class FileTypeFilter extends FileFilter{
    
    // Cadena de extensiones de archivos
    private final String extension;
    // Descripción de la extensión del archivo
    private final String description;
    
    // Constructor Method
    public FileTypeFilter(String extension, String description){
        // Establecer valores del constructor
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(File file) {
        // Si el archivo devuelve el directorio
        if(file.isDirectory()){
            return true;
        }
        // Devuelve el nombre del archivo con la extensión
        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        // Volver a mostrar el tipo de archivo y la descripción
        return description + String.format(" (*%s)", extension);
    }
    
}
