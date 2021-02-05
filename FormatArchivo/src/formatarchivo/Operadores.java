
package formatarchivo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operadores {
    public void analizarRuta(String ruta){
        File archivoSinFormato = new File( ruta );
        
        if(archivoSinFormato.exists()){             //verificar si existe archivo
            
            System.out.println("la ruta existe");
        }else{
            System.out.println("no existe");
        }
        
    }
    
    
    public void lecturaArchivo(String ruta){
        
        try {
            FileReader r = new FileReader(ruta);
            BufferedReader buffer = new BufferedReader(r);
            
            //System.out.println(buffer.readLine());// me imprime linea por linea
            
            //lectura del archivo de texto e imprecion en consola
            String temp = "";
            
            while(temp != null){
                temp = buffer.readLine();
                if(temp == null)break;
                System.out.println(temp);
            }
            
            
        } catch (Exception ex) {
            System.out.println("sin archivo");
        }
    }
}
