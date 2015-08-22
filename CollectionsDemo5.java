import java.util.*;
class student
{
String name;
int rollno,percent_marks;
student(String name,int rollno,int percent_marks)
{
this.name=name;
this.rollno=rollno;
this.percent_marks=percent_marks;
}
}
class CollectionsDemo5
{
	void temp()
	{
		
	}
public static void main(String... t)
{
ArrayList<String> al=new ArrayList<String>();
  String s1=new String("Sonoo");  
  String s2=new String("Ravi");  
  String s3=new String("Hanumat");
  al.add(s1);
  al.add(s2);
  al.add(s3);
  HashSet <String> hs=new HashSet<String>(al);
System.out.println(al);
System.out.println(hs);
Iterator<String> itr=al.iterator();

Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
Object o=  hm.put(100,"Amit");  
System.out.println(o);
  o=hm.put(102,"Ravi");  
  System.out.println(o);
  o=temp();
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");
/*while(itr.hasNext()){
	String i=itr.next();
System.out.println(i.name+"\t"+i.rollno+"\t"+i.percent_marks);
System.out.println(i.hashCode());
}*/
}
}