
public class Math {
	public int add(int... numbers) {
		int ans = 0;
		for (int i = 0; i < numbers.length; i++) {
			ans += numbers[i];
		}
		return ans;
	}

	/**
	 * takes 2 numbers and multiply them
	 * 
	 * @author vaiibm
	 */

	long multiply(int... numbers) {
		long ans = 1;
		for (int i = 0; i < numbers.length; i++) {
			ans *= numbers[i];
		}
		return ans;

	}
}
