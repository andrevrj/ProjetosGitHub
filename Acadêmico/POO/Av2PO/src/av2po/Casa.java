/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2po;

/**
 *
 * @author AVRJR
 */
public abstract class Casa {

    protected static int contador;
    protected int codigo;
    protected String fundador;
    protected String animal;
    protected String caracteristica;
    protected int pontuacao;

    Fantasma fanta;

    Casa() {
        codigo = contador++;
    }

    public abstract void entrar();

    public void mostraInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Fundador da casa: " + fundador);
        System.out.println("Animal: " + animal);
        System.out.println("Característica: " + caracteristica);
        System.out.println("Pontuação: " + pontuacao);
    }

}
