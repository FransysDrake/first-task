/**
 * Created by Artur on 30.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        matrixA = new int[2][3];
        matrixB = new int[3][3];
        matrixC = new int[3][3];


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





        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }


        int m = matrixA.length;
        int n = matrixB[0].length;
        int o = matrixB.length;
       // int[][] matrixC = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println();

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

    }
    }

