import java.util.Calendar;
class time
{
public static void main(String a[])
{
Calendar c=Calendar.getInstance();
long t1=c.getTimeInMillis();
int j=0;
System.out.println("t1: "+(t1));
for(int i=0;i<100000;i++)
j++;
c=Calendar.getInstance();
long t2=c.getTimeInMillis();
System.out.println("t2: "+(t2));
System.out.println("Duration of running(in millis) "+(t2-t1));
}
}