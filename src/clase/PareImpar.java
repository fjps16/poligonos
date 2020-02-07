/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author l11m16
 */
public class PareImpar {
     public static void main(String[] args) {   
           int n =0;
           n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
   
           if(n%2==0){
                System.out.println("Numero par es: "+n);
           
           }else{
                System.out.println("Numero impar es: "+n);
           }
    }
    
}
