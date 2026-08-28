public class Sudoko {
    private static final int N = 9; // size of the board

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] == 0) { // empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = 0; // backtrack
                            }
                        }
                    }
                    return false; // no valid number found
                }
            }
        }
        return true; // solved
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // Row check
        for (int x = 0; x < N; x++) {
            if (board[row][x] == num) return false;
        }

        // Column check
        for (int x = 0; x < N; x++) {
            if (board[x][col] == num) return false;
        }

        // 3x3 box check
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) return false;
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}



