import java.util.Arrays;

public class Maze {
    static void maze(String p, int row, int col) {
        if (row == 2 && col == 2) {
            System.out.println(p);
            return;
        }

        if (row < 2) {
            maze(p + 'D', row + 1, col);
        }
        if (col < 2) {
            maze(p + 'R', row, col + 1);
        }
    }

    static void mazeDiagonal(String p, int row, int col) {
        if (row == 2 && col == 2) {
            System.out.println(p);
            return;
        }
        if (row < 2 && col < 2) {
            mazeDiagonal(p + 'D', row + 1, col + 1);
        }

        if (row < 2) {
            mazeDiagonal(p + 'H', row + 1, col);
        }
        if (col < 2) {
            mazeDiagonal(p + 'V', row, col + 1);
        }
    }

    static void mazeObstacle(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            mazeObstacle(p + 'H', maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            mazeObstacle(p + 'V', maze, row, col + 1);
        }
    }

    static int countMaze(int row, int col) {
        if (row == 2 && col == 2) {

            return 1;
        }

        int left = 0;
        int right = 0;
        if (row < 2) {
            left = countMaze(row + 1, col);
        }
        if (col < 2) {
            right = countMaze(row, col + 1);
        }
        return left + right;
    }

    static void mazeAllPaths(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.print(p+" ");
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;

        if (row > 0) {
            mazeAllPaths(p + 'U', maze, row - 1, col);
        }
        if (col > 0) {
            mazeAllPaths(p + 'L', maze, row, col - 1);
        }
        if (row < maze.length - 1) {
            mazeAllPaths(p + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            mazeAllPaths(p + 'R', maze, row, col + 1);
        }
        maze[row][col] = true;
    }
    static void mazeMatrix(String p, boolean[][] maze, int row, int col,int[][] path , int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

           
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        path[row][col]=step;

        if (row > 0) {
            mazeMatrix(p + 'U', maze, row - 1, col,path,step+1);
        }
        if (col > 0) {
            mazeMatrix(p + 'L', maze, row, col - 1,path,step+1);
        }
        if (row < maze.length - 1) {
            mazeMatrix(p + 'D', maze, row + 1, col,path,step+1);
        }
        if (col < maze[0].length - 1) {
            mazeMatrix(p + 'R', maze, row, col + 1,path,step+1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }

    public static void main(String[] args) {
        // mazeDiagonal("",0, 0);
        // mazeObstacle("",0, 0);
        boolean[][] maze = {
            //      0     1     2    
                { true, true, true },// 0
                { true, true, true },// 1
                { true, true, true },// 2

        };
        // mazeObstacle("", maze, 0, 0);
        int[][] path=new int[maze.length][maze[0].length];
        mazeMatrix("", maze, 0, 0,path,0);

    }
}
