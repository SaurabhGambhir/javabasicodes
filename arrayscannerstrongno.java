//waptd print all the strong no from user entered array.
import java.util.Scanner;
class arrayscannerstrongno  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];
            
		for (int i=0; i<size; i++ )//0
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();//a[4]
		}

		//System.out.println("values of array\n");
         System.out.println(" This are strong nos in given array ");       
		for (int i=0;i<size ;i++ )
		{
            if (strong(a[i]))
            {
              System.out.println(" "+a[i]+" ");
            }
	    }
      }


    public static boolean strong (int a)
	{
		int temp=a;
		int sum=0;
		int num=0;

	while(a>0)
		{
		    int dig=a%10;
           // int fact=factorial(dig);
		   int fact=1;
		 for (int i=1; i<=dig; i++ )
		 {
			fact=fact*i;//24=24*1
		 }
			sum+=fact;
			a=a/10;
		}

		if (sum==temp)
		return true;
		else
		return false;
	}

}
