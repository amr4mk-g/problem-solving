import java.util.Scanner;
public class username{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int x=in.nextInt();
int[] y=new int[x];
for(int i=0;i<x;i++){
y[i]=in.nextInt();}
int u=0,c1=0,c2=0;
for(int i=1;i<x;i++){
for(int i2=0;i2<i;i2++){
if(y[i]>y[i2]){c1++;}
if(y[i]<y[i2]){c2++;}
}if(c1==i||c2==i){u++;}c1=c2=0;}
System.out.print(u);
}}