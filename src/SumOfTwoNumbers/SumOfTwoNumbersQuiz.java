package SumOfTwoNumbers;


public class SumOfTwoNumbersQuiz {

	public long solution(int a, int b) {

		int high = a > b ? a : b;
		int low = a > b ? b : a;
		long sum = 0;
		for(int i=low; i<=high; i++){
			sum += i;
		}
		return sum;
	}
}
