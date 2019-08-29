package factorial;

public class Factorial {

	public int factorialAK(int x) {
		int factorial = -1;

		for (int i = 2; x % i == 0; i++) {

			if (factorial / i == 1) {
				factorial = i;
				break;
			} else {
				factorial = x / i;
			}

		}

		return factorial;
	}

}
