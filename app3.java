import java.applet.Applet;
import java.awt.*;
public class app3 extends Applet
{
public void init()
{

}
public void paint(Graphics g)
{
g.setColor(new Color(102, 255, 51));
g.fillRect(100,100,500,500);//Block

//Drawing Roads
g.setColor(new Color(31, 31, 20));
g.fillRect(275,100,150,500);
g.fillRect(100,275,500,150);
g.setColor(new Color(255, 255, 0));
//Drawing Yellow Lines
for(int i=0,t=100;i<10;i++,t+=50)
{
	if(i==5)
	t+=30	;
	g.fillRoundRect(t,347,20,6,2,2);
}
for(int i=0,t=100;i<10;i++,t+=50)
{
	if(i==5)
	t+=30	;
	g.fillRoundRect(347,t,6,20,2,2);
}
//Drawing Cars
g.fillRect(278,115,30,40);
g.fillRect(500,278,50,35);
g.fillRect(200,385,60,36);
g.fillRect(360,450,30,45);
//Drawing CrossOver
g.setColor(new Color(153, 0, 0));
g.fillOval(325,326,50,50);
}
}
/*<applet code="app3.java" width=1000 height=1000></applet>*/