/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Hugo
 */
public class Agenda {
    private ArrayList<Cita> citas;
    public Agenda(){}
    public Agenda(ArrayList<Cita> citas){
        if (citas != null){
            for(Cita c:citas)
                setCita(c);
        }else{
            new ArrayList();
        }
    }
    
    public void setCita(Cita c){
        citas.add(c);
    }
    
    
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Reuniones:\n");
        for(Cita c:citas)
            sb.append(c.toString()+"\n");
        return sb.toString();
    }
    public ArrayList<Cita> getReunion(){
        return citas;
    }
    public boolean comprobar(Reunion reunion){
        // buscar citas en las reuniones ----------------------------------++
        boolean encontrado = false;
        Iterator i = citas.iterator();
        do{
            Cita c= (Cita)i.next();
            if(c.getreunion().getFecha() == reunion.getFecha())
                encontrado = true;
        }while(i.hasNext()& !encontrado);
        return true;
    }
    private void activar(){
    
    }
    
    public void borrarCita(Cita cita){
    
     // Borrar Reunion -----------------------------------------------------
    }
}
