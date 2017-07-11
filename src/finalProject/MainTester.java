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
		int[] list = new int[100001];
		int[] list1 = list;
		int[] list2 = list;
		int[] list3 = list;
		
		List<Integer> list3Array = new ArrayList<Integer>();
		
		
		Random r = new Random();
		
		BubbleSort bubbleSort = new BubbleSort();
		MergeSort mergeSort = new MergeSort();
		InsertionSort insertionSort = new InsertionSort();
		
		BinarySearch binarySearch = new BinarySearch();
		LinearSearch linearSearch = new LinearSearch();
		
		System.out.println("Building data..." + "\n");
		
		for(int i = 0; i < 100000; i++)
		{
			list[i] = r.nextInt();
		}
		
		for(int i = 0; i < 100000; i++)
		{
			list1[i] = list[i];
			list2[i] = list[i];
			list3Array.add(i);
			
		}
		
		list[100000] = 900;
		list1[100000] = 900;
		list2[100000] = 900;
		
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
		mergeSort.merge(list2, 0, list.length/2, list.length - 1);
		timeAfter = System.currentTimeMillis();
		System.out.println("Merge Sort took: " + (timeAfter - timeB4) + "ms" + "\n");
		
		
		System.out.println("Binary Search....");
		
		timeB4 = System.currentTimeMillis();
		Collections.sort(list3Array);
		System.out.println("Found at position " + binarySearch.binarySearch(list3Array, 900));
		timeAfter = System.currentTimeMillis();
		System.out.println("Binary Search took: " + (timeAfter - timeB4) + "ms");
		
		
		System.out.println("Linear Search....");
		
		timeB4 = System.currentTimeMillis();
		System.out.println("Found at position " + linearSearch.search(list, 900));
		timeAfter = System.currentTimeMillis();
		System.out.println("Linear Search took: " + (timeAfter - timeB4) + "ms");
		
		
	}

}
