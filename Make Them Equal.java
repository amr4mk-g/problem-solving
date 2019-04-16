import java.util.Scanner;
import java.util.Arrays;
public class MakeThemEqual{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int x=in.nextInt();
int[] y=new int[x];
for(int i=0;i<x;i++)
{y[i]=in.nextInt();}
int[] z=y;
Arrays.sort(z);
int u=-1;
for(int i=0;i<=z[z.length-1];i++)
{int[] a=new int[3];
a[0]=y[0];
a[1]=y[0]+i;
a[2]=y[0]-i;
int t1=1,t2=1,t3=1;
for(int j=1;j<x;j++)
{if(a[0]==y[j]||a[0]==(y[j]+i)||a[0]==(y[j]-i)){t1++;}
if(a[1]==y[j]||a[1]==(y[j]+i)||a[1]==(y[j]-i)){t2++;}
if(a[2]==y[j]||a[2]==(y[j]+i)||a[2]==(y[j]-i)){t3++;}}
if(t1==x||t2==x||t3==x){u=i; break;}}
System.out.print(u);
}}