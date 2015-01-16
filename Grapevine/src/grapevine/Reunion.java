/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
public class Reunion {
    private ArrayList <Participante> participantes;
    private Cita cita;
    
    // DUDA de 1 en 1 o varios ???????????????????????????????????????
    public Reunion(){}
    public Reunion(ArrayList <Participante> p,Cita c){
        setCita(c);
        if (p!=null){
            for(Participante par:p)
                setParticipante(par);
        }else{
            new ArrayList();
        }
        
    }
    
    public void setParticipante(Participante p){
        this.participantes.add(p);
    }
    
    public void setCita(Cita cita){
        this.cita=cita;
    }
    
    public Cita getCita(){
        return cita;
    }
    public ArrayList<Participante> getParticipantes(){
        return participantes;
    }
}
