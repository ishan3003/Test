package IshanRepo.E2ESelenium;

public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,4,5,12,14};
        int diff = 0;
        
        for(int i=0; i<a.length-1;i++)
        {
        	int diff_betweem_two = a[i+1]-a[i];
        	if(diff_betweem_two > diff)
        	{
        		diff = diff_betweem_two;
        	}
        		
        }
        		
	System.out.println(diff);
	}

}
