import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mainprogram 
{	
	
	public static int minimum(int[] arr,int start,int end)
	{ 		int index=0;
	int min=Integer.MAX_VALUE;
		 for(int i=start;i<arr.length;i++)
		  {
			 if(min>arr[i])
			 {
				min=arr[i];
				index=i;
			 }
		  }
		 return index;
	}
	
	
	
	  public static void main(String[] args) 
	  {
		  int[] arr={64,25,12,22,11};
		  int start=0;
		  int counter=0;
		  while(counter!=arr.length)
		  {	  
			  int index= minimum(arr,counter,arr.length);
			  int temp=arr[counter];
			  arr[counter]=arr[index];
			  arr[index]=temp;
			  counter++;
			  
			  
		  }
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i]);
		  }
		  
		  
		 
		  
	  }

	}