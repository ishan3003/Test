package IshanRepo.E2ESelenium;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10 ;
		int a[] = new int[n+1];
		a[0]= 0;
		a[1]=1;
		
		for(int i=2;i<n;i++) {
			a[i] = a[i-2] +a[i-1];	

	}
		for(int j = 0;j<n;j++) {
			System.out.println(a[j]);
		}
}
}
