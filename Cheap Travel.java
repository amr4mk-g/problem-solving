import java.util.Scanner;
public class cheap{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int[] x=new int[4];
for(int i=0;i<4;i++){
x[i]=in.nextInt();}
int y=(x[0]%x[1])*x[2];
int u=(x[0]/x[1])*x[3];
int r=x[0]*x[2];
if(x[3]<y){y=x[3];}
if(r<u+y){System.out.print(r);}
else{System.out.print(u+y);}
}}