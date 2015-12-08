
public class ExerciseTrueOrFalseTwo {

	public static void main(String[] args) {

		String[] text = { "true", "true", "true", "true", "true" };

		System.out.println(trueOrFalse(text));

	}

	private static boolean trueOrFalse(String[] text) {
		boolean flag = true;
		for (int i = 0; i < text.length; i++) {
			if (text[i].equals("false")) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
