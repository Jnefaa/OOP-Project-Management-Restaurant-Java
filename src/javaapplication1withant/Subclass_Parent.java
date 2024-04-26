/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1withant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NJL
 */
public class Subclass_Parent {
    
    
public double chikenburger ;  
public double chikenburgerM ;  
public double BaconCheeseBurger ;  
public double ChikenLengend  ;  
public double Filet_o_fish ; 
 
public double MilkShake ;  
public double VanillaCone ;  
public double VanMilkShake ;  
public double ClassVanilla  ;  
public double ChocoMilk ;

public double Meals ;  
public double Drinks ;  
public double TotalofMD ; 
public double AllTotalofMD ; 

public double pchikenburger = 3.56 ;  
public double pchikenburgerM = 2.95;  
public double pBaconCheeseBurger =3.98;  
public double pChikenLengend =2.65 ;  
public double pFilet_o_fish =3.64; 
 
public double pMilkShake =2.10 ;  
public double pVanillaCone =2.20 ;  
public double pVanMilkShake =2.50 ;  
public double pClassVanilla =1.95 ;  
public double pChocoMilk = 2.37 ;


public double mcTax = 0.90 ;

public double cFindTax (double cAmount) {  
     double findTax = cAmount -(cAmount * mcTax) ; 
     return findTax ; 
}
public double GetAmount() {  
  Meals =   chikenburger + chikenburgerM + BaconCheeseBurger + ChikenLengend + Filet_o_fish  ; 
  Drinks = MilkShake + VanillaCone + VanMilkShake + ClassVanilla + ChocoMilk ;   
  TotalofMD = Meals + Drinks ;
  AllTotalofMD = TotalofMD ; 
  return AllTotalofMD ; 
}
        
private JFrame frame  ;  

public void iExitSystem() {  
    frame = new JFrame ("Exit") ;  
      if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit ","Restaurant Management System " , JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION) {  
          System.exit(0) ; 
      }
             
}

}
