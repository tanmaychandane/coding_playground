import java.applet.*;
import java.awt.*;
/*
<applet code=grid_demo width=400 height=400>
</applet>
*/
public class grid_demo extends Applet
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
//t1=new TextField(20);
//t2=new TextField(20);
add(l1,BorderLayout.EAST);
//add(t1);
add(l2,BorderLayout.EAST);
//add(t2);
} 
}
// save as grid_demo.java
