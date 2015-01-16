/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.GregorianCalendar;

/**
 *
 * @author Hugo
 */
public class Cita {
    private GregorianCalendar fecha;
    private GregorianCalendar hora;
    private String motivo;
    
    public Cita(){}
    
    public Cita(GregorianCalendar fecha,GregorianCalendar hora,String motivo){
        
    }
    
    private void setFecha(){}
    private void setHora(){}
    private void setMotivo(){}
    
    public GregorianCalendar getFecha(){
        return fecha;
    }
    public GregorianCalendar gethora(){
        return hora;
    }
    public String getMotivo(){
        return motivo;
    }
    
    
}
