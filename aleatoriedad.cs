using System;
using System.Text;

class HelloWorld {
    public static void Main(string[] args) {
        string palabra = GenerarPalabra(8, 26); 
        Console.WriteLine(palabra);
    }

    public static string GenerarPalabra(int tam, int range) {
        StringBuilder palabra = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < tam; i++) {
            char caracter = Convert.ToChar('a' + random.Next(range));
            palabra.Append(caracter);
        }

        return palabra.ToString();
    }
}