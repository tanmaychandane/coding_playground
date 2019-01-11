import java.applet.*;
import java.awt.*;
/*
<applet code=grid_layout width=400 height=400>
</applet>
*/
public class grid_layout extends Applet
{
Label L1,L2,L3;
TextField T1,T2,T3;
Button B1;
GridLayout g;
public void init()
{
g = new GridLayout(4,2);
setLayout(g);
L1= new Label("Enter number in textfield");
L2= new Label("Enter number in textfield");
L3= new Label("Addition of two numbers");
T1=new TextField("10");
T2=new TextField("20");
T3=new TextField("30");
B1=new Button ("add");
add(L1);
add(T1);
add(L2);
add(T2);
add(L3);
add(T3);
add(B1);
}
}
//javac
//appletviewer 
