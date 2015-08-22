import java.util.*;
//To convert Collection type to Array Type
class collectionDemo1
{
public static void main(String s)
{
LinkedList<Integer> li=new LinkedList<Integer>();
li.add(12);
li.add(14);
li.add(3);
li.add(31);
li.add(1);
Integer[] n1=li.toArray(new Integer[0]);
for(Integer i:n1)
System.out.println(i);
}
}