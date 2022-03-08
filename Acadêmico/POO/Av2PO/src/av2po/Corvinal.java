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
public class Corvinal extends Casa implements Biblioteca, Detencao {

    String diadema;

    public void entrar() {
    System.out.println("O Fundador da casa é: " + c1.fundador + " e é necessário " + c1.caracteristica + " para entar.");
    }

    public void mostraInfo() {

    }

    @Override
    public void pesquisar() {
    System.out.println("Os alunos da casa Cornival estão na biblioteca estudando e pesquisando");
    }

    @Override
    public void matarAula() {
        // fazer funcao de decremento de 50 unidades
        System.out.println("Os alunos estavam matando aula na festa");
    }

}
