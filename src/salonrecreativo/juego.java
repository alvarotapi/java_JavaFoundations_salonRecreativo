/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonrecreativo;

import java.util.Random;

/**
 *
 * @author FOC
 */
public class juego {
    //atributos
    private final int creditoJuego = 2; //Lo que vale jugar cada vez al juego
    private int ticketsGanados;
    private tarjeta tarjeta;
    
    //constructores
    public juego(tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    //getter and setter
    public tarjeta getTarjeta() {
        return tarjeta;
    }
    
    public int getTicketsGanados() {
        return ticketsGanados;
    }

    public void setTicketsGanados(int ticketsGanados) {
        this.ticketsGanados = ticketsGanados;
    }
    
    //metodos
    public void jugar(){
        
        if (getTarjeta().getCreditoActual() >= creditoJuego){
            
            System.out.println("¡Puedes jugar!");
            getTarjeta().setCreditoActual(getTarjeta().getCreditoActual()-creditoJuego); //Descuenta el precio de la partida
            
            Random rnd = new Random();
            int ticketsGenerados = rnd.nextInt(11);
            getTarjeta().setSaldoTickets(getTarjeta().getSaldoTickets()+ticketsGenerados); //Suma los tickets generados en el juego
            
            System.out.println("La tarjeta "+ getTarjeta().getNumeroTarjeta()+ 
                " ha ganado " + ticketsGenerados + " tickets. Su saldo de tickets actual es "
                + getTarjeta().getSaldoTickets());
        }
        
        else {
            System.out.println("No tienes credito para jugar");
        }
    }
    
    public void ayuda(){
        System.out.println("Este juego tiene un precio de 2 fichas, y puedes ganar hasta 10 tickets.");
    }
    
}
