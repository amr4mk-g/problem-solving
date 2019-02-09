import java.util.Scanner;
public class word{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String x=in.nextLine();
String as="";
as=as+Character.toUpperCase(x.charAt(0));
for(int i=1;i<x.length();i++){
as=as+x.charAt(i);}
System.out.print(as);
}}