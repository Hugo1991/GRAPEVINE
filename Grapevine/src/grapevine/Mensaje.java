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
public class Mensaje {
    private String emisor;
    private String mensaje;
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    public void setEmisor(String emisor){
        this.emisor=emisor;
    }
    public String getMensaje(){
        return mensaje;
    }
    public String getEmisor(){
        return emisor;
    }
    public String toString(){
        return emisor+": "+mensaje;        
    }
    public void enviarMensaje(String mensaje){
        String msn = mensaje;
    }
    public String editarMensaje(String mensaje){
        this.mensaje=mensaje;
        return this.toString();
    }
}
