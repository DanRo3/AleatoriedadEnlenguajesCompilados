#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
using namespace std;

string generarPalabra(int longitud, int rango) {
    string palabra;
    srand(time(0)); // Inicializa la semilla del generador de números aleatorios

    for (int i = 0; i < longitud; ++i) {
        char caracter = 'a' + rand() % rango;
        palabra += caracter;
    }

    return palabra;
}

int main() {
    string palabraGenerada = generarPalabra(10, 26);
    cout << palabraGenerada << endl;
    return 0;
}