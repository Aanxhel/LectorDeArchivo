using System;
using System.IO;


namespace ConsoleApp1
{
    internal class ReadItem
    {
        internal void checkList(string item)
        {
            
            System.Console.WriteLine("La ruta es {0}",item);


            
            try
            {
                //Pass the file path and file name to the StreamReader constructor
                StreamReader sr = new StreamReader(item);
                //Read the first line of text
                item = sr.ReadLine();
                //Continue to read until you reach end of file
                while (item != null)
                {
                    //write the lie to console window
                    Console.WriteLine(item);
                    //Read the next line
                    item = sr.ReadLine();
                }
                //close the file
                sr.Close();
                Console.ReadLine();
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
            finally
            {
                Console.WriteLine("Executing finally block.");
            }

        }
    }
}