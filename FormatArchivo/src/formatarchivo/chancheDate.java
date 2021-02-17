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

            bufferSalida.write("STUD_ID|CPNT_TYP_ID|CPNT_ID|REV_DTE|CMPL_STAT_ID|COMPL_DTE|COMPL_DTE_TIMEZONE|LST_UPD_USR|GRADE|REV_NUM|CREDIT_HRS|CPE_HRS|CONTACT_HRS|TOTAL_HRS|INST_N:00 AME|COMMENTS|ES_USER_N:00 AME|ESIG_MEANING_CODE_ID|ESIG_MESSAGE|SCHD_ID|INCLUDE_IN_GOVT_REPORTING|PROGR:00 AM1_2483_ID|PROGR:00 AM1_HRS|PROGR:00 AM1_TRAINING_FUNDING_ID|PROGR:00 AM1_HOURS_DURING_WORK|HOURS_OUTSIDE_OF_WORK|PROGR:00 AM2_2483_ID|PROGR:00 AM2_HRS|PROGR:00 AM2_TRAINING_FUNDING_ID|PROGR:00 AM2_HOURS_DURING_WORK|PROGR:00 AM2_HOURS_OUTSIDE_OF_WORK|PROGR:00 AM3_2483_ID|PROGR:00 AM3_HRS|PROGR:00 AM3_TRAINING_FUNDING_ID|PROGR:00 AM3_HOURS_DURING_WORK|PROGR:00 AM3_HOURS_OUTSIDE_OF_WORK|HOURLY_RATE|HOURLY_RATE_CURRENCY|LGL_ENTITY_2483_ID|EMP_CLASS_2483_ID|TRAINING_ACTION_CATEGORY_ID|TRAINING_PURPOSE_ID|ADJUSTED_HOURLY_RATE|ADJUSTED_HOURLY_RATE_CURRENCY|!##!");
            while (temp != null) {                // buscador de archivo todas las lineas
                temp = buffer.readLine();

                if (temp == null) {
                    break;
                }
                //bufferSalida.write(temp.replace("\" \"", ""));

                Pattern patDateFormart = Pattern.compile("\\|\\d\\d.\\d\\d.\\d\\d\\d\\d.\\d\\d.\\d\\d.\\w\\w");
                Matcher matDateFormart = patDateFormart.matcher(temp);

                if (matDateFormart.find()) {

                    bufferSalida.write(matDateFormart.replaceFirst("|ENE-13-2021 13:00:00|"));

                }

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
