//waptd check the user given number is prime as well as palindrom or not.
import java.util.Scanner;
class Primepalindromno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter no  ");
		int a=sc.nextInt();//

		int i=2;

		while (a>=i)//
		{
			if (a%i==0)//
			{
				break;//
			}
			i++;//

		}
	if (a==i)
	{
           System.out.println(a+"  Entered  no is prime no  ");
           
		   int x=a;
		   int rev=0;
		
		   int temp=a;

		

		while(a>0)

		{
			int digit=a%10;
		    rev=(rev*10)+digit;
			
			a=a/10;

		}
		
        if (temp==rev)
		{
            System.out.print(x+"  Entered no is a palindrom.");
		}
		else
		{
			System.out.print(x+"  Entered no is not a palindrom.");
		}
	}

	else
	{
				System.out.println(a+"  Entered  no is not prime no  ");

				int x=a;

				 int rev=0;
		
		         int temp=a;

				while(a>0)

		{
			int digit=a%10;
		    rev=(rev*10)+digit;
			
			a=a/10;
		}
		
             if (temp==rev)
		    {
            System.out.print(x+"  Entered no is a palindrom.");
		    }
		    else
		    {
			System.out.print(x+"  Entered no is not a palindrom.");
		    }
	}

 }
}
