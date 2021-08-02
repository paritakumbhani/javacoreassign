package Assignment5;

class Subclass extends Parentclass
{
   void display(){
	System.out.println("Child class method");
   }
   void printMsg(){
	   display();
	   super.display();
   }
   public static void main(String args[]){		
	 Subclass sub = new Subclass();
	 sub.printMsg();
   }
}
