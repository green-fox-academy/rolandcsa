package symmetric_matrix;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
        int[][] matrix2 = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};

        System.out.println(isSymmetric(matrix1));
        System.out.println(isSymmetric(matrix2));
    }

    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
