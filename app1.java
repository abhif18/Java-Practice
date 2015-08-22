import java.applet.Applet;
import java.awt.*;
public class app1 extends Applet
{
public void init()
{

}
public void paint(Graphics g)
{
g.setColor(new Color(247,234,164));
//g.drawOval(200,100,130,150);
g.fillOval(200,100,130,150);//Face
g.setColor(new Color(255,255,255));
g.fillOval(220,150,25,20);//LeftEye
g.fillOval(285,150,25,20);//RightEye
g.setColor(new Color(0,0,0));
g.fillOval(292,156,10,10);//Retina
g.fillOval(227,156,10,10);//Retina
g.fillRoundRect(265,175,5,20,2,2);//Nose
g.fillArc(245,200,40,10,180,180);//Lips
g.fillRect(250,250,30,30);//Neck
g.setColor(new Color(153,255,51));
g.fillRoundRect(140,280,250,250,125,125);//Stomach
g.setColor(new Color(0,0,0));
//Shirt Buttons
int t=290;
for(int i=0;i<6;i++)
{
	g.drawOval(265,t,5,5);
	t+=40;
}
}
}
/*<applet code="app1.java" width=500 height=1000></applet>*/