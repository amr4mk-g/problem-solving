import java.util.Scanner;
public class test{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int u=in.nextInt();
int[] x=new int[u];
for(int i=0;i<x.length;i++){
x[i]=in.nextInt();} 
int e=0,o=0;
for(int i=0;i<x.length;i++){
if(x[i]%2==0){e++;}else{o++;}} 
int d=0;
if(e==1){
for(int i=0;i<x.length;i++){
if(x[i]%2==0){d=i; break;}}}
else if(o==1){
for(int i=0;i<x.length;i++){
if(x[i]%2!=0){d=i; break;}}}
System.out.println(d+1); 
}}