import java.util.Scanner;
import java.util.Arrays;
class MultidimentionalArrays 
{
      
	public static void main(String[] args) 
{
	/* 1 2 3
       4 5 6
       7 8 9 
    */
   //   datatype[][] ref_variable = new datatype [rows][coloums]//entering no. of rows is compulsory but entering no. of coloums are not.
   

    int[][] arr= new int [3][3];   
Scanner sc=new Scanner(System.in);
    //INPUT    
        for (int row=0; row<arr.length; row++ )
        {// for each coloumn in every row
           for (int col=0; col<arr[row].length; col++  )
           {
                arr[row][col]=sc.nextInt();
           }
        }


      

        //OUTPUT   
   /*     for (int row=0; row<arr.length; row++ )
        {// for each coloumn in every row
           for (int col=0; col<arr[row].length; col++)
           {
                System.out.print(arr[row][col]+"  ");
           }
          System.out.println("");
        }*/

  /*       for (int row=0; row<arr.length; row++ )
        {
           System.out.println(Arrays.toString(arr[row]));//another way to print
        }*/

           for(int[] a : arr )
           {
			System.out.println(Arrays.toString(a));

           }
}
}