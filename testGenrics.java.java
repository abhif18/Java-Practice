class  Genrics<T>{
	T object;
	Genrics(T object)
	{
		this.object=object;
	}
	public T getObjectValue()
	{
		return object;
	}
	public void showObjectType()
	{
		System.out.println(object.getClass().getName());
	}
}
class testGenrics
{
	public static void main(String r[])
	{
	Genrics<Integer> o1;
    Genrics<String> o2;
o1=new Genrics<Integer> (new Integer(100));
o2=new Genrics<String> (new String("My name is Abhishek Srivastava"));
System.out.println("Value of o1 :"+o1.getObjectValue());
System.out.print("Class of o1 :");
o1.showObjectType();
System.out.println("Value of o2 :"+o2.getObjectValue());
System.out.print("Class of o2 :");
o2.showObjectType();
	}
}