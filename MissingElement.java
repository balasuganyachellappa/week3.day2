package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class MissingElement {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,7,6,8};
		List<Integer> list1=new ArrayList<Integer>();
		list1.addAll(Arrays.asList(arr));
		Collections.sort(list1);
		System.out.println(list1);
		for(int i=0;i<list1.size()-1;i++)
		{
			if(list1.get(i)!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
