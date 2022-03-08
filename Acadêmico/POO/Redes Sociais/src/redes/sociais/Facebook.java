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
public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento {

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook!");
    }

    @Override
    public void postaFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou um post no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook");
    }
    
    
    
}
