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
public class Grifinoria extends Casa implements Treta{

    
    String espada;
    
    
    @Override
    public void brigar() {        
        pontuacao = (int) ( pontuacao - (pontuacao*0.1) );
    }
    
    public abstract void entrar(){
        System.out.println("O Fundador da casa é: " + fundador + " e é necessário " + caracteristica + " para entar.");
    }
    
    public abstract void mostraInfo(){
        super.mostraInfo();
        System.out.println("Espada: " + espada);
    }
    
    
}
