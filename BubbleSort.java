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
		 int[] arr={5,1,4,2,8};
		 int counter=0;
		 while(counter!=-1)
		 {
			 counter=-1;
			 for(int i=0;i<(arr.length-1);i++)
			 {
				 if(arr[i]>arr[i+1])
				 {
					 int temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=arr[i];
					 counter++;
				 }
			 }
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	  }

	}
