//waptd palindrom numbers from the EVEN index and prime no from odd index.
import java.util.Scanner;
class arrayscannerpalindromevenindexprimeoddindex 
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
		}

	for (int i=0;i<a.length ;i++ )     // printing index
    {
		// System.out.println(a[i]+" index is even  ");                   
			                                                              
		 System.out.println("This are palindrom nos.from even index in given array  ");
                                                                 
																 //----->palindrom no in array start
		 for (i=0;i<a.length ;i++ )
		 {
			 if (i%2==0)                                        // select even index values
			 {
			 
			 int rev=0;
		     int temp=a[i];//

		          while(a[i]>0)
		       {
			       int digit=a[i]%10;//
		           rev=(rev*10)+digit;//
			       a[i]=a[i]/10;//
		        }

				if (temp==rev)
				{
                   System.out.print(rev+"  ");
				}

			 }
		   
		  
		                                                                                //------>palindrom no in array end.
		   }

           System.out.println("");

		   System.out.print("This are prime nos.from odd index in given array  ");
                                                                 
																 
		 for (i=0;i<a.length ;i++ )
		 {
			 if (i%2!=0)                                            //select odd index values                                 
			 {
			     int x=2;                                          //----->prime no in array start

		                   while (a[i]>=x)//5>=5-->true
		                   {
			                  if (a[i]%x==0)//5%5==0-->true
			                   {
				                 break;//
			                    }
			                   x++;//5

		                   }
		      if (a[i]==x)
		      {
                  System.out.println(a[i]+"  Entered  no is prime no  ");
		      }

		     

			 }
		   
		  
		                                                                                //------>prime no in array end.
		   }

	}

	}
  }
