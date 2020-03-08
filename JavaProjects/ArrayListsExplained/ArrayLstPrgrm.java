//Doesn't work because this isn't in the main method, just explanatory

import java.io.*; 
import java.util.*; 
/*constructors:
1. ArrayList(): This constructor is used to build an empty array list
2. ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from collection c
3. ArrayList(int capacity): This constructor is used to build an array list with initial capacity being specified*/

//ArrayLists are for storage of data - they expand as needed and cannot hold primitive data type values.
//ArrayList inherits AbstractList class and implements List interface
// See more: https://www.geeksforgeeks.org/arraylist-in-java/
//like Arrays, the indeces start from 0.
class ArrayLstPrgrm{    
    public static void main(String[]args) throws IOException{ //IOException is a type of exception or error that the main method might throw at you. Whenever you want to specify that a method might give you an exception, you write it as such.
        int n = 5; // size of ArrayList
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);//ArrayList of Integers, initial size is 5; You don't need to specify the initial size, since it grows and shrinks anyways.
        // Appending the new element at the end of the list 
        for(int i=1;i<=n;i++){
            arrli.add(i);//to add an element to the ArrayList - add(Object)
        }
        
        System.out.println(arrli);// Printing elements 
        // Remove element at index 3 
        arrli.remove(3); // removes -  ArrayList : remove(index #)
        
        System.out.println(arrli); // Displaying ArrayList after deletion 
        // Printing elements one by one 
        for(int k=0;k<arrli.size();k++){
            System.out.print(arrli.get(k)+" ");
        }
    }
    
}
