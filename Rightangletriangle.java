class  Rightangletriangle
{
	public static void main(String[] args) 
	{
		pattern0110(10);
	}

       public static void pattern1(int n)
    {
      for (int row=0; row<=n; row++ )
      {
         for (int col=1; col<=row ; col++)
         {
             System.out.print("* "); 
         }
         System.out.println(" ");
      }
    }    


          public static void pattern0110(int n)
    {
      for (int row=0; row<=n; row++ )
      {
          char ch='A';
         for (int col=0; col<row ; col++)
         {
            System.out.print(ch++ +" "); 
             
         }
         System.out.println(" ");
      }
    }    
}
