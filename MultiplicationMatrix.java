public class MultiplicationMatrix
{
	public static void main(String args[]){
		int matrix1[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int matrix2[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int matrix3[][] = new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix3[i][j]=0;
				for(int k=0;k<3;k++){
					matrix3[i][j] = matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}

	}
}