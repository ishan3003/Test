package IshanRepo.E2ESelenium;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hi Ishan How Are You ?";
		
		StringTokenizer s = new StringTokenizer(a," ");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
		
		
		String b = "Hi Anish How Are You ?";
		String ab[] = b.split(" ");
		for(int i = 0; i<ab.length;i++)
		{
			System.out.println(ab[i]);
		}

	}

}
