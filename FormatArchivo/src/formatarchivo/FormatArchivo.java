
package formatarchivo;

import java.io.IOException;
import java.util.Scanner;

public class FormatArchivo {

    public static void main(String[] args) throws IOException {
        
        String locaArchivo;// = "./Archivo/archivo.txt";
        String locaSalisa = "./Archivo/archivoSalida.txt";
        
        System.out.print("ingrese ruta de archivo:");
        Scanner sc = new Scanner(System.in);
        locaArchivo = sc.nextLine();
        
        
        Operadores archivo = new Operadores();

        archivo.analizarRuta(locaArchivo);
        archivo.lecturaArchivo(locaArchivo,locaSalisa);
        
        
        System.out.println("fin del programa");
        
    }// static void main
}//fin class FormatArchivo
