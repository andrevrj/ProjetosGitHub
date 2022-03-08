/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.model;

/**
 *
 * @author Usuario
 */
public class Filme {
    private int idFilme;
    private String genero;
    private String nome;
    private String diretor_cpf;

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor_cpf() {
        return diretor_cpf;
    }

    public void setDiretor_cpf(String diretor_cpf) {
        this.diretor_cpf = diretor_cpf;
    }
    
    
    
}

