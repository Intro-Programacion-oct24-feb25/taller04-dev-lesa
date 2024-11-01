/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        String nombresCompletos;
        String direccion;
        int minutosConsumidos;
        double costoMinuto;
        double valorTotal;
        
        System.out.println("ingrese sus nombres completos");
        nombresCompletos = entrada.nextLine();
        System.out.println("ingrese su dirección");
        direccion = entrada.nextLine();
        System.out.println("ingrese el costo por minuto");
        costoMinuto = entrada.nextDouble();
        System.out.println("ingrese el numero de minutos consumidos");
        minutosConsumidos = entrada.nextInt();
        
        valorTotal = minutosConsumidos * costoMinuto;
        
        System.out.printf("Reporte: \nNombres completos: %s \n\tDireccion: %s "
                + "\nCosto por Minuto: $%.2f \n\tNúmero de minutos consumidos: "
                + "%d \n\t\tValor a cancelar: $%.2f",nombresCompletos, direccion,
                costoMinuto, minutosConsumidos, valorTotal);
        
        
    }
    
}
