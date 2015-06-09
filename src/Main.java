import java.util.Scanner;
public class Main {

    public void nextGeneration(int grid[][],int grid_length)
    {
        int lives_count=0;
        for(int i=0;i<grid_length;i++)
        {
            for(int j=0;j<grid_length;j++) {
                //vertical
                if (grid[i-1][j]==1)
                {
                    lives_count++;
                }
                if (grid[i+1][j]==1)
                {
                    lives_count++;
                }
                //diagonal
                if (grid[i-1][j-1]==1)
                {
                    lives_count++;
                }
                if (grid[i+1][j-1]==1)
                {
                    lives_count++;
                }
                if (grid[i-1][j+1]==1)
                {
                    lives_count++;
                }
                if (grid[i+1][j+1]==1)
                {
                    lives_count++;
                }
                //horizontal
                if (grid[i][j-1]==1)
                {
                    lives_count++;
                }
                if (grid[i][j+1]==1)
                {
                    lives_count++;
                }

            }
        }

    }

    public static void main(String[] args) {
        int grid_length;

        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter the grid lenght\n");
        grid_length = myInput.nextInt();


        Scanner input = new Scanner(System.in);
        int[][] grid = new int[5][5];
        System.out.println("Enter the grid \n");
        for (int i = 0; i < grid_length; i++)
        {
            for(int j=0;j<grid_length;j++)
                grid[i][j] = input.nextInt();
        }
        Main mn=new Main();
        mn.nextGeneration(grid,grid_length);



    }
}
