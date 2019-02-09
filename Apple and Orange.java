import java.util.Scanner;
public class apple{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int[] x=new int[6];
for(int i=0;i<6;i++){
x[i]=in.nextInt();}
int[] m=new int[x[4]];
int[] n=new int[x[5]];
for(int i=0;i<x[4];i++){
m[i]=in.nextInt()+x[2];}
for(int i=0;i<x[5];i++){
n[i]=in.nextInt()+x[3];}
int x1=0,x2=0;
for(int i=0;i<m.length;i++){
if(m[i]<=x[1]&&m[i]>=x[0]){x1++;}}
for(int i=0;i<n.length;i++){
if(n[i]<=x[1]&&n[i]>=x[0]){x2++;}}
System.out.print(x1+"\n"+x2);
}}