import java.util.Scanner;
public class Hate{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String ss=s.replaceAll("a", "");
boolean z=false;
int t=0,w=0;
if(ss.length()%2==0)
{for(int i=0;i<ss.length()/2;i++)
{if(ss.charAt(i)==ss.charAt((ss.length()/2)+i)){t++;}
if(s.charAt(s.length()-(i+1))==ss.charAt(ss.length()-(i+1))){w++;}}
if(t==ss.length()/2){z=true;}
if(w!=ss.length()/2){z=false;}}
if(z==false){System.out.print(":(");}
else{
System.out.print(s.substring(0,s.length()-w));}
}}
