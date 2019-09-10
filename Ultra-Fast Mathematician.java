import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String x=in.nextLine();
        String y=in.nextLine();
        String z="";
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!=y.charAt(i))
            {z=z+"1";} else{z=z+"0";}
        }
        System.out.print(z);
    }
}