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
public class Sudoku {
    /METODO PARA COMPROBAR FILAS.
    int fila;
    int numero;
    public boolean chequeaSudoku(int [] [] matriz){ 
       boolean resultado;
   for ( int i = 0; i < matriz.length; i ++ )
   if ( matriz[(fila-1)][i] == numero ){
     resultado = true;
     break;
    }
   //METODO PARA COMPROBAR COLUMNAS.
 public static boolean existe_columna( int numero, int columna, int[][] matriz ){
   
  boolean resultado = false;
   
  for ( int i = 0; i < matriz.length; i ++ )
   if ( matriz[i][(columna-1)] == numero ){
     resultado = true;
     break;
   }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(new Sudoku().chequeaSudoku(matriz)));
    }
    
}
