/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Calcular el area de un poligonos 
  triangulo
  cuadrado
  circulo
  hexagono
*/
public class Poligonos {
    public static Scanner sc = new Scanner(System.in);
    
    public static int menu(){
    int opcion=-1;
    System.out.println("\n\n----------------------------");
    System.out.println("1- Área de un cuadrado");
    System.out.println("2- Área de un triangulo");
    System.out.println("3- Área de un circulo");
    System.out.println("4- Área de un rectangulo");
    System.out.println("5- Área de un hexagono");
    System.out.println("0- Salir");
    System.out.println("Seleccione una opción");
    while(opcion<0){
    try{
    opcion=sc.nextInt();
    }catch(InputMismatchException e){
    System.out.println("El valor tiene que ser númerico...");
    sc.nextLine();
    opcion=-1;
    }
    }
    return opcion;
    }
    
    
    public static double SolicitarValor(String texto){
    while(true){
    try{
    System.out.print(texto);
    return sc.nextDouble();
    }catch(InputMismatchException e){
    System.out.println("El valor tiene que ser númerico...");
    sc.nextLine();
    }
    }
    }
    
    
    public static void main(String[] args) {
       int operador = -1;
       double base=0, altura=0,radio=0;
       while(operador!=0){
       operador=menu();
       switch(operador){
           case 1:base=SolicitarValor("Indica la base o altura: ");
               System.out.println("\n E1 área del cuadrado es " + (base*altura));
               break;
           case 2:base=SolicitarValor("Indica la base: ");
               altura=SolicitarValor("Indica la altura: ");
               System.out.printf("\n El área del triangulo es %1.2f\n", (base*altura)/2);
               break;
           case 3:
               radio=SolicitarValor("Indica el radio: ");
               System.out.printf("\n El área de la circunferencia es %1.2f\n", Math.PI*(Math.pow(radio,2)));
               break;
           case 4:
               base=SolicitarValor("Indica la base: ");
               altura=SolicitarValor("Indica la altura: ");
               System.out.println("\n El área del rectangulo es " + (base*altura));
               break;
           case 5:
               base=SolicitarValor("Indica la base: ");
               altura=SolicitarValor("Indica la altura ");
               System.out.printf("\n El área del hexagono es %1.2f\n", (base*altura)/6);
       }
       }
       sc.close();
    
    }
    
}
