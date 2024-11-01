/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        String nombresCliente;
        double costoCPU;
        double costoTeclado;
        double costoRaton;
        double costoPantalla;
        double costoTotal;
        
        System.out.println("ingrese los nombres del cliente");
        nombresCliente = entrada.nextLine();
        System.out.println("ingrese el costo de la CPU");
        costoCPU = entrada.nextDouble();
        System.out.println("ingrese el costo del teclado");
        costoTeclado = entrada.nextDouble();
        System.out.println("ingrese el costo del ratón");
        costoRaton = entrada.nextDouble();
        System.out.println("ingrese el costo de la pantalla");
        costoPantalla = entrada.nextDouble();
        
        costoTotal = costoCPU + costoTeclado + costoRaton + costoPantalla;
        
        System.out.printf("Reporte:\nNombres del cliente: %s\nValores Iniciales"
                + "\nCPU: $ %.2f\nTeclado: $ %.2f\nRatón: $ %.2f\nPantalla: $ "
                + "%.2f\n\nValor a cancelar: $%.2f",nombresCliente, costoCPU, 
                costoTeclado, costoRaton, costoPantalla, costoTotal);
        
        
        
    }
    
}
