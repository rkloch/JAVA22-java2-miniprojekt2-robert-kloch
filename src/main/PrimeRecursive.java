package main;

public class PrimeRecursive {
	int count = 0;

	public void showPrimes(int start, int stop, int depth) {
		if (depth > stop) {
			System.out.println("numer of primes:" + count);// <----------- the base case/ stop condition
			return;
		}

		// <--------------- outer loop logic
		if (isPrime(depth, 2)) {
			count++;
			System.out.println(depth);
		}

		showPrimes(start, stop, ++depth);

	}

	// Like the inner for loop
	public boolean isPrime(int current, int depth) {

		if (current <= 2) {
			return current == 2 ? true : false;
		}
		if (current % depth == 0) {
			return false;
		}

		if (depth > current / 2) {
			return true;
		}
		return isPrime(current, ++depth);
	}

	public static void main(String[] args) {
		PrimeRecursive prm2 = new PrimeRecursive();
		prm2.showPrimes(2, 1000, 2);
	}
}
