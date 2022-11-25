import java.util.*;
class bill

{

 public static void main(String[]args)

 {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the units consumed");
  int a=sc.nextInt();
  int b;
  
  if(a<=100)
  {
   b=a*10;
   System.out.println("Electricity bill is"+b);
  }
  else if(a<=200)
  {
   b=(100*10)+(a-100)*15;
   System.out.println("Electricity bill is"+b);
  } 
  else if(a<=300)
  {
   b=(100*10)+(100*15)+(a-200)*20;
   System.out.println("Electricity bill is"+b);
  } 
  else if(a<=300)
  {
   b=(100*10)+(100*15)+(a-200)*20;
   System.out.println("Electricity bill is"+b);
  } 
  else if(a>300)
  {
   b=(100*10)+(100*15)+(100*20)+(a-300)*25;
   System.out.println("Electricity bill is"+b);
  } 
 
 }
}