class Multi {

	public static void main(String[] args) {
		int[][] a = {  {1,2,3,4,5},
					   { 6,7,8,9,10},
					   {11,12,13,14,15} };

		//System.out.println(sumTotal);
		a[1] = reverseRow(1, a);
		print(a);

	}

	public static void print(int [][] a){
		for (int r = 0; r < a.length; r++) {
			for (int c =0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
				
			}
			System.out.println();
		}
	}

	public static int sumRow(int [][] a, int row){
		int sum = 0;
		for (int i = 0; i < a[row].length; i++) {
			sum += a[row][i];
		}

		return sum;
	}

	public static int sumCol(int [][] a, int col){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][col];
		}
		return sum;
	}

	public static int sumTotal(int [][] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + sumRow(a, i);
		}
		return sum;
	}
	public static int[] reverseRow(int n, int [][] a){
	 	int [] b = {0, 0, 0, 0, 0};
	 	for (int i = 0; i < a[n].length; i++) {
	 		b[i] = a[n][(a.length + 1) - i];
	 	}
	 	return b;
	}

	public static int [][] snakeDraft(int players, int rounds){
		int[][] a;
		for (int i = 0; i < rounds; i++) {
			for( int j =0; j < players; j++){
				if (i % 2 ==1) {
					a[i][j] = players -j;
					
				}else{
					a[i][j] =players + 1;
				}
				
			}
			
		}
		return a;
	}

	
}