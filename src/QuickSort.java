
public class QuickSort implements Sorter {

	@Override
	public short[] sort(short[] arr) {
		qsort(arr, 0, arr.length - 1);
		return arr;
	}
	
	private void qsort(short[] arr, int begin, int end)
	{
		short piv = arr[(begin + end)/2];
		int i = begin, j = end;
		while(i<=j)
		{
			while(arr[i]<piv)
			{
				i++;
			}
			while(arr[j]>piv)
			{
				j--;
			}
			if(i<=j)
			{
			short temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
			}
		}
		if(j>begin)
		{
			qsort(arr, begin, j);
		}
		if(i<end)
		{
			qsort(arr, i, end);
		}
	}
}
