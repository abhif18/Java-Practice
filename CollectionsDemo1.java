import java.util.*;
//TO convert array into collection
class CollectionsDemo1
{
public static void main(String... arg)
{
	String[] n={"Abhishek","Srivastava","Manoj","Srivastava"};
	List<String> list1=Arrays.asList(n);
	
	for(String s:list1)
		System.out.println(s);
}
}