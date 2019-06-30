import java.util.Scanner;

public class sortarray {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n =s.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++){
			
			arr[i]=s.nextInt();
		//	System.out.println(arr[i]);
		}
		
		for(int j=0;j<arr.length-1;j++){
			
			for(int k =0;k<arr.length-j-1;k++){
				  if (arr[k] > arr[k+1]){
				int temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]=temp;
				  }
			}
		}
		 int n1 = arr.length;
	        for (int l=0; l<n1; ++l)
	            System.out.print(arr[l] + " ");
	        System.out.println();
	}

}
