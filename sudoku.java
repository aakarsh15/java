public class sudoku {
    public boolean isSafe(char [][] board, int row, int col, int number){
        for ( int i = 0; i < board.length; i++){
            if ( board [i][col] )
        }
    }
    public boolean helper( char [][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col + 1;

        }
        else{
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;

            }
            else{
                for( int i = 1 ; i <= 9; i++){
                    if(isSafe(board, row, col, i){
                        board[row][col]  = (char)(i+0);
                        if(helper(board, nrow, ncol)){
                            return true;

                        }
                        else{
                            board[row][col] = '.';

                        }
                    }
                }
            }
            return false;

        }
 
    }

}
