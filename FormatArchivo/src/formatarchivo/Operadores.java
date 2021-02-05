
package formatarchivo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operadores {
    
    //analizador de existencia de archivo
    public void analizarRuta(String r){              //cara de ruta de archivo
        File archivoSinFormato = new File( r );
        
        if(archivoSinFormato.exists()){             //verificar si existe archivo
            
            System.out.println("la ruta existe");
        }else{                                      // en caso de no exitir mensa de salida
            System.out.println("no existe");
        }//fin de IF/ELSE
        
    }//fin void analizarRuta
    
    //clase que lee el archivo e imprime en consola
    public void lecturaArchivo(String ruta){
        
        try {
            FileReader r = new FileReader(ruta);                //carga del archivo texto
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
    }// fin void lecturaArchivo
}
