import java.util.Scanner;
public class diagonal{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int x=in.nextInt();
int[][] y=new int[x][x];
for(int i=0;i<x;i++)
for(int ii=0;ii<x;ii++)
{{y[i][ii]=in.nextInt();}}
int s1=0,s2=0;
for(int i=0;i<x;i++){s1+=y[i][i];}
int u=x-1;
for(int i=0;i<x;i++){
if(u>=0){s2+=y[i][u];}
u--;}
System.out.print(Math.abs(s1-s2));
}}