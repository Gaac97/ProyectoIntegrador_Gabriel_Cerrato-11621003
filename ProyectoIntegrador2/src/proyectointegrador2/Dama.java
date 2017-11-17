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
     Dama d = new Dama();

        if (d.movimientoX(f, c, dr, dc, m, true) == false) {
            for (int i = f; i < dr; i--) {
                if (m[i][dc] instanceof Caballos||m[i][dc]instanceof Torres||m[dr][dc]instanceof Rey||m[i][dc]instanceof Dama||m[i][dc]instanceof Alfiles||m[i][dc]instanceof Peones) {
                   m[dr][dc] = new Vacio();
                   return true;
                }
                
            }
        }else if (d.movimientoX(f, c, dr, dc, m, true)==true) {
            int mitad = dr/dc+2;
            for (int i = c; i < dc; i--) {
                if (m[c][i] instanceof Caballos||m[c][i]instanceof Torres||m[c][i]instanceof Rey||m[c][i]instanceof Dama||m[c][i]instanceof Alfiles||m[c][i]instanceof Peones) {
                   m[dr][dc] = new Vacio();
                   return true;
                }
              
                if (m[c][i] instanceof Rey) {
                    m[dr][dc] = new Vacio();
                    mensaje = "Jaque";
                }
                
            }
        }

        mensaje = "Torre solo se puede mover en horinzontal o vertical";
        return false;
    }

}
