import java.util.Scanner;
public class word{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String x=in.nextLine();
int u=0,o=0;
for(int i=0;i<x.length();i++){
if(Character.isUpperCase(x.charAt(i)))
{u++;}else{o++;} }
if(u<=o){x=x.replace("([A-Z])", "$1").toLowerCase();}
else{x=x.replace("([A-Z])", "$1").toUpperCase();}
System.out.println(x);
}}