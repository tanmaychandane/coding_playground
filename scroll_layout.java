import java.applet.*;
import java.awt.*;
/*
<applet code=scroll_layout width=400 height=400>
</applet>
*/
public class scroll_layout extends Applet
{
Scrollbar s1,s2;
public void init()
{
FlowLayout f=new FlowLayout(FlowLayout.RIGHT);
setLayout(f);
s1=new Scrollbar(Scrollbar.HORIZONTAL);
s2=new Scrollbar(Scrollbar.VERTICAL);
add(s1);
add(s2);
}
}

//javac scroll_layout.java
//appletviewer scroll_layout.java
