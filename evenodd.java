class Evenodd 
{
	public static void main(String[] args) 
	{   
		int a=-24;
		int b=25;
		int result= a && b%2==0? (a+b) : (a*b); 
		System.out.println("result is --->"+result);
	}
}
