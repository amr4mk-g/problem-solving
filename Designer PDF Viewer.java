import java.util.Arrays;
import java.util.Scanner;
public class pdf{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int[] x=new int[26];
for(int i=0;i<26;i++){
x[i]=in.nextInt();}
in.nextLine();
String y=in.nextLine();
int[] t=new int[y.length()];
for(int i=0;i<y.length();i++){
switch(y.charAt(i)){
case 'a': t[i]=x[0]; break;
case 'b': t[i]=x[1]; break;
case 'c': t[i]=x[2]; break;
case 'd': t[i]=x[3]; break;
case 'e': t[i]=x[4]; break;
case 'f': t[i]=x[5]; break;
case 'g': t[i]=x[6]; break;
case 'h': t[i]=x[7]; break;
case 'i': t[i]=x[8]; break;
case 'j': t[i]=x[9]; break;
case 'k': t[i]=x[10]; break;
case 'l': t[i]=x[11]; break;
case 'm': t[i]=x[12]; break;
case 'n': t[i]=x[13]; break;
case 'o': t[i]=x[14]; break;
case 'p': t[i]=x[15]; break;
case 'q': t[i]=x[16]; break;
case 'r': t[i]=x[17]; break;
case 's': t[i]=x[18]; break;
case 't': t[i]=x[19]; break;
case 'u': t[i]=x[20]; break;
case 'v': t[i]=x[21]; break;
case 'w': t[i]=x[22]; break;
case 'x': t[i]=x[23]; break;
case 'y': t[i]=x[24]; break;
case 'z': t[i]=x[25]; break;
}}
Arrays.sort(t);
System.out.print(t[t.length-1]*y.length());
}}