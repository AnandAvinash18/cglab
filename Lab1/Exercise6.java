import java.util.*;

class Exercise6
{   
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
		int n = sc.nextInt();

		int res = calculateDifference(n);
		System.out.println("Difference is :"+res);
	}
	public static int calculateDifference(int n)
	{
		int sumOfSquare = (n*(n+1)*(2*n+1))/6;
		int sum = (n*(n+1))/2;
		int squareSum = sum +sum;
		return Math.abs(sumOfSquare - squareSum);
	}
}