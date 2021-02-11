
public class BubbleSort {
	void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void printarr(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {2,3,80,1,58,9,10};
		BubbleSort obj1= new BubbleSort();
		
		System.out.println("Array before sorting");
		obj1.printarr(arr);
		System.out.println("Array after sorting: ");
		obj1.sort(arr);
		obj1.printarr(arr);
		

	}

}
