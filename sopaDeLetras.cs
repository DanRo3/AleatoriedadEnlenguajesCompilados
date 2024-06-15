using System;

public class GeneradorAleatorio {
    public static char[,] GerarSopa(int filas, int columnas, int range) {
        Random random = new Random();
        char[,] sopaDeLetras = new char[filas, columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char caractere = Convert.ToChar('a' + random.Next(range));
                sopaDeLetras[i, j] = caractere;
            }
        }

        return sopaDeLetras;
    }

    public static void Main(string[] args) {
        const int filas = 8;
        const int columnas = 8;
        const int range = 26; 

        char[,] sopa = GerarSopa(filas, columnas, range);
        Console.WriteLine("Sopa de letras");
        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                Console.Write(sopa[i, j]+" " );
            }
            Console.WriteLine();
        }
    }
}