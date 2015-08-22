import java.util.*;
class CollectionsDemo2
{
	public String toString()
	{
		return "fuckOff!!";
	}
public static void main(String... arg)
{
	String[] n={"Abhishek","Srivastava","Manoj","Srivastava"};
	String[] j={"1","2","4","8","16","32","64","128"};
	LinkedList<String> list1=new LinkedList<String>(Arrays.asList(j));
	ArrayList<String> list2=new ArrayList<String>(list1);
	String[] list5=list2.toArray(new String[0]);//if String[] is written then CE occurs telling that array dimension is missing
	//If given dimension is less than size of list than a new array is created with requisite size 
	//ArrayList<Integer> list3=new ArrayList<Integer>(list1);
			System.out.println(list1);
		System.out.println(list2);

	for(String s:list1)
		System.out.println(s);
	System.out.println("Now printing String array");
	for(String s:list5)
		System.out.println(s);
}
}