
public class InsertionSort implements Sorter {

	@Override
	public short[] sort(short[] arr) {
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = i; j > 0 && arr[j-1] > arr[j]; j--)
			{
				short temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}

}
