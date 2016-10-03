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
	
	  public static void main(String[] args) 
	  {
	     int[] arr={2,3,4,10,40};
	     int element=10;
	     int start=0;
	     int end=arr.length;
	     int mid=0;
	     while(start!=end)
	     {
	    	 mid=(start+end)/2;
	    	 if(arr[mid]==element)
	    	 {
	    		 System.out.println(mid);
	    		 break;
	    	 }
	    	 else if(element>arr[mid])
	    	 {
	    		 start=mid+1;
	    	 }
	    	 else if(element<arr[mid])
	    	 {
	    		 end=mid;
	    	 }
	    	
	     }
	     
		  
	  }
		
	
		
	}