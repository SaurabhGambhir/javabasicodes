//waptd count the prime palindrome numbers in user given range and check the count is prime or not.
import java.util.Scanner;
class primepalindromnocountprimenot
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Starting number");
		int a=sc.nextInt();

		System.out.println("Enter the last number");
		int z=sc.nextInt();

		int ppcount=0;
        
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
			   ppcount++;
           }
         }
			a++;
		}
          System.out.println(ppcount+"This is a count of prime palindrom numbers in given range");

		  int x=2;
		while (ppcount>=x)//5>=5-->true
		{
			if (ppcount%x==0)//5%5==0-->true
			{
				break;//
			}
			x++;//5

		}
		if (ppcount==x)
		{
           System.out.println(ppcount+"  count of prime palidrom numbers is prime no  ");
		}

		else
			{
				System.out.println(ppcount+"  count of prime palidrom numbers is not prime no  ");
			}

	}
}
