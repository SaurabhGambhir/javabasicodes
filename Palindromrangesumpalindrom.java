//find sum of palindrom no. in given raqnge and check sum is palindrom or not
import java.util.Scanner;
 class Palindromrangesumpalindrom
{
	public static void main(String[] args) 
	{                                                        
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();

		System.out.print("enter second no  ");
		int z=sc.nextInt();

		int sum=0;
		
		while (a<=z)
		
		{
		
		int rev=0;
		
		int num=a;
		
		int temp=num;

		

		while(num>0)

		{
			int digit=num%10;
		
		    rev=(rev*10)+digit;//this statment will store the reverse value in rev 
			                   // if we write only sop then it will only print thevalue.
			
			num=num/10;

		}
		
		a++;

        if (temp==rev)
		{
            System.out.println(rev+" This no is a palindrom.");
			
		}

		sum=sum+rev;	
		   
		}

		System.out.println(sum+" This is sum of  palindrom nos. in given range.");

		int revsum=0;

		while(sum>0)

		{
			int digitsum=sum%10;

			revsum=(revsum*10)+digitsum;

			sum=sum/10;

		}
		

		if (sum==revsum)
		{
          System.out.println(revsum+" sum of palindrom nos. is palindrom");
		}

		else
			{
				System.out.println(revsum+" sum of palindrom nos. is not palindrom");
			}

	}

}