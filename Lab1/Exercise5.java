public class Exercise5  
{  
public static void main(String[] args)   
{  
int res= calculateSum(100);
System.out.println("Sum=" + res);  
}  
public static int calculateSum(int n)
	{
	int sum=0;
	for(int i=1;i<=n;i++)
		{
			if(i%3 == 0 || i%5 == 0) 
			sum = sum + i;	      
			i++;  
		}  
	return sum;
	}
}  