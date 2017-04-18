import java.awt.*;

import java.awt.event.*;



class RoundRobin extends Exception implements ActionListener
{


int bt[]=new int[6];

int pro[]=new int[6];

int wt[]=new int[6];

int tat[]=new int[6];

int rbt[]=new int[6];

int st[]=new int[6];

int cpu=0,i,j,ts,temp,big,count=1,tm;
int y=20;


String str1;

String str2;

String str3;

String str4;

String str5;

String str6;

String str7;

String str8;

String str9;

String str10;

String str11,str12,str13;

float avwt=0,avtat=0;

int twt,ttat;



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

TextField t6=new TextField();

TextField t7=new TextField();


Panel pan=new Panel();

Panel x=new Panel();

Color c15=new Color

(100,149,210);
Color c16=new Color(152,251,152);
Color c17=new Color(190,190,190);
Color c18=new Color(0,150,0);
Color c19=new Color(220,220,220);
Label h1=new Label("Round Robin Scheduling Algorithm");

Label n1=new Label("Round Robin Output");

Label n2=new Label("Process      Burst time       Remaining Burst Time            CPU time    ");


Label n3=new Label("Process            Burst time              Waiting time                     Turnaround time   ");
Label tq=new Label("Time Quantum");


Label h2=new Label();

Label h3=new Label();

Label h4=new Label();


Label d1=new Label("No. of processes");


Choice l1=new Choice();


Label l=new Label();


Label p=new Label("Enter Burst times of the processes");

Label p1=new Label("Process 1");

Label p2=new Label("Process 2");

Label p3=new Label("Process 3");

Label p4=new Label("Process 4");

Label p5=new Label("Process 5");

Label lbl=new Label("                  Enter all the values");



Frame wrn=new Frame("Warning !!! ");

Frame max=new Frame();

Frame next= new Frame("Round Robin Output");



Font font1=new Font("Ariel",Font.ITALIC,18);

Font font2=new Font("Forte",Font.ITALIC,22);

Font font3 = new Font( "Comic Sans MS", Font.BOLD, 16 );

Font font4 = new Font( "Comic Sans MS", Font.ITALIC, 14 );

Font font5 = new Font( "Comic Sans MS", Font.ITALIC, 12 );

   

RoundRobin()
  {
   
max.setSize(650,650);
   
max.setTitle("Round Robin Scheduling Algorithm");
   

x.setSize(650,650);
   
x.setLayout(new GridLayout(11,2,10,10));
   
x.setBackground(c17);
   
max.setVisible(true);
max.add(x);



b1.setBackground(Color.orange);

b1.setForeground(Color.blue);

b2.setBackground(Color.orange);

b2.setForeground(Color.blue);

b3.setBackground(Color.orange);

b3.setForeground(Color.blue);



h1.setFont(font2);
n1.setFont(font1);
n1.setForeground(Color.red);

t7.setForeground(Color.red);
t7.setBackground(c19);
tq.setForeground(c18);
h1.setForeground(Color.blue);

d1.setForeground(Color.red);

p.setForeground(Color.red);

p.setFont(font4);
p1.setForeground(Color.blue);

p2.setForeground(Color.blue);

p3.setForeground(Color.blue);

p4.setForeground(Color.blue);

p5.setForeground(Color.blue);
d1.setFont(font4);



l1.add("1");

l1.add("2");

l1.add("3");

l1.add("4");

l1.add("5");


l1.setBackground(Color.yellow);

l1.setForeground(Color.blue);



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

t6.setBackground(Color.yellow);

t6.setForeground(Color.blue);



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


RoundRobin(String s)
{
  
super(s);

}


public void actionPerformed(ActionEvent ae)
{


int a=Integer.parseInt(l1.getSelectedItem());
 
if(ae.getSource()==b1)
{

x.add(p);

x.add(h4);

if(a==1){

x.add(p1);

x.add(t1);

x.add(tq);

x.add(t7);

}

if(a==2)
 {

x.add(p1);

x.add(t1);

x.add(p2);

x.add(t2);

x.add(tq);

x.add(t7);

}

if(a==3){

x.add(p1);

x.add(t1);

x.add(p2);

x.add(t2);

x.add(p3);

x.add(t3);

x.add(tq);

x.add(t7);

}

if(a==4){

x.add(p1);

x.add(t1);

x.add(p2);

x.add(t2);

x.add(p3);

x.add(t3);

x.add(p4);

x.add(t4);

x.add(tq);

x.add(t7);

}

if(a==5){

x.add(p1);

x.add(t1);

x.add(p2);

x.add(t2);

x.add(p3);

x.add(t3);

x.add(p4);

x.add(t4);

x.add(p5);

x.add(t5);

x.add(tq);

x.add(t7);

}

x.add(b2);

x.add(b3);

}  
      

if(ae.getSource()==b2)
{ 
if(a==1){
      
try{
      
if(t1.getText().equals("")||(t7.getText().equals("")
))    
throw new RoundRobin("Warning !!");
      
else{
      
y=y+(2*10);
      
bt[1]=Integer.parseInt(t1.getText());
ts=Integer.parseInt(t7.getText());
    
rbt[1]=bt[1];
      
this.display(a);
      
this.output();

}

}

catch (RoundRobin e){

this.warn();

}

}


if(a==2)
 {

try{
  
if((t1.getText().equals(""))||(t2.getText().equals(""))||(t7.getText().equals(""))){
   
throw new RoundRobin("Warning !! ");

}
 
else{
   
y=y+(2*10);
 
bt[1]=Integer.parseInt(t1.getText());

bt[2]=Integer.parseInt(t2.getText());
ts=Integer.parseInt(t7.getText());


rbt[1]=bt[1];

rbt[2]=bt[2];
      
this.display(a);
       
this.output();

}

}

catch (RoundRobin e){

this.warn();

}

}

if(a==3){

try{
    
if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t7.getText().equals(""))){

throw new RoundRobin("Warning !!");

}

else{
  
y=y+(2*10);

bt[1]=Integer.parseInt(t1.getText());
      
bt[2]=Integer.parseInt(t2.getText());
      
bt[3]=Integer.parseInt(t3.getText());
ts=Integer.parseInt(t7.getText());

      
rbt[1]=bt[1];
      
rbt[2]=bt[2];
      
rbt[3]=bt[3];
    
this.display(a);
       
this.output();

}

}

catch (RoundRobin e){

this.warn();

}

}

if(a==4){

try{
   
if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||(t7.getText().equals("")))
{
   
throw new RoundRobin("Warning !!");

}

else{
  
y=y+(2*10);

bt[1]=Integer.parseInt(t1.getText());
      
bt[2]=Integer.parseInt(t2.getText());
      
bt[3]=Integer.parseInt(t3.getText());

bt[4]=Integer.parseInt(t4.getText());
ts=Integer.parseInt(t7.getText());

rbt[1]=bt[1];
      
rbt[2]=bt[2];
      
rbt[3]=bt[3];
      
rbt[4]=bt[4];
      
this.display(a);
     
this.output();

}

}

catch (RoundRobin e){

this.warn();

}

}
         
if(a==5){

try{
    
if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||(t5.getText().equals(""))||(t7.getText().equals(""))){

throw new RoundRobin("Warning !!");

}

else{
  
y=y+(2*10);

bt[1]=Integer.parseInt(t1.getText());
      
bt[2]=Integer.parseInt(t2.getText());
      
bt[3]=Integer.parseInt(t3.getText());

bt[4]=Integer.parseInt(t4.getText());

bt[5]=Integer.parseInt(t5.getText());

ts=Integer.parseInt(t7.getText());

rbt[1]=bt[1];
      
rbt[2]=bt[2];
      
rbt[3]=bt[3];
      
rbt[4]=bt[4];
      
rbt[5]=bt[5];
      
this.display(a);
       
this.output();

}

}

catch (RoundRobin e){

this.warn();

}

}

}

