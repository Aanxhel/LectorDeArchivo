using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Estatus:");
            TextReader archivoReader = new StreamReader("./../../../Archivo/tmp/esteNo.txt");
            TextWriter archivoWriter = new StreamWriter("./../../../Archivo/tmp/archivo.txt");


            ReadItem item = new ReadItem();

            item.checkList(archivoReader, archivoWriter);


            Console.WriteLine("Presione cualquier tecla para salir....");
            Console.ReadKey();

        }
    }
}
