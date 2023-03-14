/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonrecreativo;

/**
 *
 * @author FOC
 */
public class tarjeta {
    //atributos
    private int creditoActual;
    private int saldoTickets;
    private int numeroTarjeta;
    static int continuacionTarjeta = 1; //contador de IDs unicos
    
    
    //constructor

    public tarjeta() {
        this.numeroTarjeta = continuacionTarjeta++;
    }

    public tarjeta(int creditoActual, int saldoTickets) {
        this.creditoActual = creditoActual;
        this.saldoTickets = saldoTickets;
        this.numeroTarjeta = continuacionTarjeta++;
    }
    
    //getter

    public int getCreditoActual() {
        return creditoActual;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    //setter

    public void setCreditoActual(int creditoActual) {
        this.creditoActual = creditoActual;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }
    
}
