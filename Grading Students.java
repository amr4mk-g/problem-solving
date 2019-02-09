import java.util.Scanner;
public class grading{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int y=in.nextInt();
int[] x=new int[y];
int[] z=new int[y];
for(int i=0;i<y;i++){
x[i]=in.nextInt();}
for(int i=0;i<y;i++){
int u=1;
while(u*5<x[i]){u++;}
int f=u*5;
if(x[i]>=38&&(f-x[i])<3)
{z[i]=f;}else{z[i]=x[i];}}
for(int i=0;i<y;i++)
{System.out.println(z[i]);}
}}