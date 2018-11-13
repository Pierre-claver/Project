/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        double radius,Area;
                int Diameter;
        System.out.println("THIS CALCULATES "
                + "AREA OF CIRCLE");
                
        // thisis for cosntant values are declared
        final double pi=3.1425;
        radius = 9;
                Scanner input = new Scanner(System.in);
    Area = pi*radius * radius;
    System.out.println("Please enter radius:");
    radius = input.nextDouble();
   System.out.println("this is the area:"+Area);

        System.out.println("THIS CALCULATES "
                + "DIAMETER");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter radius2:");
                int radius2 = input2.nextInt();
        Diameter = radius2 +radius2;

        }
}