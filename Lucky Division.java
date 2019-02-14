import java.util.Scanner;
public class lucky{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String n=in.nextLine();
int z=0;
for(int i=0;i<n.length();i++){
if(n.charAt(i)=='4'||n.charAt(i)=='7')
{z++;}}
if(z==n.length()){
System.out.print("YES");
}else{
if(Integer.parseInt(n)%4==0||Integer.parseInt(n)%7==0
||Integer.parseInt(n)%47==0||Integer.parseInt(n)%74==0
||Integer.parseInt(n)%44==0||Integer.parseInt(n)%77==0)
{System.out.print("YES");
}else{
System.out.print("NO");
}}
}}