//reverse array without CHANGING THE CONDITION IN FOR LOOP
class arrayrevwithoutchangingfor
{
	public static void main(String[] args) 
	{//          0  1  2  3  4  5  6  7
		int a[]={10,11,12,13,14,15,16,17};
		
		System.out.println("size"+a.length);

		System.out.println("index size"+(a.length-1));

		System.out.println(a[6]);

		System.out.println(a[1]);

		//System.out.println(a[8]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
                                                    //at array.main(array.java:15)
          

		 a[5]=99;

		 for (int i=0; i<a.length; i++ )
		 {//                       [(7-1)-0]
				 System.out.print(a[(a.length-1)-i]+"  ");
			 
		 }

	}
}

