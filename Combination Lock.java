import java.util.Scanner;
public class Combination{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int x=in.nextInt();
in.nextLine();
String x1=in.nextLine();
String x2=in.nextLine();
int[] y=new int[x];
int[] z=new int[x];
int sum=0;
for(int i=0;i<x;i++)
{y[i]=(int)x1.charAt(i);}
for(int i=0;i<x;i++)
{z[i]=(int)x2.charAt(i);}
for(int i=0;i<x;i++)
{int u1=(y[i]>z[i])? y[i]:z[i];
int u2=(y[i]<z[i])? y[i]:z[i];
int e1=u1-u2;
int e2=(9-u1)+(u2+1);
sum +=(e1<e2)? e1:e2;}	
System.out.print(sum);		
}}