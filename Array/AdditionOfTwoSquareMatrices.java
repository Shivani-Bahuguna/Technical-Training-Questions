public class AdditionOfTwoSquareMatrices {
    public static void main(String[] args) {
        int[][] a={{2,2},{2,2}};
        int[][] b={{3,3},{3,3}};
        addition(a,b);


    }

    static void  addition(int[][] matrixA, int[][] matrixB)
    {
        for(int i=0; i<matrixA.length; i++)

        {

            for(int j=0; j<matrixA[0].length; j++)

            {

                matrixA[i][j]+=matrixB[i][j];

            }

        }
    }
}