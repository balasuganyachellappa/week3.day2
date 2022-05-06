package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for  
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	Integer[] arr1={3,2,11,4,6,7};	
	List<Integer> list1=new ArrayList<Integer>();
	list1.addAll(Arrays.asList(arr1));
	System.out.println(list1);
	
	Integer[] arr2= {1,2,8,4,9,7};
	List<Integer> list2=new ArrayList<Integer>();
	
    list2.addAll(Arrays.asList(arr2));
    System.out.println(list2);
	for(int i=0; i< list1.size(); i++)
	{
		for(int j=0;j<list2.size();j++)
		{
			if(list1.get(i)==list2.get(j))
			{
				System.out.println(list1.get(i));
				break;
			}
		}
		
		
}
}
}

