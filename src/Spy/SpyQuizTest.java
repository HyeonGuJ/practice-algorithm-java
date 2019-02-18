package Spy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SpyQuizTest {

	SpyQuiz quiz = new SpyQuiz();

	@Test
	public void test1() {

		String[][] clothes1 = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes2 = new String[][]{{"one", "1"}, {"two", "1"}, {"three", "1"}, {"one", "2"}, {"two", "2"}, {"one", "3"}};
		assertEquals(5, quiz.solution(clothes1));
		assertEquals(23, quiz.solution(clothes2));
	}
}