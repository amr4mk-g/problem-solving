import java.util.Scanner;
import java.util.Arrays;
public class taxi{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int x=in.nextInt();
int[] y=new int[x];
for(int i=0;i<x;i++){
if(in.hasNextInt()){ 
y[i]=in.nextInt();}}
Arrays.sort(y);
int l=0,r=x-1,t=0;
while(l<=r){
int rest = 4;
rest-=y[r];
r--;
while(l<=r && rest>=y[l]){
rest-=y[l];
l++;} t++;}
System.out.println(t);
}}