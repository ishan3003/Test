package IshanRepo.E2ESelenium;

import java.util.ArrayList;
import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s1 ="anish";
            String s2 ="ishan";
            
            char c[] = s1.toCharArray();
            char d[] =s2.toCharArray();
            
            Arrays.sort(c);
            Arrays.sort(d);
            
            if(Arrays.equals(c, d))
            {
            	System.out.println("Anagram");
            }
            else
            	System.out.println("Not Anagram");
	}

}
