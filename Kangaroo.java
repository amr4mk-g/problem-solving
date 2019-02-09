import java.util.Scanner;
public class kangaroo{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int[] x=new int[4];
for(int i=0;i<x.length;i++){
x[i]=in.nextInt();}
int x1=x[0],x2=x[2];
if(x[2]>x[0]&&x[3]>x[1]){
System.out.print("NO");
}else{
for(int i=1;i<=10000;i++){
x1+=(int) Math.pow(x[1],1);
x2+=(int) Math.pow(x[3],1);
if(x1==x2){break;}}
if(x1==x2){System.out.print("YES");}
else{System.out.print("NO");}}
}}