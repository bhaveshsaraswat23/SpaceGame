package org.spacecards.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardsGameUtil {
	public static List<Integer> getPlayer1Dec() {
		int[] arr = new int[] { 41, 26, 29, 11, 50, 38, 42, 20, 13, 9, 40, 43, 10, 24, 35, 30, 23, 15, 31, 48, 27, 44,
				16, 12, 14 };
		List<Integer> dec = Arrays.stream(arr).boxed().collect(Collectors.toList());
		;
		return dec;
	}

	public static List<Integer> getPlayer2Dec() {
		int[] arr = new int[] { 18, 6, 32, 37, 25, 21, 33, 28, 7, 8, 45, 46, 49, 5, 19, 2, 39, 4, 17, 3, 22, 1, 34, 36,
				47 };
		List<Integer> dec = Arrays.stream(arr).boxed().collect(Collectors.toList());
		;
		return dec;
	}
}
