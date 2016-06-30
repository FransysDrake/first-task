/**
 * Created by Artur on 30.06.2016.
 */
public class MatrixMultiplier {
    int[][] matrixC;
    int [][] mA = matrixA.getMatrixA();
    int [][] mB = matrixB.getMatrixB();


    public void Multiplier() {
        matrixC=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrixC[i][j] += mA.[i][j]*mB[k][j];
                }
            }
        }

    }

}