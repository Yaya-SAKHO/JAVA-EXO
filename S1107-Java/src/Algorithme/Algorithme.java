package Algorithme;

public class Algorithme {


    public static void main(String[] args){
        int[][] grid = {
                {1,2,3},
                {1,2,3},
                {1,2,3}

        };

        System.out.println("Resultat = " + f(grid));
    }




    public static int f(int[][] grid){

         int[][] grids;
         int height;
         int width;
         height = grid.length;
         width = grid[0].length;
         grids = new int[height][width];

        int somme = 0;
        for(int i = 0; i < height;i++){
            for(int j = 1; j<width;j++){
                if(grids[i][j]<grids[i+1][j+1]){
                    //TODO
                    somme += grid[i+1][j+1];

                }
            }
        }

        return somme;

        }
}
