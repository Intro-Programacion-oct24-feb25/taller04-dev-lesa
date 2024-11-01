/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        double gastoHijo1;
        double gastoHijo2;
        double gastoHijo3;
        String nombreHijo1;
        String nombreHijo2;
        String nombreHijo3;
        double gastoTotal;
        
        System.out.println("ingrese el nombre del primer hijo");
        nombreHijo1 = entrada.nextLine();
        System.out.println("ingrese gastos el primer hijo");
        gastoHijo1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("ingrese el nombre del segundo hijo");
        nombreHijo2 = entrada.nextLine();
        System.out.println("ingrese gastos del segundo hijo");
        gastoHijo2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("ingrese el nombre del tercer hijo");
        nombreHijo3 = entrada.nextLine();
        System.out.println("ingrese gastos del tercer hijo");
        gastoHijo3 = entrada.nextDouble();
        
        gastoTotal = gastoHijo1 + gastoHijo2 + gastoHijo3;
        
        System.out.printf("el gasto de %s es %.2f \nel gasto de %s es %.2f \n"
                + "el gasto de %s es %.2f \nel gasto total de los tres hijos "
                + "es: %.2f", nombreHijo1, gastoHijo1, nombreHijo2, gastoHijo2, 
                nombreHijo3, gastoHijo3, gastoTotal); 
                
    }
    
}
