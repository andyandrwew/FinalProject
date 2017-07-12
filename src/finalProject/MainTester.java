package finalProject;

import java.util.ArrayList;
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
		
		List<Integer> list3Array = new ArrayList<Integer>();
		
		
		Random r = new Random();
		
		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();
		
		
		System.out.println("Building data..." + "\n");
		
		for(int i = 0; i < 200000; i++)
		{
			list[i] = r.nextInt();
		}
		
		for(int i = 0; i < 200000; i++)
		{
			list1[i] = list[i];
			list2[i] = list[i];
			list3[i] = list[i];
			list3Array.add(i);
			
		}
		
		
		System.out.println("Insertion Sort....");

		
		long timeB4 = System.currentTimeMillis();
		insertionSort.sort(list1);
		long timeAfter = System.currentTimeMillis();
		System.out.println("Insertion Sort took: " + (timeAfter - timeB4) + "ms");
		
		
		System.out.println("Bubble Sort....");
		
		timeB4 = System.currentTimeMillis();
		bubbleSort.bubbleSort(list);
		timeAfter = System.currentTimeMillis();
		System.out.println("Bubble Sort took: " + (timeAfter - timeB4) + "ms");
		
		System.out.println("Merge Sort....");

		
		timeB4 = System.currentTimeMillis();
		MergeSort.sort(list2);
		timeAfter = System.currentTimeMillis();
		System.out.println("Merge Sort took: " + (timeAfter - timeB4) + "ms" + "\n");
		
		System.out.println("Binary Search....");
		
		timeB4 = System.currentTimeMillis();
		Collections.sort(list3Array);
		System.out.println("Found at position " + BinarySearch.binarySearch(list3Array, 900));
		timeAfter = System.currentTimeMillis();
		System.out.println("Binary Search took: " + (timeAfter - timeB4) + "ms");
		
		System.out.println("Linear Search....");
		
		timeB4 = System.currentTimeMillis();
		System.out.println("Found at position " + LinearSearch.search(list3Array, 900));
		timeAfter = System.currentTimeMillis();
		System.out.println("Linear Search took: " + (timeAfter - timeB4) + "ms");		
		
	}

}
