import java.util.Scanner;
public class soldier{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int k=in.nextInt();
int n=in.nextInt();
int w=in.nextInt();
int sum=0;
for(int i=1;i<=w;i++){
sum=sum+(k*i);}
if(sum-n<0){System.out.println(0);}
else{System.out.println(sum-n);}
}}