package IshanRepo.E2ESelenium;

public class ReversePrime {
 public static void main(String [] args) {
	 int n = 7;
		boolean flag = true;
	for(int i = n; i>1 ; i--)
	{
		for(int j = i/2 ;j>=1;j--)
		{
			if(i%j==0)
			{
			  flag = false;	
			  break;
			}
			else
			  flag = true;
		}
		
		if(flag==true)
		{
			System.out.println(i);
		}
	}
 }
}
