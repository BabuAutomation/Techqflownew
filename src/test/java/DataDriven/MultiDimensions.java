package DataDriven;

public class MultiDimensions {

	public static void main(String[] args) {
	
		
		int[][] a=new int[3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;	
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		/*for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
			{
				System.out.println(a[r][c]);
			}
		}*/
		
		for(int []x:a)
		{
			for(int v:x)
			{
				System.out.println(v);
			}
		}

	}

}
