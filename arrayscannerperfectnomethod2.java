//waptd print the perfect no from user enterd array by method
import java.util.Scanner;
class arrayscannerperfectnomethod2  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];

		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}
        
         System.out.println("perfect no in array are");
		for (int i=0;i<a.length ;i++ )

		{
			if (perfct(a[i]))
			{
				System.out.println(a[i]+"  ");
			}
		}

	}


		public static boolean perfct(int num)
		{
			int sum=0,i=1;

			while (num>i)
			{
				if (num%i==0)
				{
					sum=sum+i;
				}
				i++;
			}

			if (sum==num)
				return true;
			else
				return false;
		}
	
}


		