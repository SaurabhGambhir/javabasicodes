//
class arraycountdigiteachindex 
{
	public static void main(String[] args) 
	{

		int arr[]={11,25,654,888,1234,6,745};
		for (int i=0;i<arr.length ;i++ )
		{
			int num=arr[i];
			int count=0;

			while(num>0)
			{
				count++;
				num=num/10;
			}
		
		System.out.println(" index  "+i+"  number of digits  "+count);
		}
	}
}
