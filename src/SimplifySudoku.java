/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHAN ROY
 */
public class SimplifySudoku {
    public int model[][];
    public void createModel(int sudoku[][]) {
        model = new int[9][9] ;
        for( int row = 0; row < 9; row++ )
            for( int col = 0; col < 9; col++ )
                model[row][col] = sudoku[row][col] ;
    }
    protected boolean checkRow( int row, int num ) {
        for( int col = 0; col < 9; col++ )
            if( model[row][col] == num )
               return false ;
        return true ;
    }
    protected boolean checkCol( int col, int num ) {
        for( int row = 0; row < 9; row++ )
            if( model[row][col] == num )
               return false ;
        return true ;
    }
    protected boolean checkBox( int row, int col, int num ) {
        row = (row / 3) * 3 ;
        col = (col / 3) * 3 ;
        for( int r = 0; r < 3; r++ )
            for( int c = 0; c < 3; c++ )
            if( model[row+r][col+c] == num )
               return false ;
        return true ;
    }
    public void solve( int row, int col ) throws Exception {
        if( row > 8 )
           throw new Exception( "Solution found" ) ;
        if( model[row][col] != 0 )
           next( row, col ) ;
        else {
            for( int num = 1; num < 10; num++ )
            {
                if( checkRow(row,num) && checkCol(col,num) && checkBox(row,col,num) )
                {
                   model[row][col] = num ;
                   next( row, col ) ;
                }
            }
           model[row][col] = 0 ;
        }
    }
    public void next( int row, int col ) throws Exception {
        if( col < 8 )
           solve( row, col + 1 ) ;
        else
           solve( row + 1, 0 ) ;
    }
}
