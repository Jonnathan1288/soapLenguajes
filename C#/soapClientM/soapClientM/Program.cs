using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace soapClientM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            soapM.serviciosClient cliente = new soapM.serviciosClient();

            Console.WriteLine("Op 1: "+cliente.hello("Jonnathan"));
            Console.WriteLine("Resultado 2: " + cliente.diccionario("so"));
            Console.WriteLine("Resultado 3: " + cliente.par_impar(3));
            Console.WriteLine("Resultado 4: " + cliente.potencia(2, 3));
            Console.WriteLine("Resultado 5 SUMA: " + cliente.suma(20, 50));
            Console.WriteLine("Resultado 6 RESTA: " + cliente.resta(50, 30));
            Console.WriteLine("Resultado 7 MULTIPLICACIÓN: " + cliente.multiplicacion(20, 50));

            if (cliente.login("Jonnathan", "md3108"))
            {
                Console.WriteLine("Login succesful");
            }
            else {
                Console.WriteLine("Error login");
            }


            cliente.Close();
            Console.ReadLine();
        }
    }
}
