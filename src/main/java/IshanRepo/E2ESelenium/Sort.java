package IshanRepo.E2ESelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,1,4,2,6};
		
	int	smallest = a[0];
	int temp ;
	
	for (int i = 0; i<a.length;i++)
	{
		if(smallest>a[i])
		{
			temp = smallest;
			smallest = a[i];
			a[i] = temp;	
		}
		
	}
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	System.out.println(al);

}
}