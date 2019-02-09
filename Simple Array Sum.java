import java.util.Scanner;
public class simple{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int x=in.nextInt();
int[] y=new int[x];
for(int i=0;i<x;i++)
{y[i]=in.nextInt();}
int sum=0;
for(int i=0;i<x;i++)
{sum=sum+y[i];}
System.out.print(sum);
}}