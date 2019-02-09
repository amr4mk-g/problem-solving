import java.util.Arrays;
import java.util.Scanner;
public class birthday{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int w=in.nextInt();
int[] x=new int[w];
for(int i=0;i<w;i++){
x[i]=in.nextInt();}
Arrays.sort(x);
int u=0;
for(int i=w-1;i>0;i--){
if(x[i]==x[i-1]){u++;}else{break;}}
System.out.print(u+1);
}}