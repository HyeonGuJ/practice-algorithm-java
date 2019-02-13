package HateDuplicatedNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateDuplicatedNumber {

    public int[] solution(int[] arr) {

        List<Integer> numbers = new ArrayList<>();

        for (int number : arr) {

            if (numbers.size() == 0 || numbers.get(numbers.size() - 1) != number) {
                numbers.add(number);
            }
        }
        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}