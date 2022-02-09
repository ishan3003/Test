package IshanRepo.E2ESelenium;

import java.util.StringTokenizer;

public class String_Tokenizer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hi Ishan How Are You ?";
		
		StringTokenizer s = new StringTokenizer(a," ");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}

	}

}
