package IshanRepo.E2ESelenium;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "radar";
      String reverse = "" ;
      for(int i=s.length()-1;i>=0;i--)
      {
    	  reverse = reverse + s.charAt(i);
    	  
      }
      if(s.equals(reverse)) {
    	  System.out.println("Palindrome");
      }
      else
      System.out.println("Not Pallindrome");
}
}
