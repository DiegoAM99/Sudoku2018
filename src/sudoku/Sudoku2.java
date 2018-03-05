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
public class Sudoku2 {
    public static boolean existe_fila( int numero, int fila, int[][] matriz ){
  for ( int i = 0; i < matriz.length; i ++ )
   if ( matriz[(fila-1)][i] == numero ){
     break;
   }
   public static boolean existe_columna( int numero, int columna, int[][] matriz ){
  for ( int i = 0; i < matriz.length; i ++ )
   if ( matriz[i][(columna-1)] == numero ){
     break;
   }
   }
}
