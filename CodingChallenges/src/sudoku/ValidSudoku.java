package sudoku;

import java.util.HashSet;

public class ValidSudoku {
	
    public boolean isValidSudoku(char[][] board) {

        // No repeats
        HashSet<String> checked = new HashSet();
        
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                char currVal = board[row][col];
                // Skips empties
                if(currVal != '.') {
                    // checking for dups, returns false if element was 
                    // passed through before, negate using !
                    if(!checked.add(currVal + "in row" + row) ||
                       !checked.add(currVal + "in column" + col) ||
                       !checked.add(currVal + "in subbox" + row/3 + "-" + col/3))
                        return false;
                }
            }
        } return true;
    }

}
