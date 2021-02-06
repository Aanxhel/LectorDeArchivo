package formatarchivo;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Operadores {

    //analizador de existencia de archivo
    public void analizarRuta(String r) {              //cara de ruta de archivo
        File archivoSinFormato = new File(r);           // File compruba que exista el archivo
        if (archivoSinFormato.exists()) {             //verificar si existe archivo
            System.out.println("Success");
        } else {                                      // en caso de no exitir mensa de salida
            System.out.println("no existe y hay que crearlo");
        }//fin de IF/ELSE
    }//fin void analizarRuta

    //clase que lee el archivo e imprime en consola
    public void lecturaArchivoConca(String in, String out) throws IOException {

        String[] catas = {
            "CapacitaciC3n externa",
            "Clase en lC-nea",
            "Conectar elemento",
            "CurrC-culo",
            "Evento",
            "Item Type",
            "Lista de verificaciC3n",
            "de la observaciC3n",
            "Material",
            "Nota",
            "Prueba",
            "Seguidor",
            "SesiC3n",
            "Video",
            "(blank)",
            "Grand Total"
        };

        BufferedReader buffer;

        try {
            FileReader r = new FileReader(in);                //carga del archivo texto
            buffer = new BufferedReader(r);

            //System.out.println(buffer.readLine());// me imprime linea por linea
            //lectura del archivo de texto e imprecion en consola
            String temp = "";

            File arcSal = new File(out);
            BufferedWriter bufferSalida = new BufferedWriter(new FileWriter(arcSal));
            bufferSalida.write("STUD_ID|CPNT_TYP_ID|CPNT_ID|REV_DTE|CMPL_STAT_ID|COMPL_DTE|COMPL_DTE_TIMEZONE|LST_UPD_USR|GRADE|REV_NUM|CREDIT_HRS|CPE_HRS|CONTACT_HRS|TOTAL_HRS|INST_N:00 AME|COMMENTS|ES_USER_N:00 AME|ESIG_MEANING_CODE_ID|ESIG_MESSAGE|SCHD_ID|INCLUDE_IN_GOVT_REPORTING|PROGR:00 AM1_2483_ID|PROGR:00 AM1_HRS|PROGR:00 AM1_TRAINING_FUNDING_ID|PROGR:00 AM1_HOURS_DURING_WORK|HOURS_OUTSIDE_OF_WORK|PROGR:00 AM2_2483_ID|PROGR:00 AM2_HRS|PROGR:00 AM2_TRAINING_FUNDING_ID|PROGR:00 AM2_HOURS_DURING_WORK|PROGR:00 AM2_HOURS_OUTSIDE_OF_WORK|PROGR:00 AM3_2483_ID|PROGR:00 AM3_HRS|PROGR:00 AM3_TRAINING_FUNDING_ID|PROGR:00 AM3_HOURS_DURING_WORK|PROGR:00 AM3_HOURS_OUTSIDE_OF_WORK|HOURLY_RATE|HOURLY_RATE_CURRENCY|LGL_ENTITY_2483_ID|EMP_CLASS_2483_ID|TRAINING_ACTION_CATEGORY_ID|TRAINING_PURPOSE_ID|ADJUSTED_HOURLY_RATE|ADJUSTED_HOURLY_RATE_CURRENCY|!##!");

            while (temp != null) {                // buscador de archivo todas las lineas
                temp = buffer.readLine();

                bufferSalida.write("\n");           // salto de linea para no ensimar el archivo
                if (temp == null) {
                    break;

                }

                // for each loop 
                for (String colu : catas) {

                    if (temp.contains(colu)) {

                        //temp.replace("|Terminado|", "|" + colu + "-Terminado|");
                        //temp.replace("\" \"", "");
                        bufferSalida.write(temp.replace("|Terminado|", "|" + colu + "-Terminado|"));

                    }
                }//fin for each loop

            }//fin while

            bufferSalida.close();

            JOptionPane.showMessageDialog(null, "Archivo Modificado con Exito!!");

        } catch (Exception ex) {
            System.out.println("sin archivo");
            JOptionPane.showMessageDialog(null, "Error de archivo");
        }//fin try/catch 

    }// fin void lecturaArchivoConcatena
    
    
    
    
        public void lecturaArchivoComi(String in, String out) throws IOException {

        BufferedReader buffer;

        try {
            FileReader r = new FileReader(in);                //carga del archivo texto
            buffer = new BufferedReader(r);

            //System.out.println(buffer.readLine());// me imprime linea por linea
            //lectura del archivo de texto e imprecion en consola
            String temp = "";

            File arcSal = new File(out);
            BufferedWriter bufferSalida = new BufferedWriter(new FileWriter(arcSal));
            bufferSalida.write("STUD_ID|CPNT_TYP_ID|CPNT_ID|REV_DTE|CMPL_STAT_ID|COMPL_DTE|COMPL_DTE_TIMEZONE|LST_UPD_USR|GRADE|REV_NUM|CREDIT_HRS|CPE_HRS|CONTACT_HRS|TOTAL_HRS|INST_N:00 AME|COMMENTS|ES_USER_N:00 AME|ESIG_MEANING_CODE_ID|ESIG_MESSAGE|SCHD_ID|INCLUDE_IN_GOVT_REPORTING|PROGR:00 AM1_2483_ID|PROGR:00 AM1_HRS|PROGR:00 AM1_TRAINING_FUNDING_ID|PROGR:00 AM1_HOURS_DURING_WORK|HOURS_OUTSIDE_OF_WORK|PROGR:00 AM2_2483_ID|PROGR:00 AM2_HRS|PROGR:00 AM2_TRAINING_FUNDING_ID|PROGR:00 AM2_HOURS_DURING_WORK|PROGR:00 AM2_HOURS_OUTSIDE_OF_WORK|PROGR:00 AM3_2483_ID|PROGR:00 AM3_HRS|PROGR:00 AM3_TRAINING_FUNDING_ID|PROGR:00 AM3_HOURS_DURING_WORK|PROGR:00 AM3_HOURS_OUTSIDE_OF_WORK|HOURLY_RATE|HOURLY_RATE_CURRENCY|LGL_ENTITY_2483_ID|EMP_CLASS_2483_ID|TRAINING_ACTION_CATEGORY_ID|TRAINING_PURPOSE_ID|ADJUSTED_HOURLY_RATE|ADJUSTED_HOURLY_RATE_CURRENCY|!##!");

            while (temp != null) {                // buscador de archivo todas las lineas
                temp = buffer.readLine();

                bufferSalida.write("\n");           // salto de linea para no ensimar el archivo
                if (temp == null) {
                    break;

                }
                
                bufferSalida.write(temp.replace("\" \"", ""));

            }//fin while

            bufferSalida.close();

            JOptionPane.showMessageDialog(null, "Archivo Modificado con Exito!!");

        } catch (Exception ex) {
            System.out.println("sin archivo");
            JOptionPane.showMessageDialog(null, "Error de archivo");
        }//fin try/catch 

    }// fin void lecturaArchivoComi
    
    
    

}//fin class Operadores
