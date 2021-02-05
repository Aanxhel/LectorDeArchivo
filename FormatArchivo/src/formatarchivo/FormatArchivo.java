
package formatarchivo;

import java.io.IOException;
import java.util.Scanner;

public class FormatArchivo {

    public static void main(String[] args) throws IOException {
        
        String locaArchivo = "./Archivo/archivo.txt";
        String locaSalisa = "./Archivo/archivoSalida.txt";
        
        Operadores archivo = new Operadores();

        archivo.analizarRuta(locaArchivo);
        archivo.lecturaArchivo(locaArchivo);
        archivo.escribirArchivo(locaSalisa);
        
    }// static void main
}//fin class FormatArchivo
