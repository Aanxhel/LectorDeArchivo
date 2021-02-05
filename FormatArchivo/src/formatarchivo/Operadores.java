package formatarchivo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operadores {

    //analizador de existencia de archivo
    public void analizarRuta(String r) {              //cara de ruta de archivo
        File archivoSinFormato = new File(r);           // File compruba que exista el archivo
        if (archivoSinFormato.exists()) {             //verificar si existe archivo
            System.out.println("la ruta existe");
        } else {                                      // en caso de no exitir mensa de salida
            System.out.println("no existe y hay que crearlo");
        }//fin de IF/ELSE
    }//fin void analizarRuta

    //clase que lee el archivo e imprime en consola
    public void lecturaArchivo(String ruta) {

        try {
            FileReader r = new FileReader(ruta);                //carga del archivo texto
            BufferedReader buffer = new BufferedReader(r);

            //System.out.println(buffer.readLine());// me imprime linea por linea
            //lectura del archivo de texto e imprecion en consola
            String temp = "";
            while (temp != null) {                // buscador de archivo todas las lineas
                temp = buffer.readLine();
                if (temp == null) {
                    break;
                }
                System.out.println(temp);
            }//fin while

        } catch (Exception ex) {
            System.out.println("sin archivo");
        }
    }// fin void lecturaArchivo
    
    public void escribirArchivo(String r)throws IOException{
        
        File archivo = new File(r);
        
        BufferedWriter bw;                              //buffer para escribir
        
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("El fichero de texto ya estaba creado.");
        
        bw.close();
    }
}//fin class Operadores
