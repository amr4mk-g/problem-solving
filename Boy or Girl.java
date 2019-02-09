import java.util.Scanner;
public class boy{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String x=in.nextLine();
StringBuilder sb = new StringBuilder();
x.chars().distinct().forEach(c -> sb.append((char) c));
if(sb.length()%2==0)
{System.out.print("CHAT WITH HER!");}
else{System.out.print("IGNORE HIM!");}
}}