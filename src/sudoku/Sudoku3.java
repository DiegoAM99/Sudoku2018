/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author xp
 */
public class Sudoku3 {
        public static final int DIMENSION = 9; // constante

    public void imprimir(int[][] tablero) {
        for (int i = 0; i < DIMENSION; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            for (int j = 0; j < DIMENSION; j++) {
                if (j % 3 == 0) {
                    System.out.print(" ");
                }
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public boolean resolver(int[][] tablero) {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (tablero[i][j] != 0) {
                    continue;
                }
                for (int k = 1; k <= 9; k++) {
                    if (esPosibleInsertar(tablero, i, j, k)) {
                        tablero[i][j] = k;
                        boolean b = resolver(tablero);
                        if (b) {
                            return true;
                        }
                        tablero[i][j] = 0;
                    }
                }
                return false;
            }
        }
        System.out.println("Encontrada solución:");
        imprimir(tablero);
        return true;
    }

    public boolean esPosibleInsertar(int[][] tablero, int i, int j, int valor) {
//Comprueba columna
        for (int a = 0; a < DIMENSION; a++) {
            if (a != i && tablero[a][j] == valor) {
                return false;
            }
        }
//Comprueba fila
        for (int a = 0; a < DIMENSION; a++) {
            if (a != j && tablero[i][a] == valor) {
                return false;
            }
        }
//Comprueba cuadardo
        int y = (i / 3) * 3;
        int x = (j / 3) * 3;
        for (int a = 0; a < DIMENSION / 3; a++) {
            for (int b = 0; b < DIMENSION / 3; b++) {
                if (a != i && b != j && tablero[y + a][x + b] == valor) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] generarSudoku() {

        int[][] sudoku = new int[9][9];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[1].length; j++) {
                int ale = (int) (Math.random() * 10);
                if (ale == 5) {
                    sudoku[i][j] = (int) (Math.random() * 9) + 1;
                } else {
                    sudoku[i][j] = 0;
                }
            }

        }
        return sudoku;
    }

    public static void main(String[] args) {
        Sudoku3 miSudoku = new Sudoku3();

        System.out.println("Sudoku generado");
        int[][] sudoku = miSudoku.generarSudoku();
        miSudoku.imprimir(sudoku);
        System.out.println("Aveces puede demorar por el algoritmo entre 3-15 min");
        if (!miSudoku.resolver(sudoku)) {
            System.out.println("El Sudoku notiene solución");
        }
    }
}
