class Draft {
	public static void main(String[] args) {
		snakeDraft(10, 3);
		print(rectangularize(), 3, 2);

		int c[] = {10,9,8,7,6,5,4,3,2,1};
		
	}

	public static int[][] snakeDraft(int a, int b){
		for (int i = 0; i; ) {
			
		}

	}

	public static void print(int [][] a){
		for (int r = 0; r < a.length; r++) {
			for (int c =0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] rectangularize(int c[], int a, int b){
		int [][] d = new int[a][b];

		for (int i = 0; i < c.length; i++) {
			int b = i % b;
			int a = i % a;
			d[i][b]= c[i];
			
		}


	}
	
}