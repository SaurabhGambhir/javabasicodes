//check Entered no is prime no or not
/*import java.util.Scanner;
class Primeno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter no  ");
		long a=sc.nextInt();//5

		long i=2;

		while (a>=i)//5>=5-->true
		{
			if (a%i==0)//5%5==0-->true
			{
				break;//
			}
			i++;//5

		}
		if (a==i)
		{
           System.out.println(a+"  Entered  no is prime no  ");
		}

		else
			{
				System.out.println(a+"  Entered  no is not prime no  ");
			}

	}

}*/
//sqrt approch for reducing time complexity to squrt of the given no.
//
import java.util.Scanner;
class Primeno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter no  ");
		long a=sc.nextInt();//5

		long i=2;
        int temp=0;
        
        while (a>=i*i)
        {
           if (a%i==0)
           {
             temp=1; 
             break;
           }
           else
          { 
           i+=1;
          }
       }

    if (temp==1)
      {
      System.out.println("entered no is not prime");
      }
    else
    {
    System.out.println("entered no is prime");
    }
  }
}
//
