import java.util.Scanner;
public class task{
public static void main(String[] args){
String[] z={"A","a","O","o","Y","y","E","e","U","u","I","i"};
Scanner in = new Scanner(System.in);
String x=in.nextLine();
for(int i=0;i<z.length;i++){
x=x.replaceAll(z[i], "");}
x=x.replaceAll("([A-Z])", "$1").toLowerCase();
for(int i=0;i<x.length();i++){
System.out.print("."+x.charAt(i));}
}}