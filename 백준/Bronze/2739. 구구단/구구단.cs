using System;
//using System.Linq;
using System.Text;
//using System.Collections.Generic;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string param = Console.ReadLine();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 9; i++)
            {
                int tier = i+1;
                int parameter = Convert.ToInt32(param);
                int cal = parameter * tier;
                
                sb.Append(parameter)
                    .Append(" * ")
                    .Append(tier)
                    .Append(" = ")
                    .Append(cal)
                    .Append("\n")
                    ;
            }
            Console.WriteLine(sb.ToString());
        }
    }
}