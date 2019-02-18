package Spy;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpyQuiz {

	public int solution(String clothes[][]) {

		Map<String, Integer> clothGroupCounter = new HashMap<>();
		for (String[] clothGroup : clothes) {
			String clothGroupName = clothGroup[1];
			if (clothGroupCounter.containsKey(clothGroupName)) {
				clothGroupCounter.put(clothGroupName, (clothGroupCounter.get(clothGroupName) + 1));
			} else {
				clothGroupCounter.put(clothGroupName, 1);
			}
		}

		int count = 1;
		Set<String> clothGroupNames = clothGroupCounter.keySet();
		for (String name : clothGroupNames) {
			count *= (clothGroupCounter.get(name) + 1); //입지않은 경우를 포함
		}
		return count - 1; //모두 벗은 경우를 제외
	}
}
