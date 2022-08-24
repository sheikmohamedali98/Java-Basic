package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayProgram {

	public int[] mergeArray(int[] arr1, int[] arr2) {
		int j = 0;
		int k = 0;
		int[] array = new int[arr1.length + arr2.length];
		for (int i = 0; i < array.length; i++) {
			if (i < arr1.length) {
				array[j++] = arr1[i];
			}
			if (i >= arr1.length && i < array.length) {
				array[j] = arr2[k++];
				j++;
			}
		}
		array = arrayAscending(array);
		array = removeDublicateSort(array);
		return array;
	}

	public int[] arrayDecending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public int[] arrayAscending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public int[] removeDublicateSort(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[index++] = arr[i];
			}
		}
		arr[index++] = arr[arr.length - 1];
		return Arrays.copyOf(arr, index);
	}

	public int[] alterAscendingDecending(int[] arr) {
		int[] temp = arr.clone();

		boolean flag = true;
		int start = 0;
		int end = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (flag) {
				arr[i] = temp[end--];
			} else {
				arr[i] = temp[start++];
			}
			flag = !flag;

		}

		return arr;
	}

	public int[] oddDecendingEvenAscending(int[] arr) {
		int len = arr.length;
		int des = 0;
		int asc = 0;
		int[] ascending = new int[len / 2];
		int[] decending = new int[len - ascending.length];
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				decending[des] = arr[i];
				des++;
			} else {
				ascending[asc] = arr[i];
				asc++;
			}
		}
		ascending = arrayAscending(ascending);
		decending = arrayDecending(decending);

		des = 0;
		asc = 0;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				arr[i] = decending[des];
				des++;
			} else {
				arr[i] = ascending[asc];
				asc++;
			}
		}
		return arr;
	}

	public int[] evenPosition(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[index++] = arr[i];
			}
		}
		return Arrays.copyOf(arr, index);
	}

	public int[] oddPosition(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				arr[index++] = arr[i];
			}
		}
		return Arrays.copyOf(arr, index);
	}

	public int largeElement(int[] arr) {
		arrayAscending(arr);
		return arr[arr.length - 1];
	}

	public int smallElement(int[] arr) {
		arrayAscending(arr);
		return arr[0];
	}

	public int numberOfElement(int[] arr) {
		return arr.length;
	}

	public int[] anotherArray(int[] arr) {
		int[] another = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			another[i] = arr[i];
		}
		return another;
	}

	public void frequencyArray(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Number " + entry.getKey() + "  Frequency " + entry.getValue());

		}
	}

	public int[] leftRotate(int[] arr, int index) {

		for (int i = 0; i < index; i++) {
			int j, first;
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		return arr;
	}

	public int sumAllElement(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public int[] printDublicate(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[index++] = arr[i];
			}
		}
		return Arrays.copyOf(arr, index);
	}

	public int[] rightRotate(int[] arr, int index) {

		for (int i = 0; i < index; i++) {
			int j, last;
			last = arr[arr.length-1];
			for (j = arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		return arr;
	}
}
