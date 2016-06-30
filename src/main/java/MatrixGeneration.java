/**
 * Created by Artur on 30.06.2016.
 */

public class MatrixGeneration {

        int[][] matrixA;
        int[][] matrixB;


        public  void generation(){

            matrixA = new int[2][3];
            matrixB= new int[3][3];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    matrixA[i][j] = ((int) (Math.random() * 20));
                }

            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrixB[i][j] = ((int) (Math.random() * 20));
                }
            }

        }

    public int[][] getMatrixA(int i,int j){
        return matrixA;
    }


    public int[][] getMatrixB(int i, int j){
        return matrixB;
    }
}
