class AverageOfAnyNumericType<T extends Number>
{
T [] numbers;
AverageOfAnyNumericType(T[] numbers)
{
this.numbers=numbers;
}
public double Average()
{
double sum=0.0d;
for(int i=0;i<numbers.length;i++)
 sum+=numbers[i].doubleValue();
 return (sum/(numbers.length));
}
}
class testAverageOfAnyNumericType{
public static void main(String a[])
{
int[] n1={1,2,3,4,5,6,7,8,9};
Integer[] n2={1,2,3,4,5,6,7,8,9};
//AverageOfAnyNumericType<Integer> obj=new AverageOfAnyNumericType<Integer>(n1); No AutoBoxing here
AverageOfAnyNumericType<Integer> obj=new AverageOfAnyNumericType<Integer>(n2);
System.out.println("Average of Integers is "+obj.Average());
}
}