/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author l11m16
 */
public class PruebaFactura {
    public static void main(String[] args) {    
   
   Factura f = new Factura(1,100);
   //f.setCodigo(1);
   //f.setSubtotal(100); 
   
   f.CalcularTotal();
   double total = f.getTotal();
   System.out.println("TOTAL: "+total);
   }
}
    

