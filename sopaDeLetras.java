import java.util.*;
import java.util.Random;


class Main {
  
    public class GeneradorAleatorio {
        public static char[][] generarSopa(int filas, int columnas, int rango) {
            Random random = new Random();
            char[][] sopaDeLetras = new char[filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    char caracter = (char) ('a' + random.nextInt(rango));
                    sopaDeLetras[i][j] = caracter;
                }
            }

            return sopaDeLetras;
        }
    }
    
    public static void main(String[] args) {
        int fila = 8;
        int columna = 8;
        int rango = 26;

        char palabraGenerada[][] = GeneradorAleatorio.generarSopa(fila, columna, rango);
        System.out.println("Sopa De Letras");
        for(int i = 0;i < fila; i++){
            for(int j=0; j <columna;j++){
                System.out.print(palabraGenerada[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}



