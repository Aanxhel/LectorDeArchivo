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
            String archivo;
            archivo = Console.ReadLine(); 

            

            ReadItem readItem = new ReadItem();

            readItem.checkList(archivo);








            Console.WriteLine("Presione cualquier tecla para salir....");
            Console.ReadKey();

        }
    }
}
