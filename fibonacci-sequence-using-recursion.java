import java.util.Scanner;

public class MainProject 
{
	static int[] array =null;
	
	public static int process(int n)
	{
		if((array[n])==0 && n>1)
			
		{
			array[n]=(process(n-1))+(process(n-2));
		}
		else
		{
			return array[n];
		}
			
		return array[n];
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		array=new int[N+1];
		array[0]=0;
		array[1]=1;
		process(N);
		System.out.println(array[N]);

	}

}
