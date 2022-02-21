
public class Lab6Exe7 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int n=5;
		int[] r=reverseArray(ar,n);
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);}      

	}
	public static int[] reverseArray(int[] input1, int input2)
	{
		int [] ars=new int[input2];
		int k=0;
		for(int i=input2-1;i>=0;i--)
		{
			ars[k]=input1[i];
			k++;
		}
		return ars;
		
	}
}


