class FirstClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method starts from firstClass");
	
	run();//calling statment.

	SecondClass.walk();//calling statment of walk method from second class

	SecondClass.main(null);//calling statment of main method from second class
	                       //	for calling main method from other class we need to pass some value (null, string, number, etc)

						  // CammandLineArgument.main();

        System.out.println("Main method ends from firstClass");
	
	}


	public static void run()//called statment
	{
		System.out.println("run method from firstClass");

	}

}

class SecondClass
{

	public static void main(String []args)
 {
      System.out.println("Main method starts from SecondClass ");

	 // walk();

     System.out.println("Main method ends from SecondClass ");
 }
	 public static void walk()
	{
		System.out.println("walk method from SecondClass");
	}

  
}


class CammandLineArgument 
{
	public static void main(String[] arr) 
	{
		for (int i=0; i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
		
	}
}

//if we dont have main method in second class and executing the firsrClass then we dont get any error.
// if we execute the class which dont have any main method then we will get compile time error because JVM search for main method first.




                              //if we write private then we call this method only in that class only
	                          // if we call it in another class then it will throw error
							  // thats why method should be public so we can call it in any class we want.