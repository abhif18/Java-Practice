import java.util.*;
class student
{
String name;
int rno,pmarks;
student(int rno,String name,int pmarks)
{
this.name=name;
this.rno=rno;
this.pmarks=pmarks;
}
}
class CompareByName implements Comparator
{
public int compare(Object s1,Object s2)//This has to be Object coz original declaration has type Object as params
{
	student s3=(student)s1;
	student s4=(student)s2;
return s3.name.compareTo(s4.name);
}
}
class TestSort4
{
public static void main(String... g)
{
ArrayList<student> al=new ArrayList<student>();
al.add(new student(101,"Vijay",23));  
al.add(new student(106,"Ajay",27));  
al.add(new student(105,"Jai",21));
Collections.sort(al,new CompareByName());
Iterator<student> itr=al.iterator();
while(itr.hasNext())
{
student st=itr.next();
System.out.println(st.name+"\t"+st.rno+"\t"+st.pmarks);
}
}
}