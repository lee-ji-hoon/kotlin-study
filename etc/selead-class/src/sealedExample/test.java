package sealedExample;

public class JavaTestClassExample {
    // 2차 array 곱 void형
    public static void matrixmul(double[][] A, double[][] B, double[][] C) {

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B[0].length; j++) {
                C[i][j] = 0;
                for(int k=0; k<B.length; k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
    }

    // 2차 array 곱 return형
    public static double[][] matrixmul(double[][] A, double[][] B) {

        double[][] C = new double[A.length][B[0].length];

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B[0].length; j++) {
                C[i][j] = 0;
                for(int k=0; k<B.length; k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }

    // 2차 array를 출력
    public static void printarray(String meg, double[][] A ) {

        System.out.println(meg);
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                System.out.print(String.format("%,.0f", A[i][j]) + "\t\t");
            }
            System.out.println();
        }

    }

    // 줄긋기
    public static void printline(String sig, int num) {
        for(int i=0; i<num; i++) {
            System.out.print(sig);
        }
        System.out.println();
    }

    // void형 +
    public static void matrixsum( double[][] A, double[][] B, double[][] C ) {

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

    }

    // return형 +
    public static double[][] matrixsum( double[][] A, double[][] B ) {
        double[][] C = new double[A.length][A[0].length];

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    // void형 -
    public static void matrixsub( double[][] A, double[][] B, double[][] C ) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

    }

    // return형 -
    public static double[][] matrixsub( double[][] A, double[][] B ) {
        double[][] C = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }

    // 역행렬 구하는 void형 메소드
    public static void inverse(double[][] A, double[][] invA) {

        double[][] B = new double[A.length][A.length*2];

        for (int i = 0; i < A.length; i++) {     // 행
            for (int j = 0; j < A.length; j++) { // 열
                B[i][j] = A[i][j];
                if (i == j) {
                    B[i][j + A.length] = 1;
                } else {
                    B[i][j + A.length] = 0;
                }
            }
        }

        // forward method
        for (int k = 0; k < (A.length - 1); k++) {
            for (int j = (k + 1); j < A.length; j++) {
                double pivot = B[j][k] / B[k][k];
                for (int i = 0; i < (A.length * 2); i++) {
                    B[j][i] = B[k][i] * pivot - B[j][i];
                }
            }
        }

        // back method
        for (int k = (A.length - 1); k > 0; k--) {
            for (int j = (k - 1); j > -1; j--) {
                double pivot = B[j][k] / B[k][k];
                for (int i = 0; i < (A.length * 2); i++) {
                    B[j][i] = B[k][i] * pivot - B[j][i];
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            double pivot = B[i][i];
            for (int j = 0; j < A.length * 2; j++) {
                B[i][j] = B[i][j] / pivot;
            }
        }

        for (int i = 0; i < A.length; i++) {    // 행
            for (int j = 0; j < A.length; j++) {    // 열
                invA[i][j] = B[i][j + A.length];
            }
        }
    }

    // 역행렬 구하는 return형 메소드
    public static double[][] inverse(double[][] A) {

        double[][] B = new double[A.length][A.length*2];

        for (int i = 0; i < A.length; i++) {     // 행
            for (int j = 0; j < A.length; j++) { // 열
                B[i][j] = A[i][j];
                if (i == j) {
                    B[i][j + A.length] = 1;
                } else {
                    B[i][j + A.length] = 0;
                }
            }
        }

        printarray("B make", B);


        // forward method
        for (int k = 0; k < (A.length - 1); k++) {
            for (int j = (k + 1); j < A.length; j++) {
                double pivot = B[j][k] / B[k][k];
                for (int i = 0; i < (A.length * 2); i++) {
                    B[j][i] = B[k][i] * pivot - B[j][i];
                }
            }
        }

        printarray("B forward", B);


        // back method
        for (int k = (A.length - 1); k > 0; k--) {
            for (int j = (k - 1); j > -1; j--) {
                double pivot = B[j][k] / B[k][k];
                for (int i = 0; i < (A.length * 2); i++) {
                    B[j][i] = B[k][i] * pivot - B[j][i];
                }
            }
        }

        printarray("B back", B);


        for (int i = 0; i < A.length; i++) {
            double pivot = B[i][i];
            for (int j = 0; j < A.length * 2; j++) {
                B[i][j] = B[i][j] / pivot;
            }
        }

        printarray("B last", B);


        double[][] invA = new double[A.length][A.length];
        for (int i = 0; i < A.length; i++) {    // 행
            for (int j = 0; j < A.length; j++) {    // 열
                invA[i][j] = B[i][j + A.length];
            }
        }

        printarray("inv A", invA);


        return invA;
    }

    // 전치행렬
    public static double[][] transpose(double[][] A) {
        double[][] trans = new double[A[0].length][A.length];

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                trans[j][i] = A[i][j];
            }
        }

        return trans;
    }

    public static void main(String[] args) {

        double[][] M = {{2, 0, 4, 0, 6, 8},
                {0, 3, 0, 5, 0, 0},
                {4, 0, 4, 6, 0, 7},
                {0, 5, 6, 5, 0, 5},
                {6, 0, 0, 0, 6, 0},
                {8, 0, 7, 5, 0, 7}};

        printarray("M", M);
        printarray("inverse of M", inverse(M));

        double[][] A = new double[4][4];
        double[][] B = new double[4][2];
        double[][] C = new double[2][4];
        double[][] D = new double[2][2];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i < 4 && j < 4) {
                    A[i][j] = M[i][j];
                } else if (i < 4 && j >= 4) {
                    B[i][j - 4] = M[i][j];
                } else if (i >= 4 && j < 4) {
                    C[i - 4][j] = M[i][j];
                } else if (i >= 4 && j >= 4) {
                    D[i - 4][j - 4] = M[i][j];
                } else {
                }
            }
        }

//        printarray("A", A);
//        printarray("B", B);
//        printarray("C", C);
//        printarray("D", D);


        double[][]MD = matrixsub(A, matrixmul(matrixmul(B,inverse(D)),C));
//        printarray("MD",MD);
        double[][] AA = inverse(MD);
        double[][] BB = matrixmul( matrixmul(AA, B), inverse(D) );
//        double[][] CC = // 작성하기
//        double[][] DD = // 작성하기

        double[][] inv_M = new double[6][6];
        // inv_M에 AA, BB, CC, DD를 넣을 것. AA는 A 자리에, BB는 B 자리에(-1을 곱하면서 넣을 것), CC는 C자리에, DD는 D자리에

    }
}