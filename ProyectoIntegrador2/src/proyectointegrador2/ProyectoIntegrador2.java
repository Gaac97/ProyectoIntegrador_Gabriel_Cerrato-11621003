/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Alvarado
 */
public class ProyectoIntegrador2 {

    static int cont = 0;

    public static void main(String[] args) {
        Torres t = new Torres();
        Dama d = new Dama();
        Caballos ca = new Caballos();
        Rey r = new Rey();
        Peones p = new Peones();
        Alfiles a = new Alfiles();
        boolean move = false;
        int turno;
        int cont = 0;
        boolean turn = false;
        boolean finish = false;
        String player1;
        String player2;
        boolean s = false;
        Piezas m[][] = new Piezas[8][8];

        LlenarTablero(m);

        player1 = JOptionPane.showInputDialog("Ingrese el nombre del primer jugador");
        player2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador");

        while (finish == false) {
            System.out.println("\n");
            PrintMatriz(m, 0, 0);
            if (cont % 2 == 0) {

                JOptionPane.showMessageDialog(null, "Turno de los Blancos:" + " " + player1);

                int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x"));
                int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y"));
                int dr = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                int dc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                try {
                    validar(m, f, c);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    validar(m, dr, dc);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                if (m[f][c] instanceof Torres) {
                    if (t.movimiento(f, c, dc, dr, m, s) == false && t.movimientoX(f, dc, dr, dc, m, move) == false) {
                        if (t.VerificarC(dr, dc, m) == true) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Torres();
                        }
                    }
                } else if (m[f][c] instanceof Caballos) {
                    if (ca.movimiento(f, c, dc, dr, m, s) == false && ca.movimientoX(f, dc, dr, dc, m, move) == false) {

                        if (ca.VerificarC(dr, dc, m) == true) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Caballos();
                        }
                    }
                } else if (m[f][c] instanceof Alfiles) {
                    if (a.movimiento(f, c, dc, dr, m, s) == false && a.movimientoX(f, dc, dr, dc, m, move) == false) {

                        m[f][c] = new Vacio();
                        m[dr][dc] = new Alfiles();

                    }
                } else if (m[f][c] instanceof Peones) {
                    if (p.movimiento(f, c, dc, dr, m, s) == false && p.movimientoX(f, dc, dr, dc, m, move) == false) {
                        if (p.VerificarC(dr, dc, m) == false) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Peones();
                        }
                    }
                } else if (m[f][c] instanceof Dama) {
                    if (d.movimiento(f, c, dc, dr, m, s) == true && d.movimientoX(f, dc, dr, dc, m, move) == false) {
                        if (d.VerificarC(dr, dc, m) == false) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Dama();
                        }

                    }
                } else if (m[f][c] instanceof Rey) {
                    if (r.movimiento(f, c, dc, dr, m, s) == false && r.movimientoX(f, dc, dr, dc, m, move) == true) {
                        if (r.VerificarC(dr, dc, m) == false) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Rey();
                        }
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna pieza");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Turno de los negros:" + " " + player2);
                System.out.println("\n");

                int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x"));
                int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y"));
                int dr = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                int dc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                try {
                    validar(m, f, c);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    validar(m, dr, dc);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (m[f][c] instanceof Torres) {
                    if (t.movimiento(f, c, dc, dr, m, s)==false&&t.movimientoX(f, dc, dr, dc, m, move) == false) {
                        if (t.VerificarC(dr, dc, m) == true) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Torres();
                        } else if (t.movimientoX(f, dc, dr, dc, m, move) == true) {
                            if (t.VerificarC(dr, dc, m) == true) {
                                m[f][c] = new Vacio();
                                m[dr][dc] = new Torres();
                            }
                        }

                    }
                } else if (m[f][c] instanceof Caballos) {
                    if (ca.movimiento(f, c, dc, dr, m, s) == false && ca.movimientoX(f, dc, dr, dc, m, move) == false) {

                        if (ca.VerificarC(dr, dc, m) == true) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Caballos();
                        }
                    }
                } else if (m[f][c] instanceof Alfiles) {
                    if (a.movimiento(f, c, dc, dr, m, s) == false && a.movimientoX(f, dc, dr, dc, m, move) == false) {

                        m[f][c] = new Vacio();
                        m[dr][dc] = new Alfiles();

                    }
                } else if (m[f][c] instanceof Peones) {
                    if (p.movimiento(f, c, dc, dr, m, s) == false && p.movimientoX(f, dc, dr, dc, m, move) == false) {
                        if (p.VerificarC(dr, dc, m) == false) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Peones();
                        }
                    }
                } else if (m[f][c] instanceof Dama) {
                 if (t.movimientoX(f, dc, dr, dc, m, move) == false) {
                        if (t.VerificarC(dr, dc, m) == true) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Dama();
                        } else if (t.movimientoX(f, dc, dr, dc, m, move) == true) {
                            if (t.VerificarC(dr, dc, m) == true) {
                                m[f][c] = new Vacio();
                                m[dr][dc] = new Dama();
                            }
                        }

                    }
                } else if (m[f][c] instanceof Rey) {
                    if (r.movimiento(f, c, dc, dr, m, s) == false && r.movimientoX(f, dc, dr, dc, m, move) == true) {
                        if (r.VerificarC(dr, dc, m) == false) {
                            m[f][c] = new Vacio();
                            m[dr][dc] = new Rey();
                        }
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna pieza");
                }
            }

        }

    }

    public static void LlenarTablero(Piezas m[][]) {
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

    public static void validar(Piezas matriz[][], int x, int y) throws MiException {
        int limit = matriz.length - 1;
        int limit2 = matriz[0].length - 1;
        if (x > limit || y > limit2) {
            throw new MiException("Se salio del limite");
        }
    }

    public boolean comer(int f, int c, int dr, int dc, Piezas m[][]) {
        if (m[f][c] instanceof Caballos) {
            if (m[dr][dc] instanceof Peones || m[dr][dc] instanceof Alfiles || m[dr][dc] instanceof Dama || m[dr][dc] instanceof Caballos || m[dr][dc] instanceof Rey) {
                m[dr][dc] = new Vacio();
                m[dr][dc] = new Caballos();
                return true;

            } else {
                return false;
            }

        }
        return false;
    }
}
