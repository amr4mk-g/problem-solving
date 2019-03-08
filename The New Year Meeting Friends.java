import java.util.Scanner;
public class meeting{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int x1=in.nextInt();
int x2=in.nextInt();
int x3=in.nextInt();
int u1=Math.abs(x2-x1)+Math.abs(x3-x1);
int u2=Math.abs(x1-x2)+Math.abs(x3-x2);
int u3=Math.abs(x1-x3)+Math.abs(x2-x3);
System.out.print(Math.min(Math.min(u1, u2), u3));
}}