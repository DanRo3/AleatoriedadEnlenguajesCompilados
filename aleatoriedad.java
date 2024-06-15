import java.util.*;
import java.util.Random;


class Main {
  
    public class GeneradorAleatorio {
        public static String generarPalabra(int longitud, int rango) {
            StringBuilder palabra = new StringBuilder();
            Random random = new Random();
    
            for (int i = 0; i < longitud; i++) {
                char caracter = (char) ('a' + random.nextInt(rango));
                palabra.append(caracter);
            }
    
            return palabra.toString();
        }
    }
    
    public static void main(String[] args) {
        int longitud = 10;
        int rango = 26;

        String palabraGenerada = GeneradorAleatorio.generarPalabra(longitud, rango);
        System.out.println("Palabra generada: " + palabraGenerada);
    }
}
