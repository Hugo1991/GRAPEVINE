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
