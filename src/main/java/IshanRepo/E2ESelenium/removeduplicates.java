package IshanRepo.E2ESelenium;

import java.util.ArrayList;
import java.util.Arrays;

public class removeduplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s = "abccd";
 char c[] =s.toCharArray();
 int count = 0;
 ArrayList <Character> arr= new ArrayList<Character>();
 for(int i = 0;i<c.length;i++) {
	 if(!arr.contains(c[i]))
	 {
		arr.add(c[i]);
	 }
    for(int j=i+1;j<c.length;j++)
    {
    	if(c[i]==c[j])
    	{
    	  	continue;
    	}
    		
    }
    	
      
	}
 System.out.println(arr); 

}
 
}
