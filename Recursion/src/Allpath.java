public class Allpath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allpath(0,0,board,"");

    }

    static void allpath(int r, int c, boolean[][] board, String process) {

        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(process);
            return;
        }

        if (!board[r][c])
            return;

        board[r][c] = false;

        if (r < board.length - 1)
            allpath(r + 1, c, board, process + "Down ");

        if (c < board[0].length - 1)
            allpath(r, c + 1, board, process + "Right ");

        if (r > 0)
            allpath(r - 1, c, board, process + "Up ");

        if (c > 0)
            allpath(r, c - 1, board, process + "Left ");

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function

        board[r][c] = true;
    }

}
