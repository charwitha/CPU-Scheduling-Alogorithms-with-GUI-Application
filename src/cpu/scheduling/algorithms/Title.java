import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class title extends Frame implements ActionListener
{

ImageIcon a = new ImageIcon("index2.jpg");
Button btn1=new Button("FCFS");
Button btn2=new Button("SJF");
Button btn3=new Button("Priority");
Button btn4=new Button("Round Robin");
Panel pan=new Panel();

title()
{
setTitle("CPU Scheduling Algorithms");
setLayout(new BorderLayout());
setSize(1300,720);
setVisible(true);

pan.setSize(1300,120);
pan.setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
pan.setVisible(true);

btn1.setPreferredSize(new Dimension(150, 35));
btn2.setPreferredSize(new Dimension(150, 35));
btn3.setPreferredSize(new Dimension(150, 35));
btn4.setPreferredSize(new Dimension(150, 35));
add(pan,BorderLayout.SOUTH);   

btn1.setBackground(Color.green);
btn2.setBackground(Color.green);
btn3.setBackground(Color.green);
btn4.setBackground(Color.green);
     
pan.add(btn1);
pan.add(btn2);
pan.add(btn3);
pan.add(btn4);

addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent we) {

         System.exit(0);

         }
     }
);

btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==btn1){
fcfs fs=new fcfs();
}
if(ae.getSource()==btn2){
MyFrame m1=new MyFrame();
}
if(ae.getSource()==btn3){
Priority ch=new Priority();
}
if(ae.getSource()==btn4){
RoundRobin r1=new RoundRobin();
}
}
public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(a.getImage(), 0, 0,1300,800, this);
        Font font2 = new Font( "Monospaced", Font.ITALIC, 14 );
        g.setFont(font2);
        g.setColor(new Color(150,120,150));
        g.drawString(">  This simulator can be applied to a maximum of five(5) processes.",150,295);
        g.drawString(">  Burst times entered should be strictly non- negative integers.",150,315);
        g.drawString("Choose an algorithm to continue :",150,655);
}
public static void main(String arg[])
{
title t1=new title();
t1.repaint();
}
}