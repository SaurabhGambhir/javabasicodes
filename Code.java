import java.util.Scanner;

class Code 
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();

      for (int i=1;i<=x ;i++ )
      {
         if (true)
         {
             for (int j=1;j<=i ;j++ )
             {   
                 if(i==j)
                 {     for (int m=1;m<=j;m++ )                
                      {System.out.println(i+"*"+j);}
                 }
             }
        }
         //else
		 //{System.out.println(i);}
      }

      
       for (int q=x;q<=1 ;q--)
      {   
         if (q!=1)
         {   
             for (int w=1;w<=q;w++)
             {   
                 if(q==w)
                 {     for (int m=1;m<=w;m++ )                
                      { 
                        System.out.println(q+"*"+w);
                       }
                 }
             }
        }
         else
		 System.out.println(q);
         

      }
		//System.out.println("Hello World!");
	
}

}
