

/* File name : Animal.java */
package animals;

interface Animal {
   public void eat();
   public void travel();
}
/* File name : MammalInt.java */

public class MammalInt implements Animal {

   public void eat() {
      System.out.println("Mammal eats food");
   }

   public void travel() {
      System.out.println("Mammal travels long distances");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
} 
