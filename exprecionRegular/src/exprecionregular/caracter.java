package exprecionregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class caracter {

    public void busqueda() {

        System.out.println("programa iniciado");

        String cadena = "abcd|26-10-2012 10:55 AM|efgh";

        Pattern patDateFormart = Pattern.compile("\\|\\d\\d.\\d\\d.\\d\\d\\d\\d.");

        Matcher matDateFormart = patDateFormart.matcher(cadena);

        if (matDateFormart.find()) {
            System.out.println(matDateFormart.replaceFirst(cadena));
        }//fin if

    }//fin de busqueda

}// fin class
