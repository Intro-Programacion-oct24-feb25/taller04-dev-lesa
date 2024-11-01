/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double netflix;
        double youtube;
        double dropbox;
        double spotify;

        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;

        double totalNetflix;
        double totalYoutube;
        double totalDropbox;
        double totalSpotify;

        double totalPagar;
        
        System.out.println("Ingrese el costo mensual de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el costo mensual de YouTube Premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el costo mensual de Dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el costo mensual de Spotify");
        spotify = entrada.nextDouble();
        
        descuentoNetflix = netflix * 0.23;
        descuentoYoutube = youtube * 0.23;
        descuentoDropbox = dropbox * 0.45;
        
        totalNetflix = netflix - descuentoNetflix;
        totalYoutube = youtube - descuentoYoutube;
        totalDropbox = dropbox - descuentoDropbox;
        totalSpotify = spotify;
        
        totalPagar = totalNetflix + totalYoutube + totalDropbox + totalSpotify;
        
        System.out.printf("\nReporte:\nNetflix: $%.2f (Descuento aplicado: "
                + "$%.2f) Total: $%.2f\nYouTube Premium: $%.2f (Descuento "
                + "aplicado: $%.2f) Total: $%.2f\nDropbox: $%.2f (Descuento "
                + "aplicado: $%.2f) Total: $%.2f\nSpotify: $%.2f Total: $%.2f\n"
                + "Valor total a pagar mensual: $%.2f\n", netflix, 
                descuentoNetflix, totalNetflix, youtube, descuentoYoutube, 
                totalYoutube, dropbox, descuentoDropbox, totalDropbox, spotify, 
                totalSpotify, totalPagar);
        
    }
    
}
