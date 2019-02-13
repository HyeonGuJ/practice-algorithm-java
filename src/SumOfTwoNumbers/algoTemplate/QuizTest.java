package SumOfTwoNumbers.algoTemplate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuizTest {

    Quiz quiz = new Quiz();



    @Test
    public void test1() {
        assertEquals(quiz.solution(3,5),12);
        assertEquals(quiz.solution(3,3),3);
        assertEquals(quiz.solution(-5,3),-9);
        assertEquals(quiz.solution(-99999,999999),494999550000l);
    }
}