/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClothingStore;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anam Ali
 */
public class ClothingSuperclass {
    //variables for the tee shirts
    public double Gunsnroses;
    public double Thestrokes;
    public double Rollingstones;
    public double Stevelacy;
    public double Clairo;
    public double Arcadefire;
    //variables for the subcription box
    public double Onemonth;
    public double Threemonths;
    public double Ninemonth;
    public double Twelvemonth;
    
    //this variable is going to be the total amount before tax and shipping
    public double TotalTee;
    public double Shipping =5.00;
    public double WholeTotal;
    
    //this calculates the entire amount
    public double Amount()
    {
       TotalTee=Gunsnroses+Thestrokes+Rollingstones+Stevelacy+Clairo+Arcadefire;
       WholeTotal=TotalTee + Shipping;
       return WholeTotal; 
    }
    
    private JFrame frame;
    
        public void iExitSystem()
        {
            frame = new JFrame("Exit");
            if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit ","AR's Clothing Store", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            {
            System.exit(0);
            }
        }
}
