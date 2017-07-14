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
		//modify number of entries to sort and search through below
		int arraySizes = 200000;
		
		
		long timeOfInsertion = 0;
		long timeOfMerge = 0;
		long timeOfLinear = 0;
		long timeOfSelection = 0;
		long timeOfBinary = 0;
		long timeOfSort = 0;
		long timeB4 = 0;
		long timeAfter = 0;
		
		
		int position = -1;
		int[] list = new int[arraySizes];
		int[] list1 = list;
		int[] list2 = list;
		int[] list3 = list;

		
		//modify the integer to search for below
		int searchNum = 15000;
		
		
		//modify range of integers below 
		int minRange = -4;
		int maxRange = list.length - 4;
			
		Random r = new Random();
		
		System.out.println("Building data..." + "\n");
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = r.nextInt((maxRange - minRange) + 1) + minRange;
			list1[i] = list[i];
			list2[i] = list[i];
			list3[i] = list[i];
		}
		
		System.out.println("\nInsertion Sort....");
		
		timeB4 = System.currentTimeMillis();
		InsertionSort.sort(list2);
		timeAfter = System.currentTimeMillis();
		timeOfInsertion = timeAfter - timeB4;
		System.out.println("Insertion Sort took: " + timeOfInsertion + "ms");
		
		
		System.out.println("\nSelection Sort....");
		
		timeB4 = System.currentTimeMillis();
		SelectionSort.sort(list);
		timeAfter = System.currentTimeMillis();
		timeOfSelection = timeAfter - timeB4;
		System.out.println("Selection Sort took: " + timeOfSelection + "ms");
		
		
		
		System.out.println("\nMerge Sort....");
		
		timeB4 = System.currentTimeMillis();
		MergeSort.sort(list1);
		timeAfter = System.currentTimeMillis();
		timeOfMerge = timeAfter - timeB4;
		System.out.println("Merge Sort took: " + timeOfMerge + "ms");
		
				
		
		System.out.println("\nLinear Search....");
		
		timeB4 = System.currentTimeMillis();
		position = LinearSearch.search(list3, searchNum);
		timeAfter = System.currentTimeMillis();
		System.out.println("Found at position " + position);
		timeOfLinear = timeAfter - timeB4;
		System.out.println("Linear search took: " + timeOfLinear + "ms");		
		
		System.out.println("\nBinary Search....");
		
		timeB4 = System.currentTimeMillis();
		Arrays.sort(list3);
		timeAfter = System.currentTimeMillis();
		timeOfSort = timeAfter - timeB4;
		timeB4 = System.currentTimeMillis();
		position = Arrays.binarySearch(list3, searchNum);
		timeAfter = System.currentTimeMillis();
		if (position < 0)
		{
			position = -1;
		}
		System.out.println("Found at position " + position);
		timeOfBinary = timeAfter - timeB4;
		System.out.println("Binary search took: " + timeOfBinary + "ms" +
				"\n+ " + timeOfSort + "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: " 
				+ (timeOfSort + timeOfBinary) + "ms");		
		
		}

}

