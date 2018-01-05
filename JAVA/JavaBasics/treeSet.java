import java.util.*;  
class treeSet{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
} 

/*
boolean addAll(Collection c)  It is used to add all of the elements in the specified collection to this set.
boolean contains(Object o)  It is used to return true if this set contains the specified element.
boolean isEmpty() It is used to return true if this set contains no elements.
boolean remove(Object o)  It is used to remove the specified element from this set if it is present.
void add(Object o)  It is used to add the specified element to this set if it is not already present.
void clear()  It is used to remove all of the elements from this set.
Object clone()  It is used to return a shallow copy of this TreeSet instance.
Object first()  It is used to return the first (lowest) element currently in this sorted set.
Object last() It is used to return the last (highest) element currently in this sorted set.
int size()  It is used to return the number of elements in this set.
*/ 