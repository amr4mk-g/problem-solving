import java.math.BigInteger;
import java.util.Scanner;
public class extra{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int y=in.nextInt();
BigInteger x = BigInteger.valueOf(1);
for (int i =1;i<=y;i++)
{x = x.multiply(BigInteger.valueOf(i));}
System.out.println(x);
}}