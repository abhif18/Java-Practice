import java.util.Scanner;
class PalindromeStringCheck
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter String");
String s=sc.next().useDelimiter("\n");
int flag=1;
for(int l=0,h=s.length()-1;l<=h;l++,h--)
if(s.charAt(l)!=s.charAt(h))
{
flag=0;
break;
}
if(flag==1)
System.out.println("Panlindrome");
else
System.out.println("Not Panlindrome");
}
}