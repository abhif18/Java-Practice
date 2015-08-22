import java.applet.Applet;
import java.awt.*;
public class app2 extends Applet
{
public void init()
{}
public void paint(Graphics g)
{
	String msgX="Month",msgY="Sales in Crores";
	String[] value={"10","20","30","40","50","60","70","80","90","100"};
	String[] month={"Jan","Feb","March","April","May","June"};
g.drawLine(100,600,712,600);
g.drawLine(100,600,100,80);
int i,t=200;
g.setFont(new Font("Courier New",Font.BOLD,18));
for( i=0;i<6;i++,t+=100){
g.drawLine(t,605,t,598);
g.drawString(month[i],t-20,615);
}
for(i=0 ,t=550;i<10;i++,t-=50){
g.drawLine(98,t,105,t);
g.drawString(value[i],70,t);
}
//mentioning axises
g.drawString("X-Axis",740,620);
g.drawString("Y-Axis",100,60);
//drawing arrowheads
g.drawLine(100,80,95,85);
g.drawLine(100,80,105,85);
g.drawLine(712,600,707,595);
g.drawLine(712,600,707,605);
//drawing Ployline
g.setColor(new Color(255,153,0));
int[] x={100,200,300,400,500,600,700,700};
int[] y={600,450,200,350,250,300,100,600};
g.drawPolyline(x,y,7);
//drawing arrowheads for PolyLine
g.drawLine(x[6],y[6],x[6]+3,y[6]+8);
g.drawLine(x[6],y[6],x[6]-6,y[6]+4);
//fill polygon
g.setColor(new Color(214,153,153));
g.fillPolygon(x,y,8);
g.setColor(new Color(194, 255, 133));
//Drawing Info Box
g.fillRoundRect(300,20,350,100,5,5);
//Setting Info in Info Box
g.setColor(new Color(204, 0, 0));
g.setFont(new Font("Jokerman",Font.BOLD,16));
g.drawString("X-Axis : "+msgX,350,50);
g.drawString("Y-Axis : "+msgY,350,100);
}
}
/*<applet code="app2.java" width=900 height=800></applet>*/