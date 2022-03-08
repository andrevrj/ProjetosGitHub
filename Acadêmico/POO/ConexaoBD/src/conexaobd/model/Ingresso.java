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
public class Ingresso {
    private int codigo;
    private float valor;
    private int poltrona;
    private String pessoa_rg;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public String getPessoa_rg() {
        return pessoa_rg;
    }

    public void setPessoa_rg(String pessoa_rg) {
        this.pessoa_rg = pessoa_rg;
    }
   
    
    
}