if(ae.getSource()==btn){


wrn.remove(lbl);

wrn.remove(btn);

wrn.dispose();

}

if(ae.getSource()==b3)
{

max.dispose();

}

if(ae.getSource()==b4)
{

max.dispose();
next.dispose();
}

}

void warn() {


wrn.setSize(250,150);

wrn.setVisible(true);

wrn.setLayout(new BorderLayout(10,10));

Color newColor9=new Color(100,180,200);

wrn.setBackground(newColor9);

wrn.add(lbl,BorderLayout.CENTER);

wrn.add(btn,BorderLayout.SOUTH);

btn.addActionListener(this);


}

void output(){
 

Color newcolor3=new Color(64,224,208);
      
pan.setBackground(c16);
      
pan.setSize(800,800);
      
pan.setLayout(new GridLayout(y,1,5,5));
 
pan.setVisible(true);
      
next.add(pan);

      
next.setSize(800,800);
      
next.setVisible(true);  

 
next.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent we) {

         max.dispose();
next.dispose();

         }
     }
);

}

void display(int a)
{
  
Label l=new Label("      ");

pan.add(n1);

pan.add(n2);

pan.add(l);



pan.add(l);
for(i=1;i<=a;i++)
 {
     
pro[i]=i;
 
}
int g;
g=bt[1];
for(i=1;i<=a;i++)
{

g=big;
if(bt[i]>big)
    
big=bt[i];
  
}

temp=big/ts;
while(j<(temp+1))
   {
     
for(i=1;i<=a;i++)
     { 
      
if(rbt[i]==0)
      {
        
continue;
      
}
      
else if(rbt[i]>ts)
      
{
        
st[i]=rbt[i];
        
rbt[i]=rbt[i]-ts;
 
cpu=cpu+ts;
      
}

      
else if(rbt[i]<=ts)
      {
        
st[i]=rbt[i];
        
tm=rbt[i];
 
rbt[i]=0;
        
cpu=cpu+tm;
      
}
      
str1=Integer.toString(pro[i]);

str2=Integer.toString(st[i]);

str3=Integer.toString(rbt[i]);

str4=Integer.toString(cpu);
Label n4=new Label("P["+str1+"]"+"                          "+str2+"                                     "+str3+"                                        "+str4);


n4.setForeground(c15);

pan.add(n4);

n4.setFont(font5);
if(rbt[i]==0)
{
      
tat[i]=cpu;
      
wt[i]=tat[i]-bt[i];
      
twt=twt+wt[i];
      
ttat=ttat+tat[i];
     
}

}

j++;

}
pan.add(l);
pan.add(l);

pan.add(l);
pan.add(n3);
for(i=1;i<=a;i++){
str10=Integer.toString(pro[i]);

str11=Integer.toString(bt[i]);
str12=Integer.toString(wt[i]);
str13=Integer.toString(tat[i]);
Label n16=new Label("P["+str10+"]"+"                          "+str11+"                                     "+str12+"                                        "+str13);


pan.add(n16);
n16.setFont(font5);
n16.setForeground(Color.blue);


}
pan.add(l);

pan.add(l);

pan.add(l);


avwt=(float)twt/a;

avtat=(float)ttat/a;

double th= (double)a/ttat;


str5=Integer.toString(twt);

str6=Integer.toString(ttat);

str7=Float.toString(avwt);

str8=Float.toString(avtat);

String str9=Double.toString(th);

Label n6=new Label("Total waiting time:      "+str5);

Label n7=new Label("Total turnaround time:      "+str6);

Label n8=new Label("Avg. waiting time:      "+str7);

Label n9=new Label("Avg. Turnaround time:      "+str8);

Label n10=new Label("Throughput: "+str9);


n10.setForeground(Color.red);

Color c1=new Color(200,50,180);
n2.setForeground(c1);
n3.setForeground(c1);
n6.setForeground(Color.red);

n7.setForeground(Color.red);

n8.setForeground(Color.red);

n9.setForeground(Color.red);
pan.add(n6);

pan.add(n7);

pan.add(n8);

pan.add(n9);

pan.add(n10);



b4.setBackground(Color.pink);

b4.setForeground(Color.blue);

pan.add(b4);

}

public static void main(String args[]) 
{

RoundRobin m1=new RoundRobin();

}

}







