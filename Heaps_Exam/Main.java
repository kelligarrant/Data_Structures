import java.util.*;
import java.util.Scanner;

public class Main 
{
   public static void main(String[] args) 
   {
      Main main = new Main();
      main.go();
   }

   public void go()
   {
      int ary[] = {82, 79, 46, 16, 12, 39, 41, 6, 4, 11};
      
      int root = getRoot(ary);
      System.out.printf("Root: %s%n", root);

      List leaves = getAllLeaves(ary);
      System.out.printf("Leaves: %s%n", leaves);

      List parents = getAllParents(ary);
      System.out.printf("Parents: %s%n", parents);
      
      boolean isMaxHeap1 = isMaxHeap(0, ary);
      System.out.printf("Is MaxHeap: %s%n", isMaxHeap1);
   }
   
   // ---------------------------------------------------------------
   // return the value of the root of the tree represented by ary
   // ---------------------------------------------------------------
   public int getRoot(int ary[])
   {
      return ary[0];
      
      //return -1;
   }
   
   // ---------------------------------------------------------------
   // return a list containing the values for all of the nodes in the 
   // tree that are leaves
   // ---------------------------------------------------------------
   public List getAllLeaves(int ary[])
   {
      List l = new ArrayList();
      int i = 0;
      
      while(i < ary.length)//realized after finsihing the while loop I probably should have just used a for loop
      {
        
        if(((2*i +1)>=ary.length))
        {
            l.add(ary[i]);
        }
        i++;
      }
      
      return l;
   }

   // ---------------------------------------------------------------
   // return a list containing the values for all of the nodes in the 
   // tree that are parents
   // ---------------------------------------------------------------
   public List getAllParents(int ary[])
   {
      List l = new ArrayList();
      int i = 0;
      while(i < ary.length)//once again a for loop would also work
      {
        
        if(((2*i +1)<ary.length))
        {
            l.add(ary[i]);
        }
        i++;
      }
      
      return l;
   }
   
   // ---------------------------------------------------------------   
   // return true if the tree represented by ary is a valid max heap
   // ---------------------------------------------------------------
   public boolean isMaxHeap(int rootIndex, int ary[])
   {
      boolean mxHeap = true;
      int lci;//left child index
      int rci;//right child index
      for(int i =0; i < ary.length; i++)
      {
        lci = (2*i)+1;
        rci = (2*i) +2;
        if(lci<ary.length && ary[lci]>ary[i])
        {
            mxHeap=false;
        }
        if(rci<ary.length && ary[rci]>ary[i])
        {
            mxHeap=false;
        }
          
      }

      return mxHeap;
   }
}