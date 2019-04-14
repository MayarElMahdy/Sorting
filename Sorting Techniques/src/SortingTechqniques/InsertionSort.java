package SortingTechqniques;

public class InsertionSort {
	//SORTING IN ASCENDING ORDER
	public int[] InsertionSort(int arr[])
	{
		for(int i=1; i< arr.length ; i++)
		{
				int j = i-1;
				int key =arr[i];
				while( j>=0  && arr[j] > key)
				{
					int temp = arr[i];
					arr[j]=arr[i];
					arr[i]=temp;
					j--;
				}
				arr[j+1]=key;
		}
		
	return arr;
	}
	
	public void Print(int arr[])
	{
        System.out.println("Sorted array"); 

		for(int i=0; i< arr.length ; i++ )
		{
			System.out.println(arr[i]);
		}
	}


	

}
