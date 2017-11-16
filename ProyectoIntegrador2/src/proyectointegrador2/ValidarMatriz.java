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
public class ValidarMatriz {
    private int[][] playerMatrix = new int[8][8];//0 vacio, 1 jugador 1, 2 jugador 2
    private int[][] pieceMatrix = new int[8][8];//0 peon, 1 torre, 2 caballo, 3 alfil, 4 reina, 5 rey, 6 empty
    
    public void objCellMatrix() {
    }
    
    public void resetearMatriz() {
        
        for (int row = 0; row < 8; row++) {
            
            for (int column = 0; column < 8; column++) {
                
                if (row <= 1) {
                    
                    playerMatrix[row][column] = 2;
                    
                    if (row == 1) {
                        pieceMatrix[row][column] = 0;
                    }
                    
                } else if (row >= 2 && row <= 5) {
                    
                    playerMatrix[row][column] = 0;
                    pieceMatrix[row][column] = 6;
                    
                } else {
                    
                    playerMatrix[row][column] = 1;
                    
                    if (row == 6) {
                        pieceMatrix[row][column] = 0;
                    }
                    
                }
                
                if (row == 0 || row == 7) {
                    
                    if (column < 5) {
                        pieceMatrix[row][column] = (column + 1);
                    } else {
                        pieceMatrix[row][column] = (8 - column);
                    }
                    
                }
                
            }
            
        }
        
    }
    
    public int getPlayerCell(int row, int column) {
        return playerMatrix[row][column];
    }
    
    public int getPieceCell(int row, int column) {
        return pieceMatrix[row][column];
    }
    
    public void setPlayerCell(int row, int column, int player) {
        playerMatrix[row][column] = player;
    }
    
    public void setPieceCell(int row, int column, int piece) {
        pieceMatrix[row][column] = piece;
    }
    
    public int[][] getPlayerMatrix() {
        return playerMatrix;
    }
    
    public int[][] getPieceMatrix() {
        return pieceMatrix;
    }
    
    public boolean Ganar(int CP) {
        
        int checkPlayer = 0;
        
        if (CP == 1) {
            checkPlayer = 2;
        } else {
            checkPlayer = 1;
        }
        
        for (int row = 0; row < 8; row++) {
            
            for (int column = 0; column < 8; column++) {
                
                if (playerMatrix[row][column] == checkPlayer && pieceMatrix[row][column] == 5) {//Si el rey del enemigo todav�a se queda
                    return false;
                }
                
            }
            
        }
        
        return true;
        
    }
    
}
