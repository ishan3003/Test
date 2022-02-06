package IshanRepo.E2ESelenium;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 153;
       int sum = 0;
       
       int temp = n ;
       while(temp > 0)
       {
    	  int temp1 = temp % 10;
    	   sum = sum + (int) (Math.pow(temp1, 3));
    	   temp = temp / 10;
       }
       if(sum == n)
       {
    	   System.out.println("Amstrong");
       }
       else
    	   System.out.println("Not Amstrong");
	}

}
