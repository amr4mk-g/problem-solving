import java.util.Scanner;
public class translation{	
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String x=in.nextLine();
String y=in.nextLine();
String z="";
for(int i=x.length()-1;i>=0;i--){
z=z+x.charAt(i);}
if(y.equals(z)){System.out.println("YES");
}else{System.out.println("NO");}
}}