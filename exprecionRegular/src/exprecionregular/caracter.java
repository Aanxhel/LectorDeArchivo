package exprecionregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class caracter {

    public void busqueda() {

        System.out.println("programa iniciado");

        String cadena = "abcd|26-10-2012 10:55 AM|efgh";

        Pattern patDateFormart = Pattern.compile("\\|\\d\\d.\\d\\d.\\d\\d\\d\\d.\\d\\d.\\d\\d\\s\\w\\w\\|");
        Matcher matDateFormart = patDateFormart.matcher(cadena);
        
        if (matDateFormart.find()) {
            String matDateFormartp2 = matDateFormart.replaceAll("|Test|");
            System.out.println(matDateFormartp2);
        }
    }//fin de busqueda

}// fin class
