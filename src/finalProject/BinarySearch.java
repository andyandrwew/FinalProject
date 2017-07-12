package finalProject;

import java.util.List;

//Java implementation of iterative Binary Search
class BinarySearch
{
 // Returns index of x if it is present in arr[], else
 // return -1
 static int binarySearch(List<Integer> list, int x)
 {
     int l = 0, r = list.size();
     while (l <= r)
     {
         int m = l + (r-l)/2;

         // Check if x is present at mid
         if (list.get(m) == x)
             return m;

         // If x greater, ignore left half
         else if (list.get(m)< x)
             l = m + 1;

         // If x is smaller, ignore right half
         else
             r = m - 1;
     }

     // if we reach here, then element was not present
     return -1;
 }
}
