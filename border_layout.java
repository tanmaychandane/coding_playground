import java.applet.*;
import java.awt.*;
/*
<applet code=borderlayout width=400 height=400>
</applet>
*/
public class borderlayout extends Applet
{
Label l1,l2;
TextField t1,t2;
BorderLayout g;
public void init()
{
g=new BorderLayout();
setLayout(g);
l1=new Label("Enter number int first text field");
l2=new Label("Enter number in second text field");
add(l1,BorderLayout.EAST);
add(l2,BorderLayout.WEST);
} 
}
