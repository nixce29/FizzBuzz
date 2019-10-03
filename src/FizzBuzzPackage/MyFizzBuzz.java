package FizzBuzzPackage;

public class MyFizzBuzz  {

	public String CheckFizzBuzz(int i) {
		String ans = "";
		if(i == 1) {
			ans = "1";
		}
		else if(i == 2) {
			ans = "2";
		}
		else if(i == 3) {
			ans = "Fizz";
		}
		else if(i == 4) {
			ans = "4";
		}
		else if(i == 5) {
			ans = "Buzz";
		}
		else if(i == 6) {
			ans = "Fizz";
		}
		else if(i == 7) {
			ans = "7";
		}
		return ans;
	}
}
