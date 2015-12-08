
public class ExerciseTwelve {

	/*
	 * Да се състави програма, която извежда всички естествени трицифрени числа,
	 * които нямат еднакви цифри т.е. 100,101, 606 и т.н. не се извеждат.
	 */

	public static void main(String[] args) {

//		for (int i = 100; i < 1000; i++) {
//			int digitOne = i / 100;
//			int digitTwo = (i / 10) % 10;
//			int digitThree = i % 10;
//
//			if (digitOne != digitTwo && digitOne != digitThree && digitTwo != digitThree) {
//				System.out.println(i);
//			}
//
//		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					if(i != j && j != k && i != k) {
						System.out.println(i + "" + j + "" + k);
					}
				}
				
			}
			
		}
	}

}
