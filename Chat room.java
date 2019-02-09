import java.util.Scanner;
public class chat{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String x=in.nextLine();
int u=0;
for(int i=0;i<x.length();i++){
if(x.charAt(i)=='h'){
for(int i2=i+1;i2<x.length();i2++){
if(x.charAt(i2)=='e'){
for(int i3=i2+1;i3<x.length();i3++){
if(x.charAt(i3)=='l'){
for(int i4=i3+1;i4<x.length();i4++){
if(x.charAt(i4)=='l'){
for(int i5=i4+1;i5<x.length();i5++){
if(x.charAt(i5)=='o'){u++;}
}}}}}}}}}
if(u==0){System.out.print("NO");}
else{System.out.print("YES");}
}}