//count the prime no from user given range and check the count is prime or not by using method.
//waptd count the prime no from given array and check the count is prime or not byn using methods.
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
		     boolean result =prime(start);
			
			 if (result==true)
			 {
				 count++;
				  System.out.println(start);
			 }

            start++;
		  }
		  System.out.println("count of prime no is"+count);

		 boolean result2 = prime(count);

		 if(result2==true)
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
