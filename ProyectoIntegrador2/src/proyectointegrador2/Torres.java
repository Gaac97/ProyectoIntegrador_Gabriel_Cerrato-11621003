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
public class Torres extends Piezas{

    @Override
    public String toString() {
        return "♜";
    }

    @Override
    public boolean movimiento(int f, int c, int dc, int dr, Piezas[][] m) {
     if (f != dr && c != dc) //Si se mueve en diagonal
        {
            
            mensaje = "Torre solo se puede mover en horinzotal o vertical";
            return false;
            
        }
       //La reina comparte el mismo movimiento como  un alfil o una torre, para eso se valida el movimiento como 
        
        return movimiento(f, c, dc, dr, m);
        
    }

    @Override
    public boolean comer(int f, int c, int dc, int dr, Piezas[][] m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


   
    

