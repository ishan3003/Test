package IshanRepo.E2ESelenium;

import java.util.ArrayList;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "aaabaa";
      char a1[] = a.toCharArray();
      ArrayList <Character> arr = new ArrayList<Character>();
      
      for(int i=0;i<a1.length;i++)
      {   int k= 0;
    	  if(!arr.contains(a1[i]))
    	  {
    		  
    		arr.add(a1[i]);
    		k++;
    		for(int j=i+1;j<a1.length;j++)
    		{
    			if(a1[i]==a1[j])
    			{
    				k++;
    			}
    		}
    	  }
    	  else
    		  continue;
    	  System.out.println("Character "+a1[i]+" is printed "+k+" Times ");
      }
	
	}
}