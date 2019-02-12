package algoTemplate;

import static org.junit.Assert.assertEquals;


public class Test {

	Logics m = new Logics();
	String participant1[] = {"leo", "kiki", "eden"};
	String participant2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
	String participant3[] = {"mislav", "stanko", "mislav", "ana"};

	String completion1[] = {"eden", "kiki"};
	String completion2[] = {"marina", "josipa", "nikola", "filipa"};
	String completion3[] = {"stanko", "mislav", "ana"};


	@org.junit.Test
	public void marathon() {
		assertEquals("leo", m.solution(participant1, completion1));
		assertEquals("vinko", m.solution(participant2, completion2));
		assertEquals("mislav", m.solution(participant3, completion3));
	}
}