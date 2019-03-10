import java.util.Scanner;
public class George{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int[][] z=new int[n][2];
for(int i=0;i<n;i++){
z[i][0]=in.nextInt();
z[i][1]=in.nextInt();}
int[] t=new int[n];
for(int i=0;i<n;i++){
t[i]=z[i][1]-z[i][0];}
int u=0;
for(int i=0;i<n;i++){
if(t[i]>=2){u++;}}
System.out.print(u);
}}