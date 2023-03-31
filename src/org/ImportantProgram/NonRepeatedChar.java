package org.ImportantProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatedChar {

	public static void main(String[] args) {
		String str = "Vaibhav";
		int count=0;
		char [] ch = str.toCharArray();
		Map<Character,Integer> chMap = new HashMap<Character, Integer>();
		for(char c:ch) {
			if(chMap.containsKey(c)){
				chMap.put(c, chMap.get(c)+1);
			}else {
				chMap.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrySet=chMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet ){
			if(entry.getValue()==1) {
				count++;
				System.out.println("Non Repeating Character : "+entry.getKey()+" : "+entry.getValue());
			}
		}
		System.out.println("No of Count is : "+count);
		
	}

}
