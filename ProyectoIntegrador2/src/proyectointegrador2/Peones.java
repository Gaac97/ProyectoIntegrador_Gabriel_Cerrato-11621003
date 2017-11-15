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
public class Peones extends Piezas{

    @Override
    public String toString() {
        return "♟";
    }

    @Override
    public boolean movimiento(String forma, int x, int y, Piezas[][] m, int a, int b) {
       int cont=0;
        if (cont==0) {
            return true;
            
        }else{
            return false;
        }
        
       
        
    
    }

    @Override
    public boolean comer(int x, int y, Piezas[][] m, int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
