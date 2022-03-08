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
public class RedesSociais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Facebook fb = new Facebook();
        fb.numAmigos = 100;
        fb.senha = "5458458";
    
        GooglePlus gp = new GooglePlus();
        gp.numAmigos = 50;
        gp.senha = "999999";
        
        Instagram it = new Instagram();
        it.numAmigos = 500;
        it.senha = "joaozinho1234";
        
        RedeSocial[] rs = new RedeSocial[50];

        rs[0] = fb;
        rs[1] = gp;
        rs[2] = it;
        
        Usuario usa = new Usuario(rs);
        
        usa.setNome("Andre Vieira");
        usa.setEmail("andrevieira@gec.inatel.br");
        
        for (int i = 0; i <usa.redes.length; i++) {
            if (usa.redes[i] != null) {
                if (usa.redes[i] instanceof Facebook){
                    Facebook aux = (Facebook)usa.redes[i];
                    System.out.println(usa.getNome());
                    System.out.println(usa.getEmail());
                    System.out.println("  ");
                    aux.fazStreaming();
                    aux.postaFoto();
                    aux.postarVideo();
                }
            }
        }
        System.out.println("--------------------------");
        for (int i = 0; i <usa.redes.length; i++) {
            if (usa.redes[i] != null) {
                if (usa.redes[i] instanceof GooglePlus){
                    GooglePlus aux2 = (GooglePlus)usa.redes[i];
                    System.out.println(usa.getNome());
                    System.out.println(usa.getEmail());
                    System.out.println("  ");
                    aux2.compartilhar();
                    aux2.postarComentario();
                    aux2.curtirPublicacao();
                }
            }
        }
      
    }
}
