package finalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Created by Andrew Saad and Jonathan Linder
 */


public class MainTester 
{

	static String guiOutput = "";
	static int arraySizes = 0;
	static int searchNum = 0;
	static int minRange = 0;
	static int maxRange = 0;

	static int counterArray = 0;
	static int counterSearch = 0;
	static int counterMin = 0;
	static int counterMax = 0;


	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);

		// modify number of entries to sort and search through below
		System.out.println("How many random numbers? \n(Warning over 200,000 may take very long)");

		while (counterArray == 0)
		{
			arraySizes = (int) in.nextInt();
			counterArray++;
		}

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

		// modify the integer to search for below
		System.out.println("What integer would you like to search for?");

		while (counterSearch == 0)
		{
			searchNum = (int) in.nextInt();
			counterSearch++;
		}

		// modify range of integers below
		System.out.println("What is the minimum range of the data?");

		while (counterMin == 0)
		{
			minRange = (int) in.nextInt();
			counterMin++;
		}

		System.out.println("What is the maximum range of the data?");

		while (counterMax == 0)
		{
			maxRange = (int) in.nextInt();
			counterMax++;
		}

		Random r = new Random();

		System.out.println("Building data...");
                guiOutput += ("Building data...");
                
		for (int i = 0; i < list.length; i++)
		{
			list[i] = r.nextInt((maxRange - minRange) + 1) + minRange;
			list1[i] = list[i];
			list2[i] = list[i];
			list3[i] = list[i];
			list4[i] = list[i];
		}

		System.out.println("\nInsertion Sort....");
		guiOutput += ("\nInsertion Sort....");


		timeB4 = System.currentTimeMillis();
		InsertionSort.sort(list2);
		timeAfter = System.currentTimeMillis();
		timeOfAction = timeAfter - timeB4;
		System.out.println("Insertion Sort took: " + timeOfAction + "ms");
		guiOutput += ("Insertion Sort took: " + timeOfAction + "ms");


		System.out.println("\nSelection Sort....");
		guiOutput += ("\nSelection Sort....");

		timeB4 = System.currentTimeMillis();
		SelectionSort.sort(list);
		timeAfter = System.currentTimeMillis();
		timeOfAction = timeAfter - timeB4;
		System.out.println("Selection Sort took: " + timeOfAction + "ms");
		guiOutput += ("Selection Sort took: " + timeOfAction + "ms");

		System.out.println("\nMerge Sort....");
		guiOutput += ("\nMerge Sort....");

		timeB4 = System.currentTimeMillis();
		MergeSort.sort(list1);
		timeAfter = System.currentTimeMillis();
		timeOfAction = timeAfter - timeB4;
		System.out.println("Merge Sort took: " + timeOfAction + "ms");
		guiOutput += ("Merge Sort took: " + timeOfAction + "ms");

		System.out.println("\nLinear Search....");
		guiOutput += ("\nLinear Search....");

		timeB4 = System.currentTimeMillis();
		position = LinearSearch.search(list3, searchNum);
		timeAfter = System.currentTimeMillis();
		System.out.println("Found at position " + position);
		guiOutput += ("Found at position " + position);

		timeOfAction = timeAfter - timeB4;
		System.out.println("Linear search took: " + timeOfAction + "ms");
		guiOutput += ("Linear search took: " + timeOfAction + "ms");

		System.out.println("\nArrays.Binary Search....");
		guiOutput += ("\nArrays.Binary Search....");

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
		guiOutput += ("Found at position " + position);

		timeOfAction = timeAfter - timeB4;
		System.out.println("Binary search took: " + timeOfAction + "ms" + "\n+ " + timeOfSort
				+ "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: "
				+ (timeOfSort + timeOfAction) + "ms");
		guiOutput += ("Binary search took: " + timeOfAction + "ms" + "\n+ " + timeOfSort
				+ "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: "
				+ (timeOfSort + timeOfAction) + "ms");



		if (minRange > -185_000)
		{
			System.out.println("\nBinary Search....");
			guiOutput += ("\nBinary Search....");


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
			guiOutput += ("Found at position " + position);

			timeOfAction = timeAfter - timeB4;
			System.out.println("Binary search took: " + timeOfAction + "ms" + "\n+ " + timeOfSort
					+ "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: "
					+ (timeOfSort + timeOfAction) + "ms");
			guiOutput += ("Binary search took: " + timeOfAction + "ms" + "\n+ " + timeOfSort
					+ "ms for Arrays.sort() to prepare data for search.\nTotal time of binary: "
					+ (timeOfSort + timeOfAction) + "ms");

		}
		
		else
		{
			System.out.print("\n\nThe Binary Search method did not work with this range.");
			guiOutput += ("\n\nThe Binary Search method did not work with this range.");
		}
	}

}
