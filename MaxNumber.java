package Refactoring;

public class MaxNumber {
	public int max2(int number1, int number2) {
		if (number1 >= number2)
			return number1;
		else
			return number2;
	}

	public int max3(int number1, int number2, int number3) {
		return max2(max2(number1, number2), number3);
	}
}
