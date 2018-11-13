class Calculation {
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
   public void division(int x, int y) {
      z = x/y;
      System.out.println("The division between the given numbers:"+z);
   }
}

public class My_Calculation extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) {
      int x = 300, y = 30;
      My_Calculation demo = new My_Calculation();
      demo.addition(x, y);
      demo.Subtraction(x, y);
      demo.multiplication(x, y);
      demo.division(x, y);
   }
}