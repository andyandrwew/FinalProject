/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author andrew
 */
public class RunGUI
{
    static int arraySizes = 0;
    static int searchNum = 0;
    static int minRange = 0;
    static int maxRange = 0;
    
    public RunGUI(int arrSize, int num2Search, int lowBound,
                int hiBound)
    {

	// modify number of entries to sort and search through below
            arraySizes = arrSize;
            searchNum = num2Search;
            minRange = lowBound;
            maxRange = hiBound;
            
		long timeOfAction = 0;
                long timeOfSort = 0;
		long timeB4 = 0;
		long timeAfter = 0;

		int position = -1;
		int[] list = new int[arraySizes];
		int[] list1 = list;
		int[] list2 = list;
		int[] list3 = list;
		int[] list4 = list;

		Random r = new Random();

                System.out.println("Building data...");
                
		for (int i = 0; i < list.length; i++)
		{
			list[i] = r.nextInt((maxRange - minRange) + 1) + minRange;
			list1[i] = list[i];
			list2[i] = list[i];
			list3[i] = list[i];
			list4[i] = list[i];
		}

		System.out.println("\nInsertion Sort....");


		timeB4 = System.currentTimeMillis();
		InsertionSort.sort(list2);
		timeAfter = System.currentTimeMillis();
		timeOfAction = timeAfter - timeB4;
		System.out.println("Insertion Sort took: " + timeOfAction + "ms");


		System.out.println("\nSelection Sort....");
		System.out.println("\nSelection Sort....");

		timeB4 = System.currentTimeMillis();
		SelectionSort.sort(list);
		timeAfter = System.currentTimeMillis();
		timeOfAction = timeAfter - timeB4;
		System.out.println("Selection Sort took: " + timeOfAction + "ms");

		System.out.println("\nMerge Sort....");

		timeB4 = System.currentTimeMillis();
		MergeSort.sort(list1);
		timeAfter = System.currentTimeMillis();
		timeOfAction = timeAfter - timeB4;
		System.out.println("Merge Sort took: " + timeOfAction + "ms");

		System.out.println("\nLinear Search....");

		timeB4 = System.currentTimeMillis();
		position = LinearSearch.search(list3, searchNum);
		timeAfter = System.currentTimeMillis();
		System.out.println("Found at position " + position);

		timeOfAction = timeAfter - timeB4;
		System.out.println("Linear search took: " + timeOfAction + "ms");

		System.out.println("\nArrays.Binary Search....");

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

		timeOfAction = timeAfter - timeB4;
		System.out.println("Binary search took: " + timeOfAction + "ms" + "\n+ " + timeOfSort
				+ "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: "
				+ (timeOfSort + timeOfAction) + "ms");



		if (minRange > -185_000)
		{
			System.out.println("\nBinary Search....");


			timeB4 = System.currentTimeMillis();
			Arrays.sort(list4);
			timeAfter = System.currentTimeMillis();
			timeOfSort = timeAfter - timeB4;
			timeB4 = System.currentTimeMillis();
			position = BinarySearch.binarySearch(list4, 0, list4.length, searchNum);
			timeAfter = System.currentTimeMillis();
			if (position < 0)
			{
				position = -1;
			}
			System.out.println("Found at position " + position);

			timeOfAction = timeAfter - timeB4;
			System.out.println("Binary search took: " + timeOfAction + "ms" + "\n+ " + timeOfSort
					+ "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: "
					+ (timeOfSort + timeOfAction) + "ms");

		}
		
		else
		{
			System.out.println("\n\nThe Binary Search method did not work with this range.");
		}
    }
    
}