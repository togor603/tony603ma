package gameoflife;

import java.util.Scanner;

public class Gameoflife {
public static void main(String[] args) 
    { 
        int M = 12, N = 12; 
  
        // Intiliazing the grid. 
        int[][] gridOri = { 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 2, 2, 0, 2, 2, 2, 2, 0, 2, 2, 0 }, 
            { 0, 0, 2, 2, 1, 2, 0, 1, 0, 0, 2, 0 }, 
            { 0, 2, 2, 0, 0, 1, 2, 0, 0, 2, 0, 0 }, 
            { 0, 0, 1, 1, 2, 2, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0 }, 
            { 0, 1, 1, 0, 0, 1, 0, 0, 2, 0, 1, 0 }, 
            { 0, 2, 2, 1, 1, 2, 2, 1, 2, 2, 0, 0 }, 
            { 0, 2, 1, 1, 2, 1, 1, 0, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 2, 0 }, 
            { 0, 1, 1, 0, 1, 0, 0, 2, 0, 2, 2, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
        }; 
        
        System.out.print("Input the number of generations: ");
        Scanner kb = new Scanner(System.in);
        int numgeneration = kb.nextInt();
        nthGeneration(gridOri, M, N, numgeneration); 

    } 
  
    // Function to print next generation 
    static void nthGeneration(int grid[][], int M, int N, int generation) 
    {         
        int[][] future = new int[M][N]; 
        int[][] gridtemp = new int[M][N];            

	// Backup the grid
        for (int l = 0; l < M ; l++)             
            for (int m = 0; m < N ; m++) 
            {
                gridtemp[l][m] = grid[l][m];                
                future[l][m] = gridtemp[l][m];                
            }
        
        // Loop through every cell for the simulation. Although you can 
	// write your codes outside this method, you are suggested
	// to limit your codes inside this 'for loop' only. 
        for (int nthgen=1 ; nthgen<generation ; nthgen ++)  
	{
            
                    
        }
        
        System.out.print("\tOriginal Generation\t\t");  
        System.out.println("\t" + generation + "th Generation"); 
        PrintWorld(grid, future, M, N);

    }
    
    static void PrintWorld(int grid1[][], int grid2[][], int M, int N) {
        for (int i = 0; i < M; i++) 
        { 
            for (int j = 0; j < N; j++) 
            { 
                if (grid1[i][j] == 0) 
                    System.out.print(" . "); 
                else if (grid1[i][j] == 1)
                    System.out.print(" O "); 
                else
                    System.out.print(" X "); 
            } 
            System.out.print("\t\t"); 
            for (int j = 0; j < N; j++) 
            { 
                if (grid2[i][j] == 0) 
                    System.out.print(" . "); 
                else if (grid2[i][j] == 1)
                    System.out.print(" O "); 
                else
                    System.out.print(" X ");             
            }
            System.out.println();                     
        } 
     }

    
}
