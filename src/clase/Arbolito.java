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
public class Arbolito {
    public static void main(String[] args ){
    System.out.println("\033[31m FELIZ NAVIDAD  ");
    String salida = "";
    
    char[] reemplazo = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    for (int i = 9, j = 9; j > 0; i++, j-- ){
    char asterisco = '*';
    reemplazo[i] = asterisco;
    reemplazo[j] = asterisco;
    salida = new String(reemplazo);
    System.out.println("\033[32m" + salida);
    }
    System.out.println("\033[33m        ***\n\033[33m        ***");
    }
    
}
