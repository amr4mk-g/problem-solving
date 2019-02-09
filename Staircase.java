import java.util.Scanner;
public class staircase{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int x=in.nextInt();
for(int i=0;i<x;i++){
for(int j=0;j<x;j++){
if(i+j>=x-1){
System.out.print("#");}
else{System.out.print(" ");}
}System.out.println();}
}}