import java.util.Scanner;
public class round{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=in.nextInt();
int[] x=new int[n];
for(int i=0;i<n;i++){
x[i]=in.nextInt();}
int u=0;
for(int i=0;i<n;i++){
if(x[i]>=x[k-1]&&x[i]>0){u++;}}
System.out.print(u);
}}