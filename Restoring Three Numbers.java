import java.util.Scanner;
import java.util.Arrays;
public class Restoring{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int[] x=new int[4];
for(int i=0;i<4;i++)
{x[i]=in.nextInt();}
Arrays.sort(x);
System.out.print((x[3]-x[2])+" "+(x[3]-x[1])+" "+(x[3]-x[0]));
}}