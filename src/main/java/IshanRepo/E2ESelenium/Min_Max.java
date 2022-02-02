package IshanRepo.E2ESelenium;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] a ={ {2,4,5},{3,4,7},{1,2,9}};
    int  min;
    min = a[0][0];
    
    for(int i=0;i<a.length;i++) {
    	
    
    	for(int j=0;j<a[i].length;j++)
    	{
    		if(min<a[i][j])
    		{
    			min = a[i][j];
    		}
    	}
	}
    System.out.println(min);
	}
}
