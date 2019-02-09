import java.util.Scanner;
public class plus{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int y=in.nextInt();
int[] x=new int[y];
for(int i=0;i<y;i++){
x[i]=in.nextInt();}
double b1=0,b2=0,b3=0;
for(int i=0;i<y;i++){
if(x[i]==0){b3++;}
else if(x[i]<0){b2++;}
else if(x[i]>0){b1++;}}
System.out.printf("%.6f%s%.6f%s%.6f%s",b1/y,"\n",b2/y,"\n",b3/y,"\n");
}}