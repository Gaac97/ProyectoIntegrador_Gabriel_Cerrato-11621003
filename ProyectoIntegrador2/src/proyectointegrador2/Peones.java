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
    public boolean movimiento(int f, int c, int dc, int dr, Piezas[][] m,boolean s) {
       cont = 0;
        if (cont == 0) {
            if (f - c == dc) {
                return true;
            } else {
                return  false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean comer(int f, int c, int dc, int dr, Piezas[][] m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   
   

