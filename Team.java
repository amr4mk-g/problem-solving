import java.util.Scanner;
public class team{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int[] x=new int[n];
for(int i=0;i<n;i++){
int d1=in.nextInt();
int d2=in.nextInt();
int d3=in.nextInt();
x[i]=d1+d2+d3;}
int u=0;
for(int i=0;i<x.length;i++){
if(x[i]>=2){u++;}}
System.out.print(u);
}}