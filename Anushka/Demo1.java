package Anushka;



public class Demo1 extends Abstract_demo1
{

	   public void anotherMethod() 
	   { 
	        System.out.print("Abstract method"); 
	   }
	   public static void main(String args[])
	   { 
	      //error: You can't create object of it
	      Abstract_demo1 obj = new Demo1(); //object obj
	      // left hand side will be abstract class 
	      // Right hand side we will use that class that provide body to abstract method
	      obj.anotherMethod();// abstract method
	      System.out.println(" ");
	      obj.myMethod(); //normal method
	   }
}