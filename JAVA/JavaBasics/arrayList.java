import java.util.*;  
public class arrayList{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

/*
void add(int index, Object element) It is used to insert the specified element at the specified position 
index in a list.
boolean addAll(Collection c)  It is used to append all of the elements in the specified collection to the 
end of this list, in the order that they are returned by the specified collection's iterator.
void clear()  It is used to remove all of the elements from this list.
int lastIndexOf(Object o) It is used to return the index in this list of the last occurrence of the 
specified element, or -1 if the list does not contain this element.
Object[] toArray()  It is used to return an array containing all of the elements in this list in the correct order.
Object[] toArray(Object[] a)  It is used to return an array containing all of the elements in this 
list in the correct order.
boolean add(Object o) It is used to append the specified element to the end of a list.
boolean addAll(int index, Collection c) It is used to insert all of the elements in the specified
 collection into this list, starting at the specified position.
Object clone()  It is used to return a shallow copy of an ArrayList.
int indexOf(Object o) It is used to return the index in this list of the first occurrence of the specified e
lement, or -1 if the List does not contain this element.
void trimToSize() It is used to trim the capacity of this ArrayList instance to be the list's current size.
*/