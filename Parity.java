import java.util.Scanner;
public class parity{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int b=in.nextInt();
int k=in.nextInt();
int[] x=new int[k];
for(int i=0;i<k;i++){
x[i]=in.nextInt();}
int e=0,o=0;
for(int i=0;i<k;i++){
if((x[i]&1)==0){e++;}else{o++;}}
if((b&1)==0)
{System.out.print((x[k-1]&1)==0?"Even":"Odd");}
else{System.out.print((o&1)==0?"Even":"Odd");}
}}