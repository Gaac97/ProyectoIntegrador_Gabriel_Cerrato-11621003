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
public class Dama extends Piezas {

    @Override
    public String toString() {
        return "♕";
    }

    @Override
    public boolean movimiento(int f, int c, int dc, int dr, Piezas[][] m, boolean s) {

        if (f == dr ^ c == dc) {
            return true;

        } else if (f != dr && c != dc) {
            return true;
        } else {

            mensaje = "Reina se puede mover en cualquier direccion";

            return false;

        }

    }

    @Override
    public boolean comer(int f, int c, int dc, int dr, Piezas[][] m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
