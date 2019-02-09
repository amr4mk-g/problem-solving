import java.util.Arrays;
import java.util.Scanner;
public class mini{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int[] x=new int[5];
for(int i=0;i<5;i++){
x[i]=in.nextInt();}
long b1=0,b2=0;
Arrays.sort(x);
for(int i=0;i<4;i++){b1+=x[i];}
for(int i=1;i<5;i++){b2+=x[i];}
System.out.print(b1+" "+b2);
}}