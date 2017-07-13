package finalProject;

import java.util.Iterator;
import java.util.List;

class LinearSearch
{
    // This function returns index of element x in arr[]
    static int search(int[] list, int x)
    {
    	int position = -1;
    	
        for (int i = 0; i < list.length; i++)
        {
        	++position;
            if (list[i] == x)
                return position;
        }
  
        // return -1 if the element is not found
        return -1;
    }
} 
