package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayController {

	static Scanner scan = new Scanner(System.in);
	static ArrayProgram array = new ArrayProgram();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] arr2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };

		System.out.println("input");
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		System.out.println(Arrays.toString(array.mergeArray(arr1, arr2)));
		System.out.println("===================================");

		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Input:" + Arrays.toString(arr3));
		System.out.println("output :" + Arrays.toString(array.alterAscendingDecending(arr3)));

		System.out.println("===================================");
		int[] arr4 = { 13, 2, 4, 15, 12, 10, 5 };
		System.out.println("input: " + Arrays.toString(arr4));
		System.out.println("output :" + Arrays.toString(array.oddDecendingEvenAscending(arr4)));
		System.out.println("================================================");
		int[] arr5 = { 1, 2, 3, 4, 6, 7, 8, 9 };
		System.out.println("input " + Arrays.toString(arr5));
		System.out.println("Large Element " + array.largeElement(arr5));
		System.out.println("Small Element " + array.smallElement(arr5));
		System.out.println("Number Of Element " + array.numberOfElement(arr5));
		System.out.println("Copy To Another Array :" + Arrays.toString(array.anotherArray(arr5)));
		System.out.println("Even position :" + Arrays.toString(array.evenPosition(arr5)));
		int[] arr6 = { 1, 2, 3, 4, 6, 7, 8, 9 };
		System.out.println("Odd Position :" + Arrays.toString(array.oddPosition(arr6)));
		System.out.println("==================================================");

		int[] arr7 = { 1, 1,5,1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7 };
		array.frequencyArray(arr7);
		System.out.println("==================================================");
		int[] arr8 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Left rotate Array :"+Arrays.toString(array.leftRotate(arr8, 3)));
		System.out.println("===============================================");
		int[] arr11  = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Right Rotate Array "+Arrays.toString(array.rightRotate(arr11, 4)));
		System.out.println("==================================================");
		int[] arr9 = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 6 };
		System.out.println("Sum Of All Element " + array.sumAllElement(arr9));
		System.out.println("========================================================");
		int[] arr10 = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 6 };
		System.out.println("Print Dublicate Element :" + Arrays.toString(array.printDublicate(arr10)));
	}

}
