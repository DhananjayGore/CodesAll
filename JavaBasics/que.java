import java.util.*;  
public class que
{  

public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>(); 

queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  

System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  

Iterator itr=queue.iterator();  

while(itr.hasNext()){  
System.out.println(itr.next());  
}  

queue.remove();  //throws exception if empty

queue.poll();  //ret null if empty

System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  