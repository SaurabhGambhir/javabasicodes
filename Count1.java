import java.util.Scanner;
class Count1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();
                                              //scanner and initialization and declaration
		System.out.print("enter second no  ");
		int b=sc.nextInt();

		int ecount=0;
		int ocount=0;                                                                                                                                                                                                                                                                                      

	//------------------------------------------------------------------	
		for (int i=a; i<=b ;i++ )
		{
			if(i%2==0)
			{
			   System.out.println(i+" Is even no");
			   ecount++;//5
			}
		}
             for (int i=a; i<=b ;i++ )                 // finding  even odd no  in given range       
                                                         //counting the even and odd no
		    {
			  if(i%2!=0)
                                                        
			   {
				System.out.println(i+" Is odd no");
				ocount++;//5
			   }
			
			}

  //-----------------------------------------------------------------------      
		System.out.print(ecount+"it is a count of even no");
		if (ecount%2==0)
		{
          System.out.println("count of even no is even");
		}
                                                          //checking count of even no in range is even or odd
		else
    	{
		   System.out.println("count of even no is odd");	
		}
        
//-----------------------------------------------------------------------------		
		
		System.out.print(ocount+"it is a count of odd no");
		if (ocount%2==0)
		{
          System.out.println("count of odd no is even");
		}
                                                         //checking count of odd no in range is even or odd
		else
		{
		  System.out.println("count of odd no is odd");	
		}
	}
}
//-----------------------------------------------------------------------------
