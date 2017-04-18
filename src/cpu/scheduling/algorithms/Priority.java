import java.awt.*;
import java.awt.event.*;

class Priority extends Exception implements ActionListener
{

int bt[]=new int[6];
int prt[]=new int[6];
int pro[]=new int[6];
int wt[]=new int[6];
int tat[]=new int[6];
int i,j,pos,temp;
String str1;
String str2;
String str3;
String str4;
String str5;
String str6;
String str7;
String str8;
String str11;
float avwt=0,avtat=0;
int twt,ttat,a;
 int y=0;

Button b1=new Button("Next");
Button b2=new Button("Output");
Button b3=new Button("Back");
Button b4=new Button("Back");
Button btn=new Button("OK");

TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
TextField t5=new TextField();

Panel pan=new Panel();
Panel x=new Panel();

Label h1=new Label("Priority Scheduling Algorithm");
Label n1=new Label("Priority Output");
Label n2=new Label("Process      Burst time       Waiting time      Turnaround time       Priority    ");
Label h2=new Label();
Label h3=new Label();
Label h4=new Label();

Label d1=new Label("No. of processes");
Choice l1=new Choice();
Choice c1=new Choice();
Choice c2=new Choice();
Choice c3=new Choice();
Choice c4=new Choice();
Choice c5=new Choice();

Font font1=new Font("Ariel",Font.ITALIC,18);
Font font2=new Font("Forte",Font.ITALIC,22);
Font font3 = new Font( "Comic Sans MS", Font.BOLD, 16 );
Font font4 = new Font( "Comic Sans MS", Font.ITALIC, 14 );
Font font5 = new Font( "Comic Sans MS", Font.ITALIC, 12 );

Label p=new Label("Enter Burst times of the processes");
Label p1=new Label("Process 1 Burst time");
Label p2=new Label("Process 2 Burst time");
Label p3=new Label("Process 3 Burst time");
Label p4=new Label("Process 4 Burst time");
Label p5=new Label("Process 5 Burst time");
Label p6=new Label("Process 1 Priority");
Label p7=new Label("Process 2 Priority");
Label p8=new Label("Process 3 Priority");
Label p9=new Label("Process 4 Priority");
Label p10=new Label("Process 5 Priority");
Label lbl=new Label("                 Enter the burst time");
Label n4;
 
 Frame wrn=new Frame("Warning !!!");
 Frame max=new Frame();
 Frame next= new Frame("SJF Output");

Color newcolor1=new Color(152,251,152);
Color newcolor2=new Color(100,149,237);
Color c10=new Color(240,128,128);


