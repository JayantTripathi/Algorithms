import java.util.ArrayList;
import java.util.Scanner;

public class MainProject 
{
	
	public static void main(String[] args)
	{
		System.out.println("Activity Selection Problem");
		int[] start={1,0,1,4,2,5,3,4};
		int[] finis={3,4,2,6,9,8,5,5};
		
		for(int i=0;i<finis.length;i++)
		{
			for(int j=0;j<finis.length;j++)
			{
				if(finis[i]<finis[j])
				{
					int temp=finis[j];
					finis[j]=finis[i];
					finis[i]=temp;
					
					temp=start[j];
					start[j]=start[i];
					start[i]=temp;
				}
			}
		}
		int j=0;
		ArrayList<Integer> index=new ArrayList<Integer>();
		for(int i=1;i<finis.length;i++)
		{
			if(finis[j]<=start[i])
			{
				//index.add(j);
				j=i;
				//i=j;
				
			}
			if(!(index.contains(j)))
			{
				index.add(j);
			}
				
			
		}
		
		System.out.println(index.toString());		

	}

}
