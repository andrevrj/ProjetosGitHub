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
public class Twitter extends RedeSocial implements Compartilhamento{

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma foto no Twitter!");
    }

    @Override
    public void postaFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou um post no Twitter!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Twitter!");
    }
    
}
