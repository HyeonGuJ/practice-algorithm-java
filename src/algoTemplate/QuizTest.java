package algoTemplate;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class QuizTest {

    Quiz quiz = new Quiz();


    @Test
    public void marathon() {
        assertEquals(quiz.solution("param"),"answer");
    }
}