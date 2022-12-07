package arrays_programs;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {0,0,1,1,0,2,2,3,4,3,6,5,5,6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[j]=100;
				}
			}
			if (a[i]!=100) {
				System.out.print(a[i]+" ");
			}
			
		}
		
	}
}
