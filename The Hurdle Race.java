import java.util.Arrays;
import java.util.Scanner;
public class hurdle{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=in.nextInt();
int[] x=new int[n];
for(int i=0;i<n;i++){
x[i]=in.nextInt();}
Arrays.sort(x);
int u=x[x.length-1]-k;
if(u>0){System.out.print(u);}
else{System.out.print("0");}
}}