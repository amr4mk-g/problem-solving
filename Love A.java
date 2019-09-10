import java.util.Scanner;
public class Love{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String x=in.nextLine();
int u=0;
for(int i=0;i<x.length();i++)
{if(x.charAt(i)=='a'){u++;}}
int y=0;
if(u>(x.length()/2))
{y=x.length();}
else{if(u==1){y=1;}
else{y=(u*2)-1;}}
System.out.print(y);
}} 
