package sortingAlgorithms;

import java.util.Scanner;

public class ExerciseNine {

	/*
	 * Масив arr наричаме хълм (съответно падина), ако за 0 <= i <=
	 * arr.length-1,всички елементи с индекси от 0 до i са подредени нарастващо
	 * (съответно намаляващо) и всички елементи с индекси от i до arr.length-1
	 * са подредени намаляващо (съответно нарастващо). Индексът i наричаме
	 * екстремум. Напишете метод int findExtremum(int[] arr), който връща
	 * екстремума на масива arr, който е или хълм или падина. За по- просто
	 * допускаме, че масива е с различни елементи. Да се използва двоично
	 * търсене.
	 */

	public static void main(String[] args) {

//		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 2};
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(findExtremum(array));
		
		
	}
	

	public static int findExtremum(int[] arr) {
        int extremum = 0;
        int index = 0;
        boolean isIncrase = false;
        if(arr[index] <= arr[index + 1]) {
            isIncrase = true;
        }
        while(index < arr.length) {
            
            if(isIncrase) {
                if(arr[index] <= arr[index + 1]) {
                    extremum = arr[index + 1];
                }
                else {
                    break;
                }
            }
            else {
                if(arr[index] >= arr[index + 1]) {
                    extremum = arr[index + 1];
                }
                else {
                    break;
                }
            }
            index++;
        }
        return extremum;
    }

}
