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
public class ProyectoIntegrador2 {

    static int cont=0;
    
    public static void main(String[] args) {
    int turno;
        int cont = 0;
        boolean turn = false;
        boolean finish = false;
        String player1;
        String player2;
        Piezas m[][] = new Piezas[8][8];
    }
    
    
    
    public static void LlenarTablero(Piezas m[][])
    {
        Rey r = new Rey();
        Dama d = new Dama();
        Alfiles a = new Alfiles();
        Caballos c = new Caballos();
        Torres t = new Torres();
        Peones p = new Peones();
        
        m[0][0] = new Torres();
        m[0][1] = new Caballos();
        m[0][2] = new Alfiles();
        m[0][3] = new Dama();
        m[0][4] = new Rey();
        m[0][5] = new Alfiles();
        m[0][6] = new Caballos();
        m[0][7] = new Torres();
        
        m[1][0] = new Peones();
        m[1][1] = new Peones();
        m[1][2] = new Peones();
        m[1][3] = new Peones();
        m[1][4] = new Peones();
        m[1][5] = new Peones();
        m[1][6] = new Peones();
        m[1][7] = new Peones();
        
        
        m[2][0] = new Vacio();
        m[2][1] = new Vacio();
        m[2][2] = new Vacio();
        m[2][3] = new Vacio();
        m[2][4] = new Vacio();
        m[2][5] = new Vacio();
        m[2][6] = new Vacio();
        m[2][7] = new Vacio();
        
        
        m[3][0] = new Vacio();
        m[3][1] = new Vacio();
        m[3][2] = new Vacio();
        m[3][3] = new Vacio();
        m[3][4] = new Vacio();
        m[3][5] = new Vacio();
        m[3][6] = new Vacio();
        m[3][7] = new Vacio();
        
        
        m[4][0] = new Vacio();
        m[4][1] = new Vacio();
        m[4][2] = new Vacio();
        m[4][3] = new Vacio();
        m[4][4] = new Vacio();
        m[4][5] = new Vacio();
        m[4][6] = new Vacio();
        m[4][7] = new Vacio();
        
        m[5][0] = new Vacio();
        m[5][1] = new Vacio();
        m[5][2] = new Vacio();
        m[5][3] = new Vacio();
        m[5][4] = new Vacio();
        m[5][5] = new Vacio();
        m[5][6] = new Vacio();
        m[5][7] = new Vacio();
        
        m[6][0] = new Peones();
        m[6][1] = new Peones();
        m[6][2] = new Peones();
        m[6][3] = new Peones();
        m[6][4] = new Peones();
        m[6][5] = new Peones();
        m[6][6] = new Peones();
        m[6][7] = new Peones();
        
         
        m[7][0] = new Torres();
        m[7][1] = new Caballos();
        m[7][2] = new Alfiles();
        m[7][3] = new Dama();
        m[7][4] = new Rey();
        m[7][5] = new Alfiles();
        m[7][6] = new Caballos();
        m[7][7] = new Torres();
        
        
    }
    
    public static void PrintMatriz(Piezas x[][], int f, int c) {
        if (f == x.length - 1 && c == x.length - 1) {
            System.out.print(x[f][c] + "");
        } else {
            if (c == x[0].length - 1) {
                System.out.println("[" + x[f][c] + "]" + "\t");
                PrintMatriz(x, f + 1, 0);
            } else {
                System.out.print("[" + x[f][c] + "]" + "\t");

                PrintMatriz(x, f, c + 1);
            }

        }

    }
    
}
