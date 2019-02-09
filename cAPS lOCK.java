import java.util.Scanner;
public class caps{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String x=in.nextLine();
int c=0,s=0;
for(int i=1;i<x.length();i++){
if(Character.isUpperCase(x.charAt(i))){c++;}
if(Character.isLowerCase(x.charAt(i))){s++;}}
if(c==0&&s==0&&Character.isUpperCase(x.charAt(0)))
{System.out.print(x.replace("[A-z}", "$1").toLowerCase());}
else if(c==0&&s==0&&Character.isLowerCase(x.charAt(0)))
{System.out.print(x.replace("[A-z}", "$1").toUpperCase());}
else if(c==(x.length()-1)&&Character.isUpperCase(x.charAt(0))){
System.out.print(x.replace("[A-z}", "$1").toLowerCase());}
else if(c==(x.length()-1)&&Character.isLowerCase(x.charAt(0))){	
String j=Character.toUpperCase(x.charAt(0))+"";
for(int i=1;i<x.length();i++){
j=j+(Character.toLowerCase(x.charAt(i)));}
System.out.print(j);}
else if(s==(x.length()-1)&&Character.isUpperCase(x.charAt(0))){
System.out.print(x);}
else if(s==(x.length()-1)&&Character.isLowerCase(x.charAt(0))){
System.out.print(x);}
else if(c!=(x.length()-1)&&s!=(x.length()-1)){System.out.print(x);}
}}