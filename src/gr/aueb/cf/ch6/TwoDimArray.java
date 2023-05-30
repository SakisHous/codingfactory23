package gr.aueb.cf.ch6;

public class TwoDimArray {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];

        grid[0][0] = 1;
        grid[0][1] = 0;
        grid[1][0] = 0;
        grid[1][1] = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
