
package formatarchivo;

import java.util.Scanner;

public class FormatArchivo {

    public static void main(String[] args) {
        
        String locaArchivo = "./Archivo/asino.txt";
        
        
        Operadores archivo = new Operadores();
        
        archivo.analizarRuta(locaArchivo);
        archivo.lecturaArchivo(locaArchivo);
        
    }
    
}
