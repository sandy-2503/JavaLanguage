package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReverseInGroup {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(8);
		arr.add(9);
		reverseInGroups(arr, 4, 3);
		Map<Integer,String>  map = new HashMap<>();
	}
	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		for (int i = k; i < n-k; i--) {
			
		}
    }
}
