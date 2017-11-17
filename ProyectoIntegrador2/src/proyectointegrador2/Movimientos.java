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
public interface Movimientos {
  public boolean movimiento(int f,int c, int dc, int dr, Piezas m[][],boolean axis);
    public boolean comer(int f,int c, int dc, int dr, Piezas m[][]);    
}
