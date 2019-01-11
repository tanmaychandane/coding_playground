import java.applet.*;
import java.awt.*;
/*
<applet code=button width=400 height=400>
</applet>
*/
public class button extends Applet
{
Button b1,b2,b3;
public void init()
{
FlowLayout f=new FlowLayout(FlowLayout.RIGHT);
setLayout(f);
b1=new Button("Ok");
b2=new Button("Cancel");
b3=new Button("exit");
add(b1);
add(b2);
add(b3);
}
}
//javac button.java
//appletviewer button.java
