package formatarchivo;

import java.io.*;
import java.util.Arrays;
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

        int i = 0;
        BufferedReader buffer;
        String[] variable;

        variable = new String[in.length()];

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

                
                if(temp == "\""){
                    temp = " ";
                }
                if (temp == null) {
                    break;

                }
                
                
                //lectura e imprecion de txt sin modificar
                //System.out.println(temp);
                
                bufferSalida.write(temp);

            }//fin while
            
            bufferSalida.close();

        } catch (Exception ex) {
            System.out.println("sin archivo");
        }//fin try/catch 

        
        /*
        //instancia de salida
        File arcSal = new File(out);
        File arcEn = new File(in);

        BufferedWriter bufferSalida = new BufferedWriter(new FileWriter(arcSal));
        bufferSalida.write("o;?STUD_ID|CPNT_TYP_ID|CPNT_ID|REV_DTE|CMPL_STAT_ID|COMPL_DTE|COMPL_DTE_TIMEZONE|LST_UPD_USR|GRADE|REV_NUM|CREDIT_HRS|CPE_HRS|CONTACT_HRS|TOTAL_HRS|INST_N:00 AME|COMMENTS|ES_USER_N:00 AME|ESIG_MEANING_CODE_ID|ESIG_MESSAGE|SCHD_ID|INCLUDE_IN_GOVT_REPORTING|PROGR:00 AM1_2483_ID|PROGR:00 AM1_HRS|PROGR:00 AM1_TRAINING_FUNDING_ID|PROGR:00 AM1_HOURS_DURING_WORK|HOURS_OUTSIDE_OF_WORK|PROGR:00 AM2_2483_ID|PROGR:00 AM2_HRS|PROGR:00 AM2_TRAINING_FUNDING_ID|PROGR:00 AM2_HOURS_DURING_WORK|PROGR:00 AM2_HOURS_OUTSIDE_OF_WORK|PROGR:00 AM3_2483_ID|PROGR:00 AM3_HRS|PROGR:00 AM3_TRAINING_FUNDING_ID|PROGR:00 AM3_HOURS_DURING_WORK|PROGR:00 AM3_HOURS_OUTSIDE_OF_WORK|HOURLY_RATE|HOURLY_RATE_CURRENCY|LGL_ENTITY_2483_ID|EMP_CLASS_2483_ID|TRAINING_ACTION_CATEGORY_ID|TRAINING_PURPOSE_ID|ADJUSTED_HOURLY_RATE|ADJUSTED_HOURLY_RATE_CURRENCY|!##!");

        bufferSalida.close();*/

    }// fin void lecturaArchivo

}//fin class Operadores
