import java.util.*;
class coll
{
public static void main(String... g)
{
HashSet<String> hs=new HashSet<String>();
hs.add(new String("abhi"));
hs.add(new String("abhi"));
Iterator<String> itr=hs.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}