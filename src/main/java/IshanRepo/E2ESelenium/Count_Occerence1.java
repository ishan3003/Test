package IshanRepo.E2ESelenium;

public class Count_Occerence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "aaaaab";
      char a[] = s.toCharArray();
      
      int k = 0;
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]=='a')
    	  {
    	   k++;	  
    	  }
      }
      System.out.println(k);
      
	}

}
