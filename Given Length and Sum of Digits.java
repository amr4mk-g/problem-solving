import java.util.Arrays;
import java.util.Scanner;
public class Length{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
int s=in.nextInt();
if(m==1&&s>9||s==0&&m>1)
{System.out.print("-1 -1");
return;}
if(m==1&&s<10)
{System.out.print(s+" "+s);
return;}
String x="";
int u=s;
for(int i=0;i<m;i++) 
{if(u>=9){x+="9"; u-=9;}
else if(u<9){x+=u; u-=u;}}
if(u!=0)
{System.out.print("-1 -1");
return;}
if(x.length()!=m&&(m-x.length())>0)
{char[] ch=new char[m-x.length()];
Arrays.fill(ch, '0');
x+=new String(ch);}
String y="",t=x;
for(int i=(t.length()-1);i>=0;i--)
{y+=t.charAt(i);}
if(y.charAt(0)=='0')
{char[] ch1=y.toCharArray();
ch1[0]='1';
y=new String(ch1);
for(int i=1;i<m;i++) 
{if(y.charAt(i)!='0')
{char[] ch2 = y.toCharArray();
ch2[i]=(char)((int)(y.charAt(i))-1);
y=new String(ch2);
break;}} }
System.out.print(y+" "+x);
}}