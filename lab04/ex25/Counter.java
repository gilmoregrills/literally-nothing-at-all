/**
 * Class allows you to easily set a starting int
 * and count up or down from it and up to a maximum.
 * @author Robin Yonge
 * @Version 1.0
 */
public class Counter {
	private	int count;
	private int max;
	/**
	 * The constuctor doesn't take any arguments, 
	 * values of count and max can be set using
	 * the setMax() and setCount() methods.
	 */	
	public Counter() {
		count = 0;
		max = 10;
	}
	
	/**
	 * This method returns the value of count.
	 */
	public int getCount() {
		return count;
	}
	/**
	 * This method returns the value of max.
	 */	
	public int getMax() {
	       return max;
	}
	/**
	 * This method sets the value of count to 
	 * whatever parameter you pass.
	 * @param n The value-to-be of count.
	 */
	public void setCount(int n) {
		count = n;
	}
	/**
	 * This method sets the value of max to
	 * whatever parameter you pass.
	 * @param n The value-to-be of max.
	 */
	public void setMax(int n) {
		max = n;
	}
	/**
	 * This will increment the value of count
	 * by 1, unless count has already reached
	 * the max, in which case it resets to 0.
	 */
	public void increase() {
		if (count < max) {
			count++;
		} else {
			count = 0;
		}
	}

	/**
	 * This will increment the value of count 
	 * by a specified amount.
	 * @param n The value to increment by.
	 */
	public void increase(int n) {
		if (count < max && (count + n) > max) {
			count = 0;
		} else {
			count += n;
		}
	}

	/**
	 * This will decrement the value of count
	 * by 1, unless count is already 0, in
	 * which case it remains the same.
	 */
	public void decrease() {
		if (count > 0) {
			count--;
		} else {
			count = 0;	
		}
	}
	/**
	 * This will decrement the value of count
	 * by the specified amount.
	 * @param n The value to decrement by. 
	 */
	public void decrease(int n) {
		if (count > 0 && (count - n) < 0) {
			count = 0;
		} else if (count > 0) { 
			count -= n;
		}
	}
	/**
	 * This will reset the value of count to
	 * 0, and print a confirmation.
	 */
	public void reset() {
		count = 0;
		System.out.println("Counter Reset!");
	}
	/**
	 * This method returns as a string the current
	 * values of count and max.
	 */ 
	public String toString() {
		return "Count: "+this.count+"\nMax: "+this.max;
	}
}
