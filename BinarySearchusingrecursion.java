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
	  public static int binarysearch(int[] arr, int start, int end, int element )
	  {
		  int mid=((start+end)/2);
		  if(arr[mid]==element)
		  {
			  return mid;
		  }
		  else if(element>arr[mid]){
			 return binarysearch(arr,mid+1,arr.length,element);
		  }
		  else if(element<arr[mid])
		  {
			  return binarysearch(arr,0,mid-1,element);
		  }
		return -1;
	  }
	  
	  public static void main(String[] args) 
	  {
	     int[] arr={2,3,4,10,40};
	     int element=10;
	     int result= binarysearch(arr,0,((arr.length)-1),element);
	     System.out.println(result);
		  
	  }
		
	
		
	}

