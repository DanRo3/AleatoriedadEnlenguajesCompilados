#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
using namespace std;

vector<vector<char>> generarSopa(int filas, int columnas, int rango) {
    vector<vector<char>> sopaDeLetras(filas,vector<char>(columnas));
    srand(time(0));

    for (int i = 0; i < filas; ++i) {
        for (int j = 0; j < columnas; ++j) {
            char caracter = 'a' + rand() % rango;
            sopaDeLetras[i][j] = caracter;
        }
    }

    return sopaDeLetras;
}

int main() {
    const int filas = 8;
    const int columnas = 8;
    const int rango = 26;

    vector<vector<char>> sopa = generarSopa(filas, columnas, rango);


    for (const auto& fila : sopa) {
        for (char c : fila) {
            cout << c;
        }
        cout << '\n';
    }

    return 0;
}