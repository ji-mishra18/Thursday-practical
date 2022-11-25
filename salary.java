import java.util.*;
class salary

{

 public static void main(String[]args)

 {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter your basic salary");
  float a=sc.nextFloat();
  float h;
  float d;
  float g;
  float i;
  float n;
  
  h=(a*10)/100;
  d=(a*73)/100;
  g=a+d+h;
  i=(30*g)/100;
  n=g-i;
  
  System.out.println("Basic salary is"+a);
  System.out.println("House rent allowance is-"+h);
  System.out.println("Dearness allowance is-"+d);
  System.out.println("Gross salary is-"+g);
  System.out.println("Income tax is-"+i);
  System.out.println("Net salary is-"+n);
  
  }

}