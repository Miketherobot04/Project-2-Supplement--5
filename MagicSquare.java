public static boolean isMagicSquare(int[][] matrix) {
    // Validate the input
    if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) return false;
    
    int n = matrix.length;
    int sum = 0;
    for (int i = 0; i < n; i++) sum += matrix[0][i]; // Sum of the first row

    // Check rows and columns
    for (int i = 0; i < n; i++) {
        int rowSum = 0, colSum = 0;
        for (int j = 0; j < n; j++) {
            rowSum += matrix[i][j];
            colSum += matrix[j][i];
        }
        if (rowSum != sum || colSum != sum) return false;
    }

    // Check diagonals
    int diag1 = 0, diag2 = 0;
    for (int i = 0; i < n; i++) {
        diag1 += matrix[i][i];
        diag2 += matrix[i][n - 1 - i];
    }
    return diag1 == sum && diag2 == sum;
}