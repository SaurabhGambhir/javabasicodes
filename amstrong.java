//waptd check the user given value is amstrong no or not.
import java.util.Scanner;
class  amstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();		

		System.out.print("enter first no  ");
		int b=sc.nextInt();		
		
		System.out.println("amstrong no in given rage are ");
		for (int i=1; i<=b; i++ )
		{
			if (armstrong(i))
		System.out.println(i+" ");
		//else
       // System.out.print(i+" is not armstrong number.");

		}
		
		
	}

	public static boolean armstrong(int a )
	{   int b=a;
	    int temp=a;
		int sum=0;
		int count=0;

		while(a>0)//1

		{
			int digit=a%10;//1%10=1
			 
             count++;
			a=a/10;//12/10=

		}
		while(b>0)//1
		{
			int digit=b%10;//1%10        
			b=b/10;//12/10=
			int power=pow(digit,count);
			sum =sum+power;

		}

		if (temp==sum)
		return true;
		return false;
		
		
	}

	public static int pow(int num ,int power)
	{
		 int result=1;

		while(power>0)//0>=0
		{
			result=result*num;// 16=8*2
			power--;//-1
		}
		return result;
	}
}
