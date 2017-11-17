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
public class Rey extends Piezas {

    @Override
    public String toString() {
        return "♔";
    }

    @Override
    public boolean movimiento(int f, int c, int dc, int dr, Piezas[][] m,boolean s) {
        ff = dr;
        fc = dc;

        if (dr == (f + 1) && dc == f) //S
        {
            return true;
        } else if (dr == (f + 1) && dc == (f - 1)) //SW
        {
            return true;
        } else if (dr == f && dc == f - 1) //W
        {
            return true;
        } else if (dr == (f - 1) && dc == (f - 1)) //NW
        {
            return true;
        } else if (dr == (f - 1) && dc == f) //N
        {
            return true;
        } else if (dr == (f - 1) && dc == (c + 1)) //NE
        {
            return true;
        } else if (dr == f && dc == (f + 1)) //E
        {
            return true;
        } else if (dr == (f + 1) && dc == (c + 1)) //SE
        {
            return true;
        } else {

            mensaje = "Rey solo se puede mover un espacio en diferente direcciones";
            return false;

        }
    }

    @Override
    public boolean comer(int f, int c, int dc, int dr, Piezas[][] m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
