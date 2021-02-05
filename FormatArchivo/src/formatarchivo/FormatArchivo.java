
package formatarchivo;

import java.util.Scanner;

public class FormatArchivo {

    public static void main(String[] args) {
        Scanner ingresaArchivo = new Scanner(System.in);
        
        Operadores archivo = new Operadores();
        
        System.out.println("Ingrese ruta de archivo:");
        archivo.analizarRuta(ingresaArchivo.nextLine());
        
        
    }
    
}
