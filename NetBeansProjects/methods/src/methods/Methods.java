/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author STUDENT
 */
public class Methods {

    /**
     * @param args the command line arguments
     * 
     */
    public static int sum( int k, int m){
        
        int sum=0;
        for(int i=k; i<=m; i++)
            sum +=i;
        return sum;
    }
    public static void min(int num1, int num2){
        if(num1 < num2)
            System.out.println("the minmum is:"+num1);
          
        else
           System.out.println("the minmum is:"+num2); 
    }
            
    public static double max(double num1, double num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        for(int i=1; i<=10; i++)
            sum +=i;
        System.out.println("this is the sum of 1 to 10:" + sum(1,10));
        System.out.println("this is the sum of 20 to 35:" + sum(20,35));
        System.out.println("this is the sum of 100 to 250:"+ sum(100,250));
        
        System.out.println("this is the max value of 53.7 and 30.8 :"+max(53.7,30.8));
          max(5,3); min(10,7);
    }
    
}
