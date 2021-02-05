
package formatarchivo;

import java.io.File;

public class Operadores {
    public void analizarRuta(String ruta){
        File archivoSinFormato = new File( ruta );
        
        if(archivoSinFormato.exists()){             //verificar si existe archivo
            
            System.out.println("la ruta existe");
        }else{
            System.out.println("no existe");
        }
        
    }
    
}
