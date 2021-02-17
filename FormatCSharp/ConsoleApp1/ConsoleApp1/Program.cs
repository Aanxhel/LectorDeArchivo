using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese ruta de archivo:");
            

            String archivo = System.IO.File.ReadAllText(@"C:\Users\Angel Montiel\Desktop\esteNo.txt");

            

            ReadItem read = new ReadItem();

            read.check(archivo);








            Console.WriteLine("Presione cualquier tecla para salir....");
            Console.ReadKey();

        }
    }
}
