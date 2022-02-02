package IshanRepo.E2ESelenium;

import java.util.ArrayList;

public class Samearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,5,7};
		int[] b = {6,4,3,7};
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					a1.add(a[i]);
				}
			}
		}
		System.out.println(a1);
	}

	}


