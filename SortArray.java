public class SortArray{
	public static void main(String args[]){
		int array[] = {8,2,3,1,6,5,7};
		int n = array.length;
		for(int i=0;i<n;i++){
			Boolean flag = true;
			for(int j=0;j<n-i-1;j++){
				if(array[j]<array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = false;
				}
			}
			if(flag)
				break;
		}

		for(int i=0;i<n;i++){
			System.out.print("  "+array[i]);
		}

	}
}