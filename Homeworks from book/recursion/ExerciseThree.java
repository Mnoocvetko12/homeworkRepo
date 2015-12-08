package recursion;

public class ExerciseThree {

	/*
	 * 3. Да се състави програма, която по въведен масив с естествени числа
	 * проверява дали този масив е монотонно нарастващ. Монотонно нарастващ
	 * масив е такъв, при който всеки следващ елемент е по-голям от предишния.
	 * Използвайте рекурсия.
	 */

	public static void main(String[] args) {
		int[] array = {1, 4, 6, 8, 13, 24, 35, 46, 58, 79, 100};
		
		System.out.println(sortedArray(array, 5));
	}
	
	public static boolean sortedArray(int[] array, int index) {
		
		if(index == array.length -1) {
			return true;
		}
		
		if(array[index] > array[index+1]) {
			return false;
			
		}
		
		return sortedArray(array, index + 1);
	}

}
