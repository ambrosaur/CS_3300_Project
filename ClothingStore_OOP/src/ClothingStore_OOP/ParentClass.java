/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClothingStore_OOP;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anam Ali & Reggie Andes
 */
public class ParentClass {
    //variables for the tee shirts
    public double Thestrokes;
    public double Stevelacy;
    public double Clairo;
    public double Greenday;
    
    //this variable is going to be the total amount before tax and shipping
    public double TotalTee;
    public double Shipping;
    public double WholeTotal;
    
    //this calculates the entire amount
    public double Amount()
    {
       TotalTee=Thestrokes+Stevelacy+Clairo+Greenday;
       WholeTotal=TotalTee + Shipping;
       return WholeTotal; 
    }
    // to exit the system
    private JFrame frame;
    
        public void iExitSystem()
        {
            frame = new JFrame("Exit");
            if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit ","AR's Clothing Store", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            {
            System.exit(0);
            }
        }
        
   //prices
   //variables for the tee shirts
    public double pThestrokes = 20.99 ;
    public double pStevelacy = 23.99;
    public double pClairo = 19.99;
    public double pGreenday =25.00 ;
    //variables for the subcription box
    public double pOnemonth;
    public double pThreemonths;
    public double pNinemonth;
    public double pTwelvemonth;
    
    public double tax =0.75;
    public Double findTaxes(double Amount)
    {
        double FindTax = Amount -(Amount* tax); 
        return FindTax;
    }

    // recursion for factorial print out
    public void iFactorial(){
        int num = 8;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

    
}

