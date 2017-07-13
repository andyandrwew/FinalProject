package finalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainTester
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] list = new int[200000];
		int[] list1 = list;
		int[] list2 = list;
		int[] list3 = list;
		
		
		int searchNum = 9;
		
		int minRange = 0;
		int maxRange = list.length;
			
		
		Random r = new Random();
		
		System.out.println("Building data..." + "\n");
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = r.nextInt((maxRange - minRange) + 1) + minRange;
		}
		
		for(int i = 0; i < list.length; i++)
		{
			list1[i] = list[i];
			list2[i] = list[i];
			list3[i] = list[i];			
		}
		
		
		System.out.println("Insertion Sort....");

		
		long timeB4 = System.currentTimeMillis();
		InsertionSort.sort(list1);
		long timeAfter = System.currentTimeMillis();
		System.out.println("Insertion Sort took: " + (timeAfter - timeB4) + "ms");
		
		
		System.out.println("Bubble Sort....");
		
		timeB4 = System.currentTimeMillis();
		BubbleSort.bubbleSort(list);
		timeAfter = System.currentTimeMillis();
		System.out.println("Bubble Sort took: " + (timeAfter - timeB4) + "ms");
		
		System.out.println("Merge Sort....");

		
		timeB4 = System.currentTimeMillis();
		MergeSort.sort(list2);
		timeAfter = System.currentTimeMillis();
		System.out.println("Merge Sort took: " + (timeAfter - timeB4) + "ms" + "\n");
		
		
		System.out.println("Linear Search....");
		
		timeB4 = System.currentTimeMillis();
		System.out.println("Found at position " + LinearSearch.search(list3, searchNum));
		timeAfter = System.currentTimeMillis();
		System.out.println("Linear Search took: " + (timeAfter - timeB4) + "ms");		
		
		
		System.out.println("Binary Search....");
		
		timeB4 = System.currentTimeMillis();
		Arrays.sort(list3);
		int position = Arrays.binarySearch(list3, searchNum);
		timeAfter = System.currentTimeMillis();
		if (position < 0)
		{
			position = -1;
		}
		System.out.println("Found at position " + position);
		System.out.println("Binary Search took: " + (timeAfter - timeB4) + "ms");
		
	}

}

