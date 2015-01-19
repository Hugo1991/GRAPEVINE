/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;
import akka.actor.UntypedActor;
import java.util.ArrayList;
/**
 *
 * @author Hugo
 */
public class Participante extends UntypedActor {
    private String nombre;
    private String direccion;
    private Agenda agenda;
    
    public Participante(){}
    public Participante(String nombre,String direccion,Agenda agenda)throws ErrorDatos{
        setNombre(nombre);
        setAgenda(agenda);
        setDireccion(direccion);
    }
    
    public void setNombre(String nombre)throws ErrorDatos{
        if(nombre!=null)
            this.nombre=nombre;
        else
            throw new ErrorDatos("Datos Vacios");
    }
    
    
    //Poner la condiccion correspondiente
    private void setAgenda(Agenda agenda){
        this.agenda=agenda;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    
    ///------------------------------------------------------------///
    ///--------              UntipedActor            --------------///
    ///------------------------------------------------------------///
    public void emitirCita(){
        Reunion cita = new Reunion();
    }
    @Override
    public void onReceive(Object reunion)throws Exception{
    //Comprobar Disponibilidad; yes = se guarda cita en reunion
        Reunion reunion1=(Reunion) reunion;
        if(!agenda.comprobar(reunion1)){
            Cita cita = new Cita();
            //añadir reunion a cita
            //añadir participantes a cita
        }
        
    }
    
    
}
