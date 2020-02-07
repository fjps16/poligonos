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
public class Factura {
    private int codigo;
    private double subtotal;
    private double total;

    
    public Factura(int codigo, double subtotal) {
        this.codigo = codigo;
        this.subtotal = subtotal;
    }
    
    public void CalcularTotal(){
    this.total = this.subtotal * 1.18;
    }

    public Factura() {
    }

    public Factura(int codigo, double subtotal, double total) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
  
    
    }
    
    

