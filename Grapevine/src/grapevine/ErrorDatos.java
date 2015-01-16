/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.io.IOException;

/**
 *
 * @author kaisher
 */
public class ErrorDatos extends IOException {
    public ErrorDatos(){
        super();
    }
    public ErrorDatos(String msn){
        super(msn);
    }
    
}
