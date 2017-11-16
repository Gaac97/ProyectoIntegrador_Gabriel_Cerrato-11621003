/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador2;

import java.util.logging.Logger;

/**
 *
 * @author Gabriel Alvarado
 */
public class Caballos extends Piezas{

    @Override
    public String toString() {
        return "♞";
    }

    @Override
    public boolean movimiento(int f, int c, int dc, int dr, Piezas[][] m) {
    ff = dr;
        fc = dc;
        mensaje = "Caballo sole se puede mover en L";
        
        if (dr == (f - 2) && dc == (c - 1)) //2N, 1E
        {
            return true;
        } else if (dr == (f - 2) && dc == (f + 1)) //2N, 1W
        {
            return true;
        } else if (dr == (f + 2) && dc == (c - 1)) //2S, 1E
        {
            return true;
        } else if (dr == (f + 2) && dc == (f + 1)) //2S, 1W
        {
            return true;
        } else if (dr == (f- 1) && dc == (f- 2)) //1N, 2E
        {
            return true;
        } else if (dr == (f - 1) && dc == (c + 2)) //1N, 2W
        {
            return true;
        } else if (dr == (f + 1) && dc == (f - 2)) //1S, 2E
        {
            return true;
        } else if (dr == (f + 1) && dc == (c + 2)) //1S, 2W
        {
            return true;
        }
        
        return false;
        
    }
    

    @Override
    public boolean comer(int f, int c, int dc, int dr, Piezas[][] m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
  
    
}
