  //waptd count the prime palindrom from the given array andcheck the count is palindrom or not
import java.util.Scanner;
class arrayprimepalindromcountcheckpalindromnot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];

		for (int i=0; i<size; i++ )
		{
			System.out.print("Enter the value in "+i+"index: ");
			a[i]=sc.nextInt();
		}                                        //-------

		int ppcount=0;

	 for (int i=0;i<=(a.length-1) ;i++ )
		{ 

                                                              
		int j=2;

		while (a[i]>=j)//
		{
			if (a[i]%j==0)//
			{
				break;//
			}
			j++;//

		}
	if (a[i]==j)
	{
           //System.out.println(a[i]+"  Entered  no is prime no  ");
           
		   int x=a[i];
		   int rev=0;
		
		   int temp=a[i];

		

		while(a[i]>0)

		{
			int digit=a[i]%10;
		    rev=(rev*10)+digit;
			
			a[i]=a[i]/10;

		}
		
        if (temp==rev)
		{
            System.out.println(x+"  Entered no is a palindrom and prime.");
			ppcount++;
		}
	}

		}

     
	       System.out.println(ppcount+" is count of  palindrom prime number ");
            
			 int x=ppcount;
		     int rev=0;
		
		     int temp=ppcount;
		

		while(ppcount>0)

		{
			int digit=ppcount%10;
		    rev=(rev*10)+digit;
			
			ppcount=ppcount/10;

		}
		
        if (temp==rev)
		{
            System.out.println(x+"  Entered no is a palindrom ");
			ppcount++;
		}

	
	}

}
