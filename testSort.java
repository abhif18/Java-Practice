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
class testSort
{
public static void main(String... t)
{
ArrayList<student> al=new ArrayList<student>();
al.add(new student(101,"Vijay",23));  
al.add(new student(106,"Ajay",27));  
al.add(new student(105,"Jai",21));
Collections.sort(al);
Iterator<student> itr=al.iterator();
while(itr.hasNext())
{
student st=itr.next();
System.out.println(st.name+"\t"+st.rno+"\t"+st.pmarks);
}
}
}