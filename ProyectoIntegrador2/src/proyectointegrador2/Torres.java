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
public class Torres extends Piezas {

    @Override
    public String toString() {
        return "♜";
    }

    @Override
    public boolean movimiento(int f, int c, int dc, int dr, Piezas[][] m, boolean s) {
        if (f != dr && c != dc) //Si se mueve en diagonal
        {

            mensaje = "Torre solo se puede mover en horinzontal o vertical";
            return false;

        }
       //La reina comparte el mismo movimiento como  un alfil o una torre, para eso se valida el movimiento como 

        return movimiento(f, c, dc, dr, m, s);

    }

    @Override
    public boolean comer(int f, int c, int dc, int dr, Piezas[][] m) {
        Torres t = new Torres();

        if (t.movimientoX(f, c, dr, dc, m, true) == false) {
            for (int i = f; i < dr; i--) {
                if (m[i][dc] instanceof Caballos||m[i][dc]instanceof Torres||m[dr][dc]instanceof Rey||m[i][dc]instanceof Dama||m[i][dc]instanceof Alfiles||m[i][dc]instanceof Peones) {
                   m[dr][dc] = new Vacio();
                   return true;
                }
                
            }
        }else if (t.movimientoX(f, c, dr, dc, m, true)==true) {
            for (int i = c; i < dc; i--) {
                if (m[c][i] instanceof Caballos||m[c][i]instanceof Torres||m[c][i]instanceof Rey||m[c][i]instanceof Dama||m[c][i]instanceof Alfiles||m[c][i]instanceof Peones) {
                   m[dr][dc] = new Vacio();
                   return true;
                }
                
            }
        }

        mensaje = "Torre solo se puede mover en horinzontal o vertical";
        return false;

       //La reina comparte el mismo movimiento como  un alfil o una torre, para eso se valida el movimiento como 
    }
}
