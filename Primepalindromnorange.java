//waptd print the prime palindrom number from the user given range
import java.util.Scanner;
class primepalindromnorange
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Starting number");
		int a=sc.nextInt();

		System.out.println("Enter the last number");
		int z=sc.nextInt();
        
		System.out.println(" This are prime as well as palindrom numbers in given range.");
		while (a<=z)
		{
			int temp=a;
			int rev=0;

			while (temp>0)
			{
				int digit=temp%10;
				rev=(rev*10)+digit;
				temp=temp/10;
			}
          if (rev==a)
          {
			 int x=0;

			  for (int i=2;i<a ;i++ )
			  {
				  if (a%i==0)
				  {
                     x=1;
					 break;
				  }
			  }
           if (x==0)
           {
			   System.out.println("  "+a);
           }
         }
			a++;
		}
	}
}