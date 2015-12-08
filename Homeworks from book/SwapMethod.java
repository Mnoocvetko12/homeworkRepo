import java.util.Arrays;

public class SwapMethod {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		int[] arr = new int[2];

		arr[0] = a;
		arr[1] = b;

		System.out.println(Arrays.toString(arr));

		swapVar(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void swapVar(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

}
