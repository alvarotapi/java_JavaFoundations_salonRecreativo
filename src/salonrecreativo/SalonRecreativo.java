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
public class SalonRecreativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        tarjeta tarjeta1 = new tarjeta();
        tarjeta tarjeta2 = new tarjeta();
        
        terminal terminal1 = new terminal(10, tarjeta1);
        
        terminal1.consultaSaldo();
        
        terminal1.recargarTarjeta();
        terminal1.consultaSaldo();
        
        terminal terminal2 = new terminal(20, tarjeta2);
        
        terminal2.consultaSaldo();
        
        terminal2.recargarTarjeta();
        terminal2.consultaSaldo();        
        
        juego juego1 = new juego(tarjeta1);
        
        juego1.ayuda();
        
        juego1.jugar();
        juego1.jugar();
        juego1.jugar();
        juego1.jugar();
        juego1.jugar();
        juego1.jugar();
        juego1.jugar();
        juego1.jugar();
        
        terminal1.consultaSaldo();
        
        juego juego2 = new juego(tarjeta2);
        
        juego2.ayuda();
        
        juego2.jugar();
        juego2.jugar();
        juego2.jugar();
        juego2.jugar();
        juego2.jugar();
        juego2.jugar();
        juego2.jugar();
        
        terminal2.consultaSaldo();

        
       
        terminal tr3 = new terminal(tarjeta1, tarjeta2);
        
        tr3.consultaSaldoAB(tarjeta1, tarjeta2);
        
        tr3.transferirDineroAtoB(tarjeta1, tarjeta2);
        
        tr3.consultaSaldoAB(tarjeta1, tarjeta2);
        
        
        premios premio = new premios();
        terminal tr4 = new terminal(tarjeta2, premio);
        tr4.cobrar1erPremio(tarjeta2);
        tr4.cobrar2oPremio(tarjeta2);
        tr4.cobrar3erPremio(tarjeta2);
        
        juego jr1 = new juego(tarjeta1);
        jr1.jugar();
        
        terminal tr5 = new terminal(tarjeta1, premio);
        tr5.cobrar1erPremio(tarjeta1);
        tr5.cobrar2oPremio(tarjeta1);
        tr5.cobrar3erPremio(tarjeta1);
        
    }
    
}
