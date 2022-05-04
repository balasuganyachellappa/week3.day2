package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions  in java week1";
		String[] arr=text.split(" ");
		List<String> text1 =new ArrayList<String>();
		text1.addAll(Arrays.asList(arr));
		System.out.println("Printing as list-----> "+text1);
		Set<String> text2=new LinkedHashSet<String>();
		text2.addAll(text1);
		System.out.println("Priniting as set----->"+text2);
			}
		
		
	}
	
	


