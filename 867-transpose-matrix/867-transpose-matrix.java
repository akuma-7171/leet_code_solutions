class Solution {
    public int[][] transpose(int[][] matrix) {
        
       int M = matrix.length; int N = matrix[0].length;

	
	int[][] B = new int[N][M];

	for (int i = 0; i < M; i++) {
		for (int j = 0; j < N; j++) {
			B[j][i] = matrix[i][j];
		}
	}

	return B;
        
    }
}