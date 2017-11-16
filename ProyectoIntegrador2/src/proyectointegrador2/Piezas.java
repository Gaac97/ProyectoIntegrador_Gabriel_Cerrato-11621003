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
public  abstract class Piezas implements Movimientos {

  protected int ff = 0;
    protected int fc = 0;
    protected String mensaje = "";

    public Piezas() {
    }
    
  
    
    //Verifica si la celda esta vacia
    private boolean VerificarC(int nuevaF, int newColumn, int[][] playerMatrix) {
        
        if (playerMatrix[nuevaF][newColumn] != 0) {//Si no esta vacia
            
            mensaje = "La pieeza esta bloqueando el camino";
            return false;
            
        }
        
        return true;
        
    }
    
    protected boolean axisMove(int startRow, int empiezaC, int dr, int dc, int[][] playerMatrix, boolean straightAxis) {
        
        if (straightAxis) {//Si se mueve en forma recta (torre , reina)
            
            if (( empiezaC== dc) && (startRow != dr)) {
                
                if (dr < startRow) {//Moverse norte
                    
                    for (int newRow = (startRow - 1); newRow > dr; newRow--) {
                        
                        if (!VerificarC(newRow, dc, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    
                    for (int newRow = (startRow + 1); newRow < dr; newRow++) {
                        
                        if (!VerificarC(newRow, dc, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                }
                
            } else if ((startRow == dr) && (empiezaC != dc)) {
                
                if (dc < empiezaC) {
                    
                    for (int newColumn = (empiezaC - 1); newColumn > dc; newColumn--) {
                        
                        if (!VerificarC(dr, newColumn, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    
                    for (int newColumn = (empiezaC + 1); newColumn < dc; newColumn++) {
                        
                        if (!VerificarC(dr, newColumn, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                }
                
            } else {
                
                mensaje = " //Error";
                return false;
                
            }
            
        } else //Moverse en diagonal (alfil, reina)
        {
            
            mensaje = "El destino es esta la misma diagonal";
            int newColumn = 0;
            
            if (dr < startRow && dc < empiezaC) {
                
                if ((dr - startRow) == (dc - empiezaC)) {
                    
                    for (int newRow = (startRow - 1); newRow > dr; newRow--) {
                        
                        newColumn = empiezaC - (startRow - newRow);
                        
                        if (!VerificarC(newRow, newColumn, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else if (dr < startRow && dc > empiezaC) //si se mueve NE
            {
                
                if ((dr - startRow) == (empiezaC- dc)) {
                    
                    for (int newRow = (startRow - 1); newRow > dr; newRow--) {
                        
                        newColumn = empiezaC + (startRow - newRow);
                        
                        if (!VerificarC(newRow, newColumn, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else if (dr > startRow && dc < empiezaC) //si se mueve SW
            {
                
                if ((startRow - dr) == (dc - empiezaC)) {
                    
                    for (int newRow = (startRow + 1); newRow < dr; newRow++) {
                        
                        newColumn = empiezaC - (newRow - startRow);
                        
                        if (!VerificarC(newRow, newColumn, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else if (dr > startRow && dc > empiezaC) //si se mueve SE
            {
                
                if ((startRow - dr) == (empiezaC - dc)) {
                    
                    for (int newRow = (startRow + 1); newRow < dr; newRow++) {
                        
                        newColumn = empiezaC + (newRow - startRow);
                        
                        if (!VerificarC(newRow, newColumn, playerMatrix)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else 
            {
                
            
                return false;
                
            }
            
        }
        
        ff = dr;
        fc= dc;
        
        return true;
        
    }

    public int getFf() {
        return ff;
    }

    public void setFf(int ff) {
        this.ff = ff;
    }

    public int getFc() {
        return fc;
    }

    public void setFc(int fc) {
        this.fc = fc;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
  

  
    
    
}
