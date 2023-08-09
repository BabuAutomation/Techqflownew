package DataDriven;

public class Arrays {

	public static void main(String[] args) {
		
		int[] a=new int [5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a.length);
		
		// for specific value print
		
		for(int i=0;i<2;i++)
		{
			System.out.println(a[i]);
		}
		
		
		// for all values to print
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
				
				
				
				
		
		

	}

}
