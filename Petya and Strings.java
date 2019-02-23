import java.util.Scanner;
public class petya{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String x=in.nextLine();
String y=in.nextLine();
x=x.toLowerCase();
y=y.toLowerCase();
if(x.compareTo(y)==0){System.out.print("0");}
else if(x.compareTo(y)>0){System.out.print("1");}
else if(x.compareTo(y)<0){System.out.print("-1");}
}}