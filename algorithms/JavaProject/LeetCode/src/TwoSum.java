import java.util.Hashtable;
/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be
less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		int sum = 6;
		Hashtable<Integer, Integer> tmp = new Hashtable<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			tmp.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			int sub = sum - arr[i];
			if (sub != 0 && tmp.contains(sub)) {

				System.out.println(i + "," + tmp.get(sub));
			}
		}
	}
}
