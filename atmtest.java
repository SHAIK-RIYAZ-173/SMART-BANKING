import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
import java.util.Date;
import java.io.*;
class a{
int x=2000;
void withd() 
{
System.out.println("ENTER THE AMOUNT DO YOU WANT TO WITHDRAW");
Scanner ch= new Scanner(System.in);
int y=ch.nextInt();
if(y>x)
{
System.out.println("TRANSACTION FAILED");
System.exit(0);
}
else
{
System.out.println("ENTER THE PURPOSE");
String p=ch.next();
x=x-y;
System.out.println("YOUR WITHDRAW AMOUNT IS"+y);
System.out.println("## TRANSICATION SUCCESSFULL ##");
Date t=new Date();
String to=t.toString();
try{
FileWriter fw=new FileWriter("abc.txt",true);
BufferedWriter f=new BufferedWriter(fw);
f.write(to);
f.write(p);
f.newLine();
f.close();
f.flush();
}
catch(Exception e)
{
}
}
}
}
class b extends a{
void dep()
{
System.out.println("ENTER THE AMOUNT DO YOU WANT TO DEPOSITE");
Scanner t= new Scanner(System.in);
int i=t.nextInt();
x=x+i;
System.out.println("## YOUR DEPOSITE IS SAFELY DONE ##");
}
void ch()
{
System.out.println("AMOUNT IS "+x);
}
void hn()
{
try{
Desktop d=Desktop.getDesktop();
d.browse(new URI("https://www.bankbazaar.com/personal-loan-customer-care.html"));
}
catch(Exception e)
{
}
}
void mini()
{try
{
FileReader fr=new FileReader("abc.txt");
BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
while(line!=null)
{
System.out.println("details are: "+line);
line=br.readLine();
}
}
catch(Exception e)
{
}
}
void m()
{
int o;
int h=1234;
Scanner m=new Scanner(System.in);
System.out.println("enter ur PIN NO");
int c=m.nextInt();
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
if(c==h)
{
System.out.println("WELCOME TO ROCKING ATM");

while(true)
{
Scanner t=new Scanner(System.in);
System.out.println("1.withdarw");
System.out.println("2.deposit");
System.out.println("3.check balance");
System.out.println("4.helpline number");
System.out.println("5.mini statment");
System.out.println("6.exit");

int j=t.nextInt();
switch(j)
{
case 1:
withd();
break;
case 2:
dep();
break;
case 3:
ch();
break;
case 4:
hn();
break;
case 5:
mini();
break;
case 6:
System.exit(0);
break;
default:
System.out.println("invalid");
}
}
}
else{
System.out.println("WORNG PASSWORD");
}
}}
class c{
public static void main(String [] arg)
{
Scanner l=new Scanner(System.in);
System.out.println("ARE U A NEW USER\n");
String po=l.next();
if(po.equals("yes"))
{
Scanner lo=new Scanner(System.in);
System.out.println("ENTER UR NAME\n");
String q=lo.next();
System.out.println("ENTER UR MOBILE NO\n");
long q1=lo.nextLong();
try{
FileReader fr=new FileReader("pin.txt");
BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
while(line!=null)
{
try
{
System.out.println("please wait ur process is in task to generate account number and pin number\n");
Thread.sleep(8000);
System.out.println("account number is: "+line);
line=br.readLine();
}catch(Exception e){}
}
}
catch(Exception e){}
try{
FileReader r=new FileReader("pino.txt");
BufferedReader bro=new BufferedReader(r);
String lin=bro.readLine();
while(lin!=null)
{
System.out.println("pin number is: "+lin);
lin=bro.readLine();
}
}
catch(Exception e){}
System.out.println("PLEASE RESTART THE CODE\n");
}
else
{
b obj=new b();
obj.m();
}}
}
