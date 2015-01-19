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
public class Cita {
    private ArrayList <Participante> participantes;
    private Reunion reunion;
    
    // DUDA de 1 en 1 o varios ???????????????????????????????????????
    public Cita(){}
    public Cita(ArrayList <Participante> p,Reunion r){
        setCita(r);
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
    
    public void setCita(Reunion reunion){
        this.reunion=reunion;
    }
    
    public Reunion getreunion(){
        return reunion;
    }
    public ArrayList<Participante> getParticipantes(){
        return participantes;
    }
}
