using System;
using System.IO;


namespace ConsoleApp1
{
    internal class ReadItem
    {
        internal void checkList(TextReader trIn)
        {

            /*
             se cra archivo
             */
            /*
           TextWriter archivoWriter;
           archivoWriter = new StreamWriter("../../Archivo/tmp/archivo.txt");

           string mensaje;
           mensaje = Console.ReadLine();
           archivo.WriteLine(mensaje);

            archivoWriter.Close();
           */
            //            TextReader archivoReader = new StreamReader("./../../Archivo/tmp/archivo.txt");
            
            Console.WriteLine(trIn.ReadToEnd());

            trIn.Close();


        }
    }
}