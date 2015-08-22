//* Implementing a Queue Using LinkedList(Collections FrameWork)  */
import java.util.*;
class Queue
{
LinkedList<Integer> list;
Queue()
{
	list =new LinkedList<Integer>();
}
public void Insert(Integer key)
{
list.addLast(key);
}
public Integer Remove()
{
if(!list.isEmpty())
return list.removeFirst();
else
return null;
}
public void Traverse()
{
for(Object o:list)
System.out.println(o);
}
public boolean Search(Object key)
{
return (list.contains(key));
}
public static void main(String a[])
{
Queue q=new Queue();
q.Insert(1);
q.Insert(2);
q.Insert(4);
q.Insert(8);
q.Insert(16);
q.Insert(32);
q.Traverse();
System.out.println("\nQueue has 32 : "+q.Search(32)+"\n");
while(!q.list.isEmpty())
{
System.out.println("Poped from Queue "+q.Remove());
}
q.Traverse();
System.out.println("\nQueue has 32 : "+q.Search(32));
}
}