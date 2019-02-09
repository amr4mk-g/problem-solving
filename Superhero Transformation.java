import java.util.Scanner;
public class superhero{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String s=in.nextLine();
String t=in.nextLine();
boolean[] v=new boolean[s.length()];
char[] q= {'a','e','i','u','o'};
if(s.length()==t.length()){
for(int i=0;i<s.length();i++){
boolean w=false;
for(char c:q){if(c==s.charAt(i)){w=true; break;}}
if(w){boolean e=false;
for(char c:q){if(c==t.charAt(i)){e=true; break;}}
if(e){v[i]=true;}
else{v[i]=false;}
}else{boolean p=false;
for(char c:q){if(c==t.charAt(i)){p=true; break;}}
if(p){v[i]=false;}
else{v[i]=true;}
}}int m=0;
for(boolean c:v){if(c==false){m++; break;}}
if(m==0){System.out.print("Yes");}
else{System.out.print("No");}
}else{System.out.print("No");}
}}