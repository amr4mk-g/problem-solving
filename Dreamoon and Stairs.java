import java.util.Scanner;
public class Dreamoon{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();
if(m>n)
{System.out.print("-1");}
else{
int w=0;
for(int i=m;i<=n;i+=m)
{ if((i*2)>=n){w=i;  break;} }
if(w!=0){System.out.print(w);}
else {System.out.print("-1");} }
}}