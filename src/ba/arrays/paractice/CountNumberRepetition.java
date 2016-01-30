package ba.arrays.paractice;

import java.util.HashMap;
import java.util.Map;

public class CountNumberRepetition {

	public static void main(String[] args) {
		Integer[] array = { 0, 3, 5, 5, 2, 1, 3, 5, 67, 8, 9, 6, 8, 3, 3, 2, 7 };

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}

		System.out.println(map);

	}

}
