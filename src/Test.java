
public class Test {
	public static void main(String[] args)
	{
		testSort(new InsertionSort());
		testSort(new SelectionSort());
		testSort(new QuickSort());
	}
	public static void printArr(short[] arr)
	{
		for(short x : arr)
		{
			System.out.print("" + x + " ");
		}
		System.out.println();
	}
	public static void testSort(Sorter sorter)
	{
		System.out.println(sorter.getClass().getSimpleName());
		printArr(sorter.sort(new short[] {9, 8 ,7, 6, 5, 4, 3, 2, 1}));
		printArr(sorter.sort(new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
		printArr(sorter.sort(new short[] {1, 1, 2, 1, 1, 1, 1, 1, 1}));
		printArr(sorter.sort(new short[] {1, 0}));
		printArr(sorter.sort(new short[] {0, 0}));
		try {
			printArr(sorter.sort(null));
		}
		catch (NullPointerException ex) {
			System.out.println("Error! " + ex.getMessage());
		}
	}
}
