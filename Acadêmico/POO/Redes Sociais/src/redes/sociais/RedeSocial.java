/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes.sociais;

/**
 *
 * @author andre
 */
public abstract class RedeSocial {
    
    protected String senha;
    protected int numAmigos;
    
    public abstract void postaFoto();
    
    public abstract void postarVideo();
    
    public abstract void postarComentario();
    
    public void curtirPublicacao(){
        
    }
        
}