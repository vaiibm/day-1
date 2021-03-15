
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 4, 7, 2 };
		bubbleSort(array);
		for (int j = 0; j < array.length; j++) {

			System.out.println(array[j]);
		}
	}

	static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}
}
