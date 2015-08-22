class mult extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.print(i);
try{
Thread.sleep(2000);
}
catch(Exception e)
{
}
}
}
}
class testMult
{
public static void main(String... p)
{
mult o=new mult();
o.start();
}
}