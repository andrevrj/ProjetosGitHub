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
public class Usuario {
    
    private String nome;
    private String email;
    
    RedeSocial[] redes = new RedeSocial[50];
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Usuario(RedeSocial[] redesSociais){
            
            redes = redesSociais;
        
    }
            
}
