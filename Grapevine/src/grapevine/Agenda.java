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
public class Agenda {
    private ArrayList<Reunion> reuniones;
    public Agenda(){}
    public Agenda(ArrayList<Reunion> reuniones){
        if (reuniones != null){
            for(Reunion r:reuniones)
                setReunion(r);
        }else{
            new ArrayList();
        }
    }
    
    public void setReunion(Reunion r){
        reuniones.add(r);
    }
    
    
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Reuniones:\n");
        for(Reunion r:reuniones)
            sb.append(r.toString()+"\n");
        return sb.toString();
    }
    
    public boolean comprobar(Cita cita){
        // buscar citas en las reuniones ----------------------------------
        return true;
    }
    private void activar(){
    
    }
    
    public void borrarReunion(Reunion reunion){
    
     // Borrar Reunion -----------------------------------------------------
    }
}
