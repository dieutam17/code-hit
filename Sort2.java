package Refactoring;

public class Sort2 {
	int number1;
	int number2;
	int number3;

	public void descSort() {
		compare2Number(number1, number1 = number2);
		compare2Number(number1, number1 = number3);
		compare2Number(number2, number2 = number3);
	}

	private void compare2Number(int n1, int n2) {
		if (n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
	}
}
