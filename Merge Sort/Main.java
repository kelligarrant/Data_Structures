import java.util.*;
import java.util.ArrayList;
public class Main
{    
    public static void main(String args[])
    {
      // -----------------------------------
      // do not edit main...       
      // -----------------------------------
      List people = new ArrayList();
      
      people.add(new Person("Frank", "Denton", 73));
      people.add(new Person("Mark", "Cohen", 44)); 
      people.add(new Person("Tim", "Smith", 22));
      people.add(new Person("Steve", "Denton", 16)); 
      people.add(new Person("Andy", "Ashton", 44)); 
      people.add(new Person("Albert", "Denton", 58)); 
      
      List ans = mergeSort(people);
      System.out.println(ans);
      // -----------------------------------
    }
    
    public static List mergeSort(List items)
    {
        List sorted = new ArrayList();
        if (items.size() == 1) // base case...
        {
            sorted = items;
        }
        else // recursive call...
        {
            int a = (items.size()/2)-1;
            sorted = merge(mergeSort(items.subList(0,a)),mergeSort(items.subList(a+1,items.size()-1)));
        }
        return sorted;
    }
    
    private static List merge(List partA, List partB)
    {
         List merged = new ArrayList();
         int a = 0;
         int b = 0;
         
        for(int i = 0; i < partA.size()+partB.size(); i++ )
        {
            if(partA.get(a).compareTo(partB.get(b))==1)
            {
                merged.add(partA.get(a));
                a++;
            }
            else
            {
                merged.add(partB.get(b));
                b++;
            }

        }

         return merged;
    }
}




