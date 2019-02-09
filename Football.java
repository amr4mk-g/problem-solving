import java.util.Scanner;
public class football{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String y=in.nextLine();
int x=0,u=0;
if(y.length()<7){System.out.print("NO");}
else{for(int i=0;i<(y.length()-1);i++){
if(y.charAt(i)==y.charAt(i+1)){ x++;
if(x==6){u=1; break;}
}else {x=0;} }
if(u==1){System.out.print("YES");}
else{System.out.print("NO");} }
}}