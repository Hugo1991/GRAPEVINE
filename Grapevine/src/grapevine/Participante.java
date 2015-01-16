/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

/**
 *
 * @author Hugo
 */
public class Participante  {
    private String nombre;
    private String Direccion;
    private Agenda agenda;
    
    public Participante(){}
    public Participante(String nombre,String direccion,Agenda agenda)throws ErrorDatos{
        setNombre(nombre);
        setAgenda(agenda);
        setDireccion(direccion);
    }
    
    private void setNombre(String nombre)throws ErrorDatos{
        if(nombre!=null)
            this.nombre=nombre;
        else
            throw new ErrorDatos("Datos Vacios");
    }
    
    
    //Poner la condiccion correspondiente
    private void setAgenda(Agenda agenda){
        this.agenda=agenda;
    }
    private void setDireccion(String direccion){
        this.Direccion=direccion;
    }
    
    
    ///------------------------------------------------------------///
    ///--------              UntipedActor            --------------///
    ///------------------------------------------------------------///
    public void emitirCita(){
        Cita cita = new Cita();
    }
    
    public void onReceive(Object cita){
    //Comprobar Disponibilidad; yes = se guarda cita en reunion
    }
    
    
}
