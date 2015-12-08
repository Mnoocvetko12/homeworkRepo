package stringsExercises;

public class ExerciseTwo {

	/*
	 * 2. Да се състави програма, чрез която се въвежда изречение с отделни
	 * думи. Като резултат на екрана да се извежда същия текст, но всяка отделна
	 * дума да започва с главна буква, а следващите я букви да са малки.
	 */

	public static void main(String[] args) {
		String text = "super qkata zadacha";

		String[] array = text.split(" ");
		String newText = "";

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i].toLowerCase();
			array[i] = array[i].replace(array[i].substring(0, 1), array[i].substring(0, 1).toUpperCase());

			newText += array[i] + " ";

		}
		System.out.println(newText);

	}

}
