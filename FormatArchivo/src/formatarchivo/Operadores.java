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
    public void lecturaArchivo(String in, String out) throws IOException {

        try {
            FileReader r = new FileReader(in);                //carga del archivo texto
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
        }//fin try/catch 

        File archivoSalida = new File(out);

        BufferedWriter buffer = new BufferedWriter(new FileWriter(archivoSalida));
        buffer.write("El fichero de texto ya estaba creado, drentro de read.");
        buffer.close();

    }// fin void lecturaArchivo

    /**
     * ************************************************
     * el close() en necesario para cargar el archivo, de otro modo queda
     * abierto *********************************************
     */
}//fin class Operadores
