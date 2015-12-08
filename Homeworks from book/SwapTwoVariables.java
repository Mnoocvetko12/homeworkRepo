
public class SwapTwoVariables {

	/*
	 * 7. Да се модифицира първата задача, така че да разменя стойностите на две
	 * въведени променливи х и у, но без да се използва трета променлива, а само
	 * аритметични операции.
	 */

	public static void main(String[] args) {
		
		int a = 8;
		int b = 5;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + " b: " + b);

	}

}
