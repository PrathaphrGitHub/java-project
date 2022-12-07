package string_programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfEachWord {

	@Test
	public void occurence() {
		String s="in am in am i ho";
		String[] words = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		
		for (String lv : set) {
			for (int i = 0; i < words.length; i++) {
		
				if (lv.equals(words[i]) ){
					System.out.println(lv+"----->"+i+" index");
					System.out.println(lv+"----->"+(i+1)+" position");
					System.out.println("---------");
				}
			}
		}
	}
}