  Priority()
  {
   max.setSize(700,700);
   max.setTitle("Priority Scheduling Algorithm");
   x.setSize(700,700);
   x.setLayout(new GridLayout(15,4,10,10));
   x.setBackground(newcolor1);
   max.setVisible(true);
   max.add(x);

b1.setBackground(newcolor2);
b1.setForeground(Color.yellow);
b2.setBackground(newcolor2);
b2.setForeground(Color.yellow);
b3.setBackground(newcolor2);
b3.setForeground(Color.yellow);

h1.setFont(font2);
d1.setFont(font1);
p.setFont(font1);

b1.setFont(font3);
b2.setFont(font3);
b3.setFont(font3);
p1.setFont(font4);
p2.setFont(font4);
p3.setFont(font4);
p4.setFont(font4);
p5.setFont(font4);
p6.setFont(font4);
p7.setFont(font4);
p8.setFont(font4);
p9.setFont(font4);
p10.setFont(font4);
h1.setForeground(Color.red);
d1.setForeground(Color.orange);
p.setForeground(Color.orange);
p1.setForeground(Color.blue);
p2.setForeground(Color.blue);
p3.setForeground(Color.blue);
p4.setForeground(Color.blue);
p5.setForeground(Color.blue);
p6.setForeground(c10);
p7.setForeground(c10);
p8.setForeground(c10);
p9.setForeground(c10);
p10.setForeground(c10);

l1.add("1");
l1.add("2");
l1.add("3");
l1.add("4");
l1.add("5");
l1.setBackground(Color.yellow);
l1.setForeground(Color.blue);
l1.setFont(font5);

t1.setBackground(Color.yellow);
t1.setForeground(Color.blue);
t2.setBackground(Color.yellow);
t2.setForeground(Color.blue);
t3.setBackground(Color.yellow);
t3.setForeground(Color.blue);
t4.setBackground(Color.yellow);
t4.setForeground(Color.blue);
t5.setBackground(Color.yellow);
t5.setForeground(Color.blue);

x.add(h1);
x.add(h2);
x.add(d1);
x.add(l1);
x.add(b1);
x.add(h3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
max.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
max.dispose();
}
});
}
Priority(String s){
super(s);
}
public void actionPerformed(ActionEvent ae)
{
a=Integer.parseInt(l1.getSelectedItem());
 if(ae.getSource()==b1)
{
x.add(p);
x.add(h4);
if(a==1){
x.add(p1);
x.add(t1);

x.add(p6);
x.add(c1);
c1.add("1");
}
if(a==2)
 {
x.add(p1);
x.add(t1);
x.add(p6);
x.add(c1);
x.add(p2);
x.add(t2);
x.add(p7);
x.add(c2);

c1.add("1");
c1.add("2");
c2.add("1");
c2.add("2");

}
if(a==3){
x.add(p1);
x.add(t1);
x.add(p6);
x.add(c1);
x.add(p2);
x.add(t2);
x.add(p7);
x.add(c2);
x.add(p3);
x.add(t3);
x.add(p8);
x.add(c3);

c1.add("1");
c1.add("2");
c1.add("3");
c2.add("1");
c2.add("2");
c2.add("3");
c3.add("1");
c3.add("2");
c3.add("3");

}
if(a==4){
x.add(p1);
x.add(t1);
x.add(p6);
x.add(c1);
x.add(p2);
x.add(t2);
x.add(p7);
x.add(c2);
x.add(p3);
x.add(t3);
x.add(p8);
x.add(c3);
x.add(p4);
x.add(t4);
x.add(p9);
x.add(c4);

c1.add("1");
c1.add("2");
c1.add("3");
c1.add("4");
c2.add("1");
c2.add("2");
c2.add("3");
c2.add("4");
c3.add("1");
c3.add("2");
c3.add("3");
c3.add("4");
c4.add("1");
c4.add("2");
c4.add("3");
c4.add("4");

}
if(a==5){
x.add(p1);
x.add(t1);
x.add(p6);
x.add(c1);
x.add(p2);
x.add(t2);
x.add(p7);
x.add(c2);
x.add(p3);
x.add(t3);
x.add(p8);
x.add(c3);
x.add(p4);
x.add(t4);
x.add(p9);
x.add(c4);
x.add(p5);
x.add(t5);
x.add(p10);
x.add(c5);

c1.add("1");
c1.add("2");
c1.add("3");
c1.add("4");
c1.add("5");
c2.add("1");
c2.add("2");
c2.add("3");
c2.add("4");
c2.add("5");
c3.add("1");
c3.add("2");
c3.add("3");
c3.add("4");
c3.add("5");
c4.add("1");
c4.add("2");
c4.add("3");
c4.add("4");
c4.add("5");
c5.add("1");
c5.add("2");
c5.add("3");
c5.add("4");
c5.add("5");

}
x.add(b2);
x.add(b3);
}
 if(ae.getSource()==b2)
{
      if(a==1){
      try{
   if(t1.getText().equals("")){
   throw new Priority("Warning !!");
}
else{
      y=y+14;
      bt[1]=Integer.parseInt(t1.getText());
      prt[1]=Integer.parseInt(c1.getSelectedItem());
      this.display(a);
       this.output();
}
}
catch (Priority e){
this.warn();
}
}
if(a==2)
 {
    try{
   if((t1.getText().equals(""))||(t2.getText().equals(""))){
   throw new Priority("Warning !!");
}
else{
 y=y+14;
 bt[1]=Integer.parseInt(t1.getText());
bt[2]=Integer.parseInt(t2.getText());
prt[1]=Integer.parseInt(c1.getSelectedItem());
prt[2]=Integer.parseInt(c2.getSelectedItem());
      this.display(a);
       this.output();
}
}
catch (Priority e){

}
}
if(a==3){
try{
   if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))){
   throw new Priority("Warning !!");
}
else{
 y=y+14;
bt[1]=Integer.parseInt(t1.getText());
      bt[2]=Integer.parseInt(t2.getText());
      bt[3]=Integer.parseInt(t3.getText());
      prt[1]=Integer.parseInt(c1.getSelectedItem());
prt[2]=Integer.parseInt(c2.getSelectedItem());
prt[3]=Integer.parseInt(c3.getSelectedItem());
      this.display(a);
       this.output();
}
}
catch (Priority e){
this.warn();
}
}
if(a==4){
try{
   if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))){
   throw new Priority("Warning !!");
}
else{
 y=y+14;
bt[1]=Integer.parseInt(t1.getText());
      bt[2]=Integer.parseInt(t2.getText());
      bt[3]=Integer.parseInt(t3.getText());
bt[4]=Integer.parseInt(t4.getText());
 prt[1]=Integer.parseInt(c1.getSelectedItem());
prt[2]=Integer.parseInt(c2.getSelectedItem());
prt[3]=Integer.parseInt(c3.getSelectedItem());
prt[4]=Integer.parseInt(c4.getSelectedItem());
      this.display(a);
       this.output();
}
}
catch (Priority e){
this.warn();
}
}
if(a==5){
try{
   if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||(t5.getText().equals(""))){
   throw new Priority("Warning !!");
}
else{
 y=y+14;
bt[1]=Integer.parseInt(t1.getText());
      bt[2]=Integer.parseInt(t2.getText());
      bt[3]=Integer.parseInt(t3.getText());
bt[4]=Integer.parseInt(t4.getText());
bt[5]=Integer.parseInt(t5.getText());
prt[1]=Integer.parseInt(c1.getSelectedItem());
prt[2]=Integer.parseInt(c2.getSelectedItem());
prt[3]=Integer.parseInt(c3.getSelectedItem());
prt[4]=Integer.parseInt(c4.getSelectedItem());
prt[5]=Integer.parseInt(c5.getSelectedItem());
      this.display(a);
      this.output();
}
}
catch (Priority e){
this.warn();
}
}
}
if(ae.getSource()==btn){
wrn.dispose();
}
if(ae.getSource()==b3)
{
    max.dispose();
}
if(ae.getSource()==b4)
{
next.dispose();
}
}
void output(){

      Color newcolor4=new Color(64,224,208);
      pan.setBackground(newcolor4);
      pan.setSize(500,500);
      pan.setLayout(new GridLayout(y,2));
      pan.setVisible(true);
      next.add(pan);

      next.setSize(500,500);
      next.setVisible(true);  

   next.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent we) {

         next.dispose();

         }
     }
);
}
void warn(){
wrn.setSize(250,150);
wrn.setVisible(true);
wrn.setLayout(new BorderLayout(10,10));
Color newColor9=new Color(100,180,200);
wrn.setBackground(newColor9);
wrn.add(lbl,BorderLayout.CENTER);
wrn.add(btn,BorderLayout.SOUTH);
btn.addActionListener(this);
}
void display(int a)
{
pan.add(n1);
pan.add(n2);
for(i=1;i<=a;i++)
 {
     pro[i]=i;
 }
 for(i=1;i<=a;i++)
{
    pos=i;
    for(j=i+1;j<=a;j++)
    {
        if(prt[j]<prt[pos])
        pos=j;
    }
    temp=bt[i];
    bt[i]=bt[pos];
    bt[pos]=temp;
  
    temp=pro[i];
    pro[i]=pro[pos];
    pro[pos]=temp;

    temp=prt[i];
    prt[i]=prt[pos];
    prt[pos]=temp;
}
wt[1]=0;
for(i=1;i<=a;i++)
{
    wt[i]=0;
    for(j=0;j<i;j++)
    wt[i]+=bt[j];
    twt+=wt[i];
    tat[i]=bt[i]+wt[i];
    ttat+=tat[i];
str1=Integer.toString(pro[i]);
str2=Integer.toString(bt[i]);
str3=Integer.toString(wt[i]);
str4=Integer.toString(tat[i]);
str11=Integer.toString(prt[i]);
n4=new Label("P["+str1+"]"+"                    "+str2+"                               "+str3+"                            "+str4+"                     "+str11);
pan.add(n4);
n4.setForeground(Color.blue);
n4.setFont(font5);
}
avwt=(float)twt/a;
avtat=(float)ttat/a;
double th=(double)a/ttat;
str5=Integer.toString(twt);
str6=Integer.toString(ttat);
str7=Float.toString(avwt);
str8=Float.toString(avtat);
String str9=Double.toString(th);
Label n5=new Label("Total waiting time:      "+str5);
Label n6=new Label("Total turnaround time:      "+str6);
Label n7=new Label("Avg. waiting time:      "+str7);
Label n8=new Label("Avg. waiting time:      "+str8);
Label n9=new Label("Throughput:          "+str9);

pan.add(n5);
pan.add(n6);
pan.add(n7);
pan.add(n8);
pan.add(n9);

n1.setFont(font3);
n2.setFont(font5);
n1.setForeground(c10);
n2.setForeground(Color.red);
n5.setForeground(Color.red);
n6.setForeground(Color.red);
n7.setForeground(Color.red);
n8.setForeground(Color.red);
n9.setForeground(Color.red);


b4.setBackground(Color.orange);
b4.setForeground(Color.blue);
pan.add(b4);
}
public static void main(String args[]) 
{
Priority ch=new Priority();
}
}
