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
public class premios {
    //atributos
    private final String nombre1 = "primer premio";
    private final String nombre2 = "segundo premio";
    private final String nombre3 = "tercer premio";
    
    private final int ticketsNecesarios1 = 100;
    private final int ticketsNecesarios2 = 50;
    private final int ticketsNecesarios3 = 25;
    
    private int recuento1Premios = 1;
    private int recuento2Premios = 3;
    private int recuento3Premios = 5;
    
    //constructores
    public premios() {
    }
    
    //Getter and setter

    public int getRecuento1Premios() {
        return recuento1Premios;
    }

    public void setRecuento1Premios(int recuento1Premios) {
        this.recuento1Premios = recuento1Premios;
    }

    public int getRecuento2Premios() {
        return recuento2Premios;
    }

    public void setRecuento2Premios(int recuento2Premios) {
        this.recuento2Premios = recuento2Premios;
    }

    public int getRecuento3Premios() {
        return recuento3Premios;
    }

    public void setRecuento3Premios(int recuento3Premios) {
        this.recuento3Premios = recuento3Premios;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public int getTicketsNecesarios1() {
        return ticketsNecesarios1;
    }

    public int getTicketsNecesarios2() {
        return ticketsNecesarios2;
    }

    public int getTicketsNecesarios3() {
        return ticketsNecesarios3;
    }

}
