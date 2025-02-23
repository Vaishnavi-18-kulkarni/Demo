class ArrayOperation
{
	
	public static void setArray(int a[])
	{
		System.out.println("Displaying array");
		for(int i=0;i<a.length;i++)  //displaying array
		{
			System.out.println(a[i]);
		}
	}
	public static void sortAscArray(int a[])
	{
		//int a[]=new int[5];
		for(int i=0;i<a.length;i++)  //soritng logic
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Displaying sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void sumofArray(int a[]) //method for sum of digits
	{
		
		System.out.println("Sum of digits are :");
		int sum;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			int t=a[i];
			while(t!=0)
			{
				
				int rem=t%10;
				sum=sum+rem;
				t=t/10;
				
			}
			
				System.out.print("\t"+sum);
			
		}
	}
	public static void main(String args[])  //main method
	{
		int a[]=new int[]{5732,8659,2534,9625,7354,1325};
		setArray(a);  //functon calling
		sortAscArray(a);
		sumofArray(a);
	}
}
