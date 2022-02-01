package IshanRepo.E2ESelenium;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiply = multiply(7,10);
		System.out.println(multiply);
		

	}

	private static int multiply(int main, int multiplier) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<multiplier; i++)
		{
			sum = sum + main;
		}
		return sum;
	}

}
