package string_programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class OccurenceOfEachWords {

	@Test
	public void occurence() {
		String s="in am in am in hi i";
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
			System.out.println(lv+" occurs "+count+"  times");
		}
	}
	
	@Test
	public void occurence2() {
		
	}
}
