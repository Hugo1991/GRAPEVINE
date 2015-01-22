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
    private ArrayList<Cita> reuniones;
    public Agenda(){}
    public Agenda(ArrayList<Cita> reuniones){
        if (reuniones != null){
            for(Cita r:reuniones)
                setReunion(r);
        }else{
            new ArrayList();
        }
    }
    
    public void setReunion(Cita r){
        reuniones.add(r);
    }
    
    
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Reuniones:\n");
        for(Cita r:reuniones)
            sb.append(r.toString()+"\n");
        return sb.toString();
    }
    
    public boolean comprobar(Reunion cita){
        // buscar citas en las reuniones ----------------------------------
        return true;
    }
    private void activar(){
    
    }
    
    public void borrarReunion(Cita reunion){
    
     // Borrar Reunion -----------------------------------------------------
    }
}
