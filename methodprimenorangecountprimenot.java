//count the prime no from user given range and check the count is prime or not by using method.

import java.util.Scanner;
class methodprimenorangecountprimenot 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);

		System.out.println(" Enter First no  ");
		int start=sc.nextInt();//3

		System.out.println(" Enter Second  no  ");
		int end=sc.nextInt();//10

		int count=0;
          while (start<=end)
          {          
		    // boolean result =prime(start);// instade of storing output of prime method
		                                   //in another variable we will put prime(count) in if condition.
			
			 if (prime(start))            
			 {
				 count++;
				  System.out.println(start);
			 }

            start++;
		  }
		  System.out.println("count of prime no is"+count);

		 //boolean result2 = prime(count);// instade of storing output of prime method
		                                   //in another variable we will put prime(count) in if condition.

		 if(prime(count))
		{
			 System.out.println("count of prime no is prime");	
		}
		else
		{
			System.out.println("count of prime no is not prime");
		}

	}
     public static boolean prime(int num)
     {
            int x=2;

			while (num>=x)//3>=2--->true
			{
		
			   if (num%x==0)//
			  {
				break;//
			  }
			    x++;
		    }

           if (num==x)
			{
                return true;
			}

		   else
			{
			    return false;
			}
	}

}
