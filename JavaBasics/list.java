import java.util.*;  
public class list{  
public static void main(String args[]){  
ArrayList<String> al=new ArrayList<String>();  
al.add("Amit");  
al.add("Vijay");  
al.add("Kumar");  
al.add(1,"Sachin");  
System.out.println("Element at 2nd position: "+al.get(2));  
for(String s:al){  
 System.out.println(s);  
}  
}  
}  

/* void add(int index,Object element)  It is used to insert element into the invoking list at the
index passed in the index.
 boolean addAll(int index,Collection c)  It is used to insert all elements
of c into the invoking list at the index passed in the index.
 object get(int index)   It is used to
return the object stored at the specified index within the invoking collection.

object set(intindex,Object element)    It is used to assign element to the location specified by index within the
invoking list. 

object remove(int index) It is used to remove the element at position index from the
invoking list and return the deleted element.

ListIterator listIterator() It is used to return an
iterator to the start of the invoking list.

ListIterator listIterator(int index)    It is used to
return an iterator to the invoking list that begins at the specified index. */


/*
Methods of Java ListIterator Interface:

Method	Description
boolean hasNext()	This method return true if the list iterator has more elements when traversing the list in the forward direction.
Object next()	This method return the next element in the list and advances the cursor position.
boolean hasPrevious()	This method return true if this list iterator has more elements when traversing the list in the reverse direction.
Object previous()	This method return the previous element in the list and moves the cursor position backwards.

*/
