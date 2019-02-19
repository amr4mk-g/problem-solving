import java.util.Scanner;
public class water{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int x=in.nextInt();
long[][] y=new long[x][3];
for(int i=0;i<x;i++){
for(int j=0;j<3;j++){
y[i][j]=in.nextLong();}}
long[] u=new long[x];
for(int i=0;i<x;i++){
if(y[i][0]==1){u[i]=y[i][1];}
else if((y[i][0]*y[i][1])<=((y[i][0]/2)*y[i][2])+((y[i][0]%2)*y[i][1]))
{u[i]=y[i][0]*y[i][1];}
else if((y[i][0]*y[i][1])>((y[i][0]/2)*y[i][2])+((y[i][0]%2)*y[i][1]))
{u[i]=((y[i][0]/2)*y[i][2])+((y[i][0]%2)*y[i][1]);}}
for(int i=0;i<x;i++)
{System.out.println(u[i]);}
}}