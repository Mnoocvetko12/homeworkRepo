package recursion;

import java.util.Arrays;
import java.util.Random;

public class ExerciseFive {

	/*
	 * 5. Да се състави програма, която приема за входни данни масив от цели
	 * числа. Програмата да извежда на екрана индекса на най-големия елемент.
	 * Използвайте рекурсия.
	 */

	public static void main(String[] args) {
		Random rdm = new Random();
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rdm.nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		System.out.println(array[maxArrayElement(array, 0)]);
		System.out.println(array[minArrayElement(array, 0)]);
		
//		System.out.println(maxArrayElement(array, 0));
//		System.out.println(minArrayElement(array, 0));
		
		System.out.println(dif(array[maxArrayElement(array, 0)], array[minArrayElement(array, 0)]));

	}
	
	public static int maxArrayElement(int[] array, int index) {
		if(index == array.length -1) {
			
			return index;
			
		}
		
		int max = maxArrayElement(array, index+1);
		
		
		if(array[max] < array[index]) {
			
			return index;
			
		}
			else {
				
				return max;
			}
			
		}
		
	public static int minArrayElement(int[] array, int index) {
		 if (index == array.length - 1) {
			    return index;
			  }

			  int val = minArrayElement(array, index + 1);

			  if (array[index] < val)
			    return index;
			  else
			    return val;
	}
	public static int dif(int a, int b) {
		int diff = a - b;
		
		return diff;
	}
	}


