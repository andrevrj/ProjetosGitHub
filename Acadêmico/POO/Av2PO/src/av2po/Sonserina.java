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
public class Sonserina extends Casa implements Treta{

    String medalhao;
    
    @Override
    public void brigar() {
        
        
    }
    public abstract void entrar(){
        System.out.println("O Fundador da casa é: " + s1.fundador + " e é necessário " + s1.caracteristica + " para entar.");
    }
    
    public abstract void mostraInfo(){
        
    }
    
}
