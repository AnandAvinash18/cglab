import java.util.*;
class Exercise3
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int n = sc.nextInt(); 
		int arr [] = new int[n];
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the  array");
		arr[i]=sc.nextInt();
		}

		int[] a = getSorted(arr);
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}
		public static int[] getSorted(int[] arr)
	{
		int[] rev=new int[arr.length];
		int j=0;
		for (int i=arr.length-1; i>=0; i--) 
		{
			rev[j]=arr[i];	
			j++;
		}
		return rev;
	}
}