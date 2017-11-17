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
    protected boolean VerificarC(int dr, int dc, Piezas m[][]) {
        
        if (!m[dr][dc].equals(null)) {//Si no esta vacia
            
            mensaje = "La pieeza esta bloqueando el camino";
            return false;
            
        }
        
        return true;
        
    }
    
    protected boolean movimientoX(int f, int empiezaC, int dr, int dc, Piezas m[][], boolean move) {
        
        if (move) {//Si se mueve en forma recta (torre , reina)
            
            if (( empiezaC== dc) && (f != dr)) {
                
                if (dr < f) {//Moverse norte
                    
                    for (int newRow = (f - 1); newRow > dr; newRow--) {
                        
                        if (!VerificarC(newRow, dc, m)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    
                    for (int newRow = (f + 1); newRow < dr; newRow++) {
                        
                        if (!VerificarC(newRow, dc, m)) {
                            return false;
                        }
                        
                    }
                    
                }
                
            } else if ((f == dr) && (empiezaC != dc)) {
                
                if (dc < empiezaC) {
                    
                    for (int newColumn = (empiezaC - 1); newColumn > dc; newColumn--) {
                        
                        if (!VerificarC(dr, newColumn, m)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    
                    for (int newColumn = (empiezaC + 1); newColumn < dc; newColumn++) {
                        
                        if (!VerificarC(dr, newColumn, m)) {
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
            
            if (dr < f && dc < empiezaC) {
                
                if ((dr - f) == (dc - empiezaC)) {
                    
                    for (int newRow = (f - 1); newRow > dr; newRow--) {
                        
                        newColumn = empiezaC - (f - newRow);
                        
                        if (!VerificarC(newRow, newColumn, m)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else if (dr <f && dc > empiezaC) //si se mueve NE
            {
                
                if ((dr - f) == (empiezaC- dc)) {
                    
                    for (int newRow = (f- 1); newRow > dr; newRow--) {
                        
                        newColumn = empiezaC + (f - newRow);
                        
                        if (!VerificarC(newRow, newColumn, m)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else if (dr > f && dc < empiezaC) //si se mueve SW
            {
                
                if ((f - dr) == (dc - empiezaC)) {
                    
                    for (int newRow = (f + 1); newRow < dr; newRow++) {
                        
                        newColumn = empiezaC - (newRow -f);
                        
                        if (!VerificarC(newRow, newColumn, m)) {
                            return false;
                        }
                        
                    }
                    
                } else {
                    return false;
                }
                
            } else if (dr > f && dc > empiezaC) //si se mueve SE
            {
                
                if ((f - dr) == (empiezaC - dc)) {
                    
                    for (int newRow = (f+ 1); newRow < dr; newRow++) {
                        
                        newColumn = empiezaC + (newRow - f);
                        
                        if (!VerificarC(newRow, newColumn, m)) {
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
