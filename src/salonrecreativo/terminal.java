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
public class terminal {
    //atributos
    private int dinero;
    private int creditos;
    private final int tipoCambio = 1; 
    private tarjeta tarjeta;
    private tarjeta tarjeta1;
    private premios premios;
    
    //constructor

    public terminal() {
    }

    public terminal(int dinero, tarjeta tarjeta) {
        this.dinero = dinero;
        this.tarjeta = tarjeta;
    }
    

    public terminal(tarjeta tarjeta, tarjeta tarjeta1) {
        this.tarjeta = tarjeta;
        this.tarjeta1 = tarjeta1;
    }

    public terminal(tarjeta tarjeta, premios premios) {
        this.tarjeta = tarjeta;
        this.premios = premios;
    }

    public terminal(tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    //getter
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public tarjeta getTarjeta() {
        return tarjeta;
    }
    
    public tarjeta getTarjeta1() {
        return tarjeta1;
    }
    
    public premios getPremios() {
        return premios;
    }
    
    
    //metodos
    public void consultaSaldo(){
        System.out.println("La tarjeta "+getTarjeta().getNumeroTarjeta()+" tiene "
            +getTarjeta().getCreditoActual()+" creditos y "+getTarjeta().getSaldoTickets()+" tickets.");
    }
    
    public void transferirDineroAtoB(tarjeta tarjeta, tarjeta tarjeta1){
        int GETcreditoT1 = getTarjeta().getCreditoActual();
        int GETcreditoT2 = getTarjeta1().getCreditoActual();
        
        getTarjeta1().setCreditoActual(GETcreditoT1+GETcreditoT2);
        getTarjeta().setCreditoActual(0);
        
        int GETticketsT1 = getTarjeta().getSaldoTickets();
        int GETticketsT2 = getTarjeta1().getSaldoTickets();
        
        getTarjeta1().setSaldoTickets(GETticketsT1+GETticketsT2);
        getTarjeta().setSaldoTickets(0);
    }    
    
    public void consultaSaldoAB(tarjeta tarjeta, tarjeta tarjeta1){
        System.out.println("La tarjeta "+getTarjeta().getNumeroTarjeta()+" tiene "
            +getTarjeta().getCreditoActual()+" creditos y "+getTarjeta().getSaldoTickets()+" tickets.");
        System.out.println("La tarjeta "+getTarjeta1().getNumeroTarjeta()+" tiene "
            +getTarjeta1().getCreditoActual()+" creditos y "+getTarjeta1().getSaldoTickets()+" tickets.");
    }
    
    public void recargarTarjeta(){
        while(dinero >= tipoCambio){
            getTarjeta().setCreditoActual(getTarjeta().getCreditoActual()+2);
           
        dinero = dinero - tipoCambio;
        }
    }
    
    public void cobrar1erPremio(tarjeta tarjeta){
        
        if (getTarjeta().getSaldoTickets() >= getPremios().getTicketsNecesarios1()){
            if (getPremios().getRecuento1Premios() != 0){
                getTarjeta().setSaldoTickets(getTarjeta().getSaldoTickets()-getPremios().getTicketsNecesarios1());
                getPremios().setRecuento1Premios(getPremios().getRecuento1Premios()-1);
                System.out.println("¡Has ganado el "+getPremios().getNombre1()+"! Quedan "+getPremios().getRecuento1Premios()+" restantes.");
            }
            else {
                System.out.println("Lo siento no tenemos más "+getPremios().getNombre1()+" para repartir por hoy");
            }
        }
        else {
            System.out.println("No tienes tickets suficientes para el "+getPremios().getNombre1());
        }
        
    }
    public void cobrar2oPremio(tarjeta tarjeta){
        
        if ( getTarjeta().getSaldoTickets() >= getPremios().getTicketsNecesarios2()){
            if (getPremios().getRecuento2Premios() != 0){
                getTarjeta().setSaldoTickets(getTarjeta().getSaldoTickets()-getPremios().getTicketsNecesarios2());
                getPremios().setRecuento2Premios(getPremios().getRecuento2Premios()-1);
                System.out.println("¡Has ganado el "+getPremios().getNombre2()+"! Quedan "+getPremios().getRecuento2Premios()+" restantes.");
            }
            else {
                System.out.println("Lo siento no tenemos más "+getPremios().getNombre2()+" para repartir por hoy");
            }
        }
        else {
            System.out.println("No tienes tickets suficientes para el "+getPremios().getNombre2());
        }
    }
    
    public void cobrar3erPremio(tarjeta tarjeta){
        
        if ( getTarjeta().getSaldoTickets() >= getPremios().getTicketsNecesarios3()){
            if (getPremios().getRecuento3Premios() != 0){
                getTarjeta().setSaldoTickets(getTarjeta().getSaldoTickets()-getPremios().getTicketsNecesarios3());
                getPremios().setRecuento3Premios(getPremios().getRecuento3Premios()-1);
                System.out.println("¡Has ganado el "+getPremios().getNombre3()+"! Quedan "+getPremios().getRecuento3Premios()+" restantes.");
            }
            else {
                System.out.println("Lo siento no tenemos más "+getPremios().getNombre3()+" para repartir por hoy");
            }
        }
        else {
            System.out.println("No tienes tickets suficientes para el "+getPremios().getNombre3());
        }
    }

    }
