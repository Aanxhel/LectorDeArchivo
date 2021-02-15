/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatarchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class chancheDate {

    //|26-10-2012 10:55 AM|
    // date format 1
    private static final DateTimeFormatter dateFormatter
            = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");


    /*
    Exprecion regular FECHA:
    \|\d\d.\d\d.\d\d\d\d.\d\d.\d\d\s\w\w\|
     */
    // date format 2
    //|NOV-20-2020 13:00:00|
    /*
    private static final DateTimeFormatter dateFormatterNew 
        = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");*/
    private static final DateTimeFormatter dateFormatterNew
            = DateTimeFormatter.ofPattern("MMM-dd-yyyy ");

    Pattern patDateFormart = Pattern.compile(" \\|\\d\\d.\\d\\d.\\d\\d\\d\\d.\\d\\d.\\d\\d\\s\\w\\w\\|");
//reemplaza las cambioFecha

    public void cambioFecha(String in, String out) throws IOException {
        BufferedReader buffer;

        try {
            FileReader r = new FileReader(in);                //carga del archivo texto
            buffer = new BufferedReader(r);
            //System.out.println(buffer.readLine());// me imprime linea por linea
            //lectura del archivo de texto e imprecion en consola
            String temp = "";
            File arcSal = new File(out);
            BufferedWriter bufferSalida = new BufferedWriter(new FileWriter(arcSal));
            while (temp != null) {                // buscador de archivo todas las lineas
                temp = buffer.readLine();

                if (temp == null) {
                    break;
                }
                //bufferSalida.write(temp.replace("\" \"", ""));

               

                bufferSalida.write("\n");           // salto de linea para no ensimar el archivo
            }//fin while
            bufferSalida.close();

            JOptionPane.showMessageDialog(null, "Archivo creado");
        } catch (Exception ex) {
            System.out.println("sin archivo");
            JOptionPane.showMessageDialog(null, "Error de archivo");

        }//fin try/catch 

    }// fin void cambioFecha

}//fin class chancheDate
