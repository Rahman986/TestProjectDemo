package com.infogain;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceCharacter {
	public static void main(String[] args) {
		/* finding the string repeated character */
		String str = "haseeb";
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int cnt = map.get(c);
				map.put(c, cnt + 1);
			}
			System.out.println(map);
		}
	}

}
