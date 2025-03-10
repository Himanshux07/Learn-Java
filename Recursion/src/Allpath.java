import java.util.Arrays;
public class Allpath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        allpath(0,0,board,"");

        int[][] path = new int[board.length][board[0].length];

        allPathPrint("",board,0,0,path,1);

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

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
