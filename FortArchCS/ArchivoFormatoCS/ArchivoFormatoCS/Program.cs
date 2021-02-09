using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace ArchivoFormatoCS
{
    class Program
    {
        static void Main(string[] args)




        {
            String locaArchivo;// = "./Archivo/archivo.txt";
            String locaSalisa = "./Archivo/temp/arcSal1.txt";
            String locaSalisa2 = "./Archivo/temp/arcSal2.txt";
            String locaSalisa3 = "./Archivo/temp/arcSal3.txt";
            String locaSalisa4 = "./Archivo/temp/arcSal4.txt";
            String salida = "./Archivo/archivo.txt";

            Console.WriteLine("Ubucacion del archivo: ");
            locaArchivo = Console.ReadLine();


            Operadores archivo = new Operadores();

            Console.WriteLine("inicio de programa");
            

            /* archivo.analizarRuta(locaArchivo);
             archivo.ConcatPath(locaArchivo, locaSalisa);
             archivo.comiFormat(locaSalisa, locaSalisa2);
             archivo.dateFormat(locaSalisa2, locaSalisa3);
             archivo.dateVocal(locaSalisa3, locaSalisa4);*/

            Console.WriteLine("Fin del programa");
            Console.ReadKey();

        }
    }
}
