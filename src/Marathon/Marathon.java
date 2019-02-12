package Marathon;

import java.util.HashMap;

public class Marathon {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		//step1. 참가자넣기
		for (String runner : participant) {
			if (map.containsKey(runner)) {//동명이인
				int value = map.get(runner) + 1;
				map.put(runner, value);
			} else {
				map.put(runner, 1);
			}
		}

		//step2. 완주자 걸러내기
		for (String runner : completion) {
			int value = map.get(runner) - 1;
			map.put(runner, value);
		}

		//step3. 완주하지 못한 한명 찾기
		for (String runner : map.keySet()) {
			if (map.get(runner) == 1) {
				answer = runner;
			}
		}

		//O(n)
		return answer;
	}
}