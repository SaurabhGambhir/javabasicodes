class method
{
	public static void main(String[] args) 
	{
		System.out.println("Main method starts");

         add(10,20);//--------->calling method
		 mul(30,99);//--------> calling mul method
		 prime(5);//---------> calling prime method
		prime(6);

		palindrom(101);//--------> palindrom method calling
		System.out.println("Main method ends");
	}

	public static void add(int a, int b)  ///------------------> addition method
	{
		int c=a+b;

         System.out.println("Sum = "+c);

	}

	public static void mul(int d, int e) //----------------->multiplication method
	{
		int m=d*e;

         System.out.println("multiplication = "+m);

	}

	public static void prime(int p)   ///---------------->prime no method
	{
		int i=2;

		while (p>=i)//5>=5-->true
		{
			if (p%i==0)//5%5==0-->true
			{
				break;//
			}
			i++;//5

		}
		if (p==i)
		{
           System.out.println(p+"  Entered  no is prime no  ");
		}

		else
			{
				System.out.println(p+"  Entered  no is not prime no  ");
			}

	}

			public static void palindrom(int pal)
	        {
		         int rev=0;
		
		        int temp=pal;

		

		         while(pal>0)

		{
			int digit=pal%10;
		rev=(rev*10)+digit;//this statment will store the reverse value in rev 
			                   // if we write only sop then it will only print thevalue.
			
			pal=pal/10;

		}
		System.out.print(rev);
		

        if (temp==rev)
		{
            System.out.print("entered no is a palindrom.");
		}
		else
		{
			System.out.print("entered no is not a palindrom.");
		}




	         }


	}

