/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador2;

/**
 *
 * @author Gabriel Alvarado
 */
public class Peones extends Piezas {

    int cont = 0;

    @Override
    public String toString() {
        return "♟";
    }

    @Override
    public int movimiento(String forma, int x, int y, Piezas[][] m, int a, int b) {
        cont = 0;
        if (cont == 0) {
            if (a - b == a) {
                return 1;
            } else {
                return 2;
            }
        } else {
            return 2;
        }
    }

    @Override
    public int comer(int x, int y, Piezas[][] m, int a, int b) {
        int suma = a + b;
        int resta = a - b;
        int d = (a - 1) + b + 1;
        int q = (a - 1) + b;
        boolean evaluar = true;
        if (cont == 0) {
            if (q == suma) {
                if ((a - 1) + (b + 1) == d) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                return 2;
            }
        } else {
            return 2;
        }

    }
}
