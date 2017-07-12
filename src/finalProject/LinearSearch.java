package finalProject;

import java.util.Iterator;
import java.util.List;

class LinearSearch
{
    // This function returns index of element x in arr[]
    static int search(List<Integer> list, int x)
    {
    	int position = -1;
    	
        for (Iterator<Integer> it = list.iterator(); it.hasNext();)
        {
        	++position;
        	int next = it.next();
            // Return the index of the element if the element
            // is found
            if (next == x)
                return position;
        }
  
        // return -1 if the element is not found
        return -1;
    }
} 
