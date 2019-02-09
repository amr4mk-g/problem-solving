import java.util.Scanner;
public class theatre{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
double[] x=new double[3];
for(int i=0;i<x.length;i++){
x[i]=in.nextInt();}
double y=Math.ceil(x[0]/x[2])*Math.ceil(x[1]/x[2]);
System.out.print((long) y);
}}