import java.util.Scanner;
public class Even{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
long n=in.nextLong();
long k=in.nextLong();
long u=0;
if(n%2==0){u=n/2;}
else{u=(n/2)+1;}
if(k<=u)
{System.out.print((k*2)-1);}
else{System.out.print((k-u)*2);}
}}