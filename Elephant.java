import java.util.Scanner;
public class elephant{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
long x=in.nextInt();
if(x<6){System.out.print("1");}
else{long y=x/5;
if(x%5<5&&x%5!=0){
System.out.print(y+1);}
else{System.out.print(y);}}
}}