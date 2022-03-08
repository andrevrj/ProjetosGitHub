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
public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferêcia no Google Plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Google Plus");
    }

    @Override
    public void postaFoto() {
        System.out.println("Postou uma foto no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou um post no Google Plus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Google Plus");
    }
    
}
