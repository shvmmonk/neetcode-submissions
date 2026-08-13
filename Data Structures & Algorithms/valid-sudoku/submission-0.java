class Solution {
    public boolean isValidSudoku(char[][] board) {

        // First of all we will check the rows
        for(int i = 0; i < 9; i++) {

            HashSet<Character> set = new HashSet<>();

            for(int j = 0; j < 9; j++) {

                if(board[i][j] != '.') {

                    if(set.contains(board[i][j])) {
                        return false;
                    }

                    set.add(board[i][j]);
                }
            }
        }


        // Then we will check all the columns
        for(int j = 0; j < 9; j++) {

            HashSet<Character> set = new HashSet<>();

            for(int i = 0; i < 9; i++) {

                if(board[i][j] != '.') {

                    if(set.contains(board[i][j])) {
                        return false;
                    }

                    set.add(board[i][j]);
                }
            }
        }


        // Let's check for the 3x3 boxes
        for(int row = 0; row < 9; row += 3) {

            for(int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for(int i = row; i < row + 3; i++) {

                    for(int j = col; j < col + 3; j++) {

                        if(board[i][j] != '.') {

                            if(set.contains(board[i][j])) {
                                return false;
                            }

                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}