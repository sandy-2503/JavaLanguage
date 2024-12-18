package com.sandeep.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortList {

	public static void main(String[] args) {
		List<ArrayList<Integer>> c = new ArrayList<>();

		ArrayList<Integer> sub = new ArrayList<>();
		sub.add(5);
		sub.add(8);
		sub.add(1);
		c.add(sub);

		sub = new ArrayList<>();
		sub.add(7);
		sub.add(4);
		sub.add(1);
		sub.add(2);
		sub.add(3);
		c.add(sub);
		sub = new ArrayList<>();
		sub.add(6);
		sub.add(2);
		sub.add(4);
		sub.add(8);
		c.add(sub);

		System.out.println(c);
		Map<Integer, ArrayList<Integer>> m = new HashMap<>();
		for (ArrayList<Integer> entity : c) {
			Collections.sort(entity);
			int ll = entity.stream().reduce(0, (e1, e2) -> e1 + e2);
			m.put(ll, entity);
		}
		System.out.println(m);
	}

}
