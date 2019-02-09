import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class time{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String x=in.nextLine();
if(x.equals("12:00:00AM")){System.out.print("00:00:00");}else{
System.out.print(LocalTime.parse(x, DateTimeFormatter.ofPattern("h:mm:ssa")));}
}}