import java.util.Arrays;
import java.util.Scanner;
public class helpful{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String x=in.nextLine();
char[] y=new char[x.length()];
for(int i=0;i<x.length();i++){
if(x.charAt(i)!='+'){y[i]=x.charAt(i);}}
Arrays.sort(y);
for(int i=(y.length/2);i<y.length;i++){
System.out.print(y[i]);
if(i!=y.length-1){System.out.print("+");}}
}}
