public class SelectionSort implements Sorter {
	@Override
	public short[] sort(short[] arr) {
		for(int i = 0; i < arr.length - 1; i++)
		{
			int min = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j; 
				}
			}
			if(min != i)
			{
				short temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
}
