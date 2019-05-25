package test2;
import java.util.Scanner;
public class Atest3{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int b=in.nextInt();
int n=in.nextInt();
int m=in.nextInt();
int[] n1=new int[n];
int[] m1=new int[m];
for(int i=0;i<n;i++)
{n1[i]=in.nextInt();}
for(int i=0;i<m;i++)
{m1[i]=in.nextInt();}
int max=-1;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
int u=n1[i]+m1[j];
if(u<=b&&u>max)
{max=u;}
}}
System.out.print(max);
}}