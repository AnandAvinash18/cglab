import java.util.*;


public class Lab6Exe5 {
    

    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of Array");
		int a=sc.nextInt();
		Integer ar[]=new Integer[a];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res=getSecondSmallest(ar);
		System.out.println("Second Smallest element:"+res);
    }
    public static int getSecondSmallest(Integer[] arr)
    {
  	
  	List<Integer> al=Arrays.asList(arr);
  	Collections.sort(al);
  	int smallest= al.get(1);
  	return smallest;
  	  
    }
	}