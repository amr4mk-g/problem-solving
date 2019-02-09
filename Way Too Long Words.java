import java.util.Scanner;
public class way{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int y=in.nextInt()+1;
String[] x=new String[y];
for(int i=0;i<y;i++){
x[i]=in.nextLine(); }
for(int i=0;i<y;i++){
if(x[i].length()<=10)
{System.out.println(x[i]);}
else{ String v="";
for(int ii=0;ii<x[i].length();ii++){
v = ""+x[i].charAt(0)+(x[i].length()-2)+x[i].charAt(x[i].length()-1);}
System.out.println(v); 
}}
}}