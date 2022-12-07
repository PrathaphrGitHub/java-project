package string_programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountDuplicateWords {

	@Test
	public void occurence() {
		String s="in am in am hi";
		String[] words = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		
		for (String lv : set) {
			int count=0;
			for (int i = 0; i < words.length; i++) {
		
				if (lv.equals(words[i]) ){
					count++;
				}
			}
			if (count>1)
			System.out.println(lv+" occurs "+count+"  times");
			
		}
	}
}
